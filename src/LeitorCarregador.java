import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorCarregador {

    HashMap<String,Personagem> lerpersonagens(String caminhoPersonagens){

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
    
    HashMap<String, Capitulos> lercapitulos(String caminhoCapitulos, HashMap<String, Personagem> personagens , Scanner ler){

        HashMap<String, Capitulos> capitulos = new HashMap<String, Capitulos>();
        File arquivoCapitulos = new File(caminhoCapitulos);  
        
        try 
        {
            Scanner lerArquivoCapitulos =  new Scanner(arquivoCapitulos,"UTF-8");
            String linhaLida = "";
            String nomeCapitulo = "";
            String textoCapitulo = "";
            String nomePersonagem = "";
            int energiaVar = 0;
            int magiaVar = 0;
            
            while(lerArquivoCapitulos.hasNextLine())
            {
                while(!linhaLida.equals("CAPITULO"))
                {
                    linhaLida = lerArquivoCapitulos.nextLine();
                }    
                linhaLida = lerArquivoCapitulos.nextLine(); //Nome:
                nomeCapitulo = lerArquivoCapitulos.nextLine(); //Nome Capitulo
                linhaLida = lerArquivoCapitulos.nextLine(); //Texto:
                textoCapitulo = lerArquivoCapitulos.nextLine(); //Texto Capitulo
                linhaLida = lerArquivoCapitulos.nextLine(); //Personagem:
                nomePersonagem = lerArquivoCapitulos.nextLine(); //Personagem do Capitulo
                linhaLida = lerArquivoCapitulos.nextLine(); //VARIAÇÃO_ENERGIA:
                energiaVar = Integer.parseInt(lerArquivoCapitulos.nextLine()); // Energia Personagem
                linhaLida = lerArquivoCapitulos.nextLine(); //VARIAÇÃO_MAGIA:
                magiaVar = Integer.parseInt(lerArquivoCapitulos.nextLine()); // Magia Personagem 
                Capitulos Cap = new Capitulos();
                Cap.Capitulo(nomeCapitulo, textoCapitulo , personagens.get(nomePersonagem) , energiaVar , magiaVar , ler);
                capitulos.put(nomeCapitulo, Cap);                
            }

            lerArquivoCapitulos.close();
        } 
        catch (FileNotFoundException exception)
        {            
            exception.printStackTrace();
        }

        return capitulos;
    }
}