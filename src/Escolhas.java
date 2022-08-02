import java.util.Scanner;
public class Escolhas 
{
    int escolha;

    int escolher()
    {
        int escolha = -1;

        while(escolha == -1)
        {
           Scanner ler = new Scanner(System.in);
           System.out.println("\nDigite 1  || Digite 2 ");
           int confirmação = ler.nextInt();
           if(confirmação == 1)
           {
            escolha = 1;
           }
           else if(confirmação == 2)
           {
            escolha = 2;
           }
           else
           {
            System.out.println("Tente novamente, opção invalida");
           }
           ler.close();
        }
            
        return escolha;
    }
    
}
