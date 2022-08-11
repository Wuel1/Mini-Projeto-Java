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
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.alterarEnergia(this.alterarEnergia);
        this.personagem.alterarMagia(this.alterarMagia);
        
        if(escolhas != null)
        {
            for (String escolhas : escolhas) 
            {
                System.out.println(escolhas);    
            }

        }

    }
  
}
