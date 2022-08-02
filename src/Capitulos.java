//import java.util.Scanner;

public class Capitulos {
    String nome;
    String texto;
    int escolha1;
    int escolha2;
    Personagem personagem;
    int alterarEnergia;
    int alterarMagia;

    void Capitulo(String nome,
                    String texto,
                    int escolha1,
                    int escolha2,
                    Personagem personagem,
                    int alterarEnergia,
                    int alterarMagia)   
                    
    {

        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
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

    }
    // int escolher()
    // {
    //     int escolha = -1;

    //     while(escolha == -1)
    //     {
    //        Scanner ler = new Scanner(System.in);
    //        System.out.println("\nDigite 1  || Digite 2 ");
    //        var confirmação = ler.nextInt();
    //        if(confirmação == 1)
    //        {
    //         escolha = 1;
    //        }
    //        else if(confirmação == 2)
    //        {
    //         escolha = 2;
    //        }
    //        else
    //        {
    //         System.out.println("Tente novamente, opção invalida");
    //        }
    //        ler.close();
    //     }
            
    //     return escolha;
    // }
}
