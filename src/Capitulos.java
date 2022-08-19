import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;

public class Capitulos {
    String nome;
    String texto;
    ArrayList<Escolhas> escolhas;    
    Personagem personagem;
    int alterarEnergia;
    int alterarMagia;
    Scanner escaneador;   

    void Capitulo(String nome,
                    String texto,                                        
                    Personagem personagem,
                    int alterarEnergia,
                    int alterarMagia,
                    Scanner escaneador)
    {

        this.nome = nome;
        this.texto = texto;              
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
        this.alterarMagia = alterarMagia;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<>();

    }

    void mostrar()
    {
      System.out.println("----------------------------------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.texto);      
        this.personagem.alterarEnergia(this.alterarEnergia);
        this.personagem.alterarMagia(this.alterarMagia);

        if(this.escolhas.size() > 0)
        {
            System.out.println();    
            for (Escolhas escolhas : escolhas) 
            {
                System.out.println("-" + escolhas.texto);    
            }                       
            int escolha = escolher();
            this.escolhas.get(escolha).Próximo.mostrar();                       
        }      

        
      

    }

    int escolher()
    {
        int escolha = -1;

        if(escolhas != null)
        {
            while (escolha == -1)
            {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Digite sua escolha:");                         
                String EscolhaDigitada = escaneador.nextLine(); 

                for(int i = 0; i < escolhas.size(); i++)
                {
                    if(EscolhaDigitada.equals(escolhas.get(i).texto))
                    {
                        escolha = i;
                    }
                    
                }
                System.out.println("Escolha uma opção válida...");
                                
            }
           
            
        }   
     
     

        return escolha;
    }
  
}
