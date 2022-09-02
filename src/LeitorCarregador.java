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
    
}
