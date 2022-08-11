import java.util.Scanner;
public class Escolhas 
{    
    int escolha;

    int escolher(Scanner lerScanner)
    {
        this.escolha = -1;

        while(this.escolha == -1)
        {             
           System.out.println("\nDigite 1 para Primeira escolha || Digite 2 para Segunda escolha ");
           var confirmação = lerScanner.nextInt();
            
           if(confirmação == 1)
           {

            this.escolha = 1;
            
           }

            else if(confirmação == 2)

           {

            this.escolha = 2;
                      
           }
             else
           {
            System.out.println("Tente novamente, opção invalida");
                    
           }
           
        }          
       // System.out.println(this.escolha);
        return this.escolha;
    }
    
}
