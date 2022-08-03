import java.util.Scanner;
public class Escolhas 
{    
    int escolha;

    int escolher()
    {
        this.escolha = -1;

        while(this.escolha == -1)
        {
           Scanner input = new Scanner(System.in);
           System.out.println("\nDigite 1 para Sim || Digite 2 para Não ");
           var confirmação = input.nextInt();
            
           if(confirmação == 1)
           {

            this.escolha = 1;
            input.close();
           }

            else if(confirmação == 2)

           {

            this.escolha = 2;
            input.close();           
           }
             else
           {
            System.out.println("Tente novamente, opção invalida");
            input.close();         
           }
           
        }          
       // System.out.println(this.escolha);
        return this.escolha;
    }
    
}
