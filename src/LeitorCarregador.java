import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorCarregador {

    public HashMap<String,Personagem> lerpersonagens(String caminhoPersonagens){

        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoPersonagens);  
        
        try 
        {
            Scanner lerArquivoPersonagens =  new Scanner(arquivoPersonagens,"UTF-8");
            String linhaLida = "";
            String nomePersonagem = "";
            int energiaPersonagem = 0;
            int magiaPersonagem = 0;
            
            while(lerArquivoPersonagens.hasNextLine())
            {
                while(!linhaLida.equals("PERSONAGEM"))
                {
                    linhaLida = lerArquivoPersonagens.nextLine();
                }
    
                linhaLida = lerArquivoPersonagens.nextLine(); //Nome:
                nomePersonagem = lerArquivoPersonagens.nextLine(); //Nome Personagem
                linhaLida = lerArquivoPersonagens.nextLine(); //Energia:
                energiaPersonagem = Integer.parseInt(lerArquivoPersonagens.nextLine()); // Energia Personagem
                linhaLida = lerArquivoPersonagens.nextLine(); // Magia:
                magiaPersonagem = Integer.parseInt(lerArquivoPersonagens.nextLine()); // Magia Personagem 
                personagens.put(nomePersonagem,new Personagem(nomePersonagem, energiaPersonagem, magiaPersonagem));                
            }

            lerArquivoPersonagens.close();
        } 
        catch (FileNotFoundException exception)
        {            
            exception.printStackTrace();
        }


        return personagens;
    }
    
    public HashMap<String, Capitulos> lercapitulos(String caminhoCapitulos, HashMap<String, Personagem> personagens , Scanner ler){

        HashMap<String, Capitulos> capitulos = new HashMap<String, Capitulos>();
        File arquivoCapitulos = new File(caminhoCapitulos);  
        
        try 
        {
            Scanner lerArquivoCapitulos =  new Scanner(arquivoCapitulos,"UTF-8");
            String linhaLida = "";

            while(lerArquivoCapitulos.hasNextLine())
            {
                while(!linhaLida.equals("CAPITULO_COM_IMAGEM") &&
                      !linhaLida.equals("CAPITULO") &&
                      !linhaLida.equals("ESCOLHA"))
                {
                    linhaLida = lerArquivoCapitulos.nextLine();
                }
                if(linhaLida.equals("CAPITULO_COM_IMAGEM"))
                {                    
                    CapituloImagem Cap = new CapituloImagem(personagens,
                                                            ler,
                                                            capitulos,
                                                            lerArquivoCapitulos);  

                    capitulos.put(Cap.getnome(), Cap);

                    linhaLida = "";
                }
                if(linhaLida.equals("CAPITULO"))
                {                    
                    Capitulos Cap = new Capitulos(personagens,
                                                  ler,
                                                  capitulos,
                                                  lerArquivoCapitulos);                    
                    capitulos.put(Cap.getnome(), Cap);
                    linhaLida = "";
                }
                else if(linhaLida.equals("ESCOLHA"))
                {
                    lerEscolha(personagens, ler, capitulos, lerArquivoCapitulos);
                    linhaLida = "";
                }               
            }

            lerArquivoCapitulos.close();
        } 
        catch (FileNotFoundException exception)
        {            
            exception.printStackTrace();
        }

        return capitulos;
    }


    private void lerEscolha(HashMap<String,Personagem> personagens,
                            Scanner ler,
                            HashMap<String,Capitulos> capitulos,
                            Scanner lerArquivoCapitulos){   
        String cap_Origem = "";
        String escolha = ""; 
        String cap_destino = "";

         lerArquivoCapitulos.nextLine(); // CAPITULO DE ORIGEM:
         cap_Origem = lerArquivoCapitulos.nextLine(); // Nome capitulo origem;
         lerArquivoCapitulos.nextLine(); // TEXTO DA ESCOLHA
         escolha = lerArquivoCapitulos.nextLine(); // Escolha
         lerArquivoCapitulos.nextLine(); // CAPITULO DE DESTINO:
         cap_destino = lerArquivoCapitulos.nextLine(); // Nome capitulo destino;                    
         Capitulos capituloOrigem = capitulos.get(cap_Origem);                    
         Capitulos capituloDestino = capitulos.get(cap_destino);
         capituloOrigem.adicionarEscolha(new Escolhas(escolha,capituloDestino));         
    }
}