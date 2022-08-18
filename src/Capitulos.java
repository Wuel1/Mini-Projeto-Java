//import java.util.Scanner;

public class Capitulos {
    String nome;
    String texto;
    String[] escolhas;    
    Personagem personagem;
    int alterarEnergia;
    int alterarMagia;

    void Capitulo(String nome,
                    String texto,
                    String[] escolhas,                    
                    Personagem personagem,
                    int alterarEnergia,
                    int alterarMagia)   
                    
    {

        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;       
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
        this.alterarMagia = alterarMagia;

    }

    void mostrar()
    {
      System.out.println("----------------------------------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.texto);      
        
        if(escolhas != null)
        {
            System.out.println("\n");    
            for (String escolhas : escolhas) 
            {
                System.out.println("-" + escolhas);    
            }

        }
        else
        {
            System.out.println("\nEsse capítulo não possue escolhas...");
            System.out.println("Aperte Enter para contínuar");
        }

        this.personagem.alterarEnergia(this.alterarEnergia);
        this.personagem.alterarMagia(this.alterarMagia);
      System.out.println("----------------------------------------------------------------------");

    }
  
}
