import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        // Lendo o nome do usuário.

        System.out.println("Olá !! Primeiramente, qual seu nome ?");
        var nome = ler.nextLine();
        System.out.println("Seja Bem vindo "+nome+"! Vamos começar a nossa aventura?" );

        // Lendo a idade do usuário.

        System.out.println("Primeiramente, nos informe a sua idade: ");
        var idade = ler.nextInt();

        // if para acesso ao sistema. > 18

        if(idade>=18){
            System.out.println("Hmmm, interessante! Vejo você já é maior de idade, então pode traçar suas próprias escolhas !");

            // Loop até escolher uma opção válida.
            
            System.out.println("Deseja começar?");
            var controle = 0;
            while(controle == 0){
                System.out.println("Digite 1 para SIM  /// Digite 2 para NÃO");
                var confirmação = ler.nextInt();
                if(confirmação == 1){
                    controle += 1;
                    System.out.println("Que maravilha !!!");
                    var controle1 = 0;
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Você acaba de acordar em meio a um caos, você mora com seus tios e seu primo, entretanto a sua relação" + 
                                       " com eles não é nada boa." + "\nAssim que você acordou, escutou barulho de corujas, e seus tios gritando sem entender" +
                                       "o que estava acontecendo... \nVocê sai do quarto e se depara com um homem gigante, ele logo chama pelo seu" +
                                       "seu nome...\n"                                                      
                                       
                    );                    
                    System.out.println("A primeira, você tem a oportunidade de ir pra uma escola pública de referência.");                    
                    System.out.println("A segunda, você tem a opção de estudar em um colégio particular famoso da sua cidade.");
                    System.out.println();
                    System.out.println("Digite 1 para PRIMEIRA opção || Digite 2 para SEGUNDA opção");
                    while(controle1 == 0){
                        var confirmação2 = ler.nextInt();
                        if(confirmação2 == 1){
                            controle1 += 1;
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hmmm, por ter escolhido realizar o Ensino médio em uma escola pública de referência você");
                            System.out.println("tem direito uma bolsa remunerada do Estado ao entrar na faculdade.");        
                            System.out.println("Com dinheiro no bolso, você consegue focar apenas nos estudos");
                            System.out.println("Você percebe que está com algum tempo livre, você tem a opção de se candidatar a monitoria da faculdade");
                            System.out.println();
                            System.out.println("Digite 1 para SIM || Digite 2 para NÃO");
                            var controle2 = 0;
                            while(controle2 == 0){
                                var confirmação3 = ler.nextInt();
                                if(confirmação3 == 1){
                                    controle2 += 1;
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("A monitoria lhe ajuda bastante no conhecimento, logo você se torna um destaque...");
                                    System.out.println("Perto de terminar a faculdade você funda uma empresa de tecnologia");
                                    System.out.println("Após anos de estudos e luta, você consegue finalmente trabalhar com aquilo que sonhou e ser Feliz !");
                                    System.out.println("Parabéns !!! a sua jornada até aqui foi determinada pelas suas escolhas!");
                                    System.out.println("Fim de Jornada "+nome);
                                }
                                else if(confirmação3 == 2){
                                    controle2 += 1;
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não se candidatou a monitoria, porém conseguiu um estágio em uma empresa");
                                    System.out.println("Você termina a faculdade e vai crescendo na empresa");
                                    System.out.println("Você se sente feliz, porém não realizado.");
                                    System.out.println("Parabéns !!! a sua jornada até aqui foi determinada pelas suas escolhas!");
                                    System.out.println("Fim de Jornada "+nome);
                                }
                                else{
                                    System.out.println("Opção inexistente, tente novamente");
                                }


                            }                                                                    
                   
                        }
                        else if(confirmação2 == 2){
                            controle1 += 1;
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hmmmm, você escolheu estudar em uma escola particular.");
                            System.out.println("Você estuda bastante para passar no Enem, e finalmente consegue!");
                            System.out.println("Entretanto, por você ter estudado em uma escola particular, você não tem direito a uma bolsa remunerada do Estado");
                            System.out.println("Logo, você precisa trabalhar por fora para conseguir se manter");
                            System.out.println("Olha só... Aparceu uma vaga de emprego na sua àrea !! Você deseja se candidatar?");
                            var controle2 = 0;
                            while(controle2 == 0){
                                System.out.println();
                                System.out.println("Digite 1 para SIM  /// Digite 2 para NÃO");
                                var confirmação3 = ler.nextInt();
                                if(confirmação3 == 1){
                                    controle2 += 1;
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("MARAVILHA ! Você se candidatou e conseguiu a vaga de emprego!");
                                    System.out.println("Agora você trabalha e estuda ao mesmo tempo.");
                                    System.out.println("Com muito esforço você consegue se formar!!");
                                    System.out.println("Parabéns !!! a sua jornada até aqui foi determinada pelas suas escolhas!");
                                    System.out.println("Fim de Jornada "+nome);
                                }
                                else if(confirmação3 == 2){
                                    controle2 += 1;
                                    System.out.println("Infelizmente você não conseguiu se manter na faculdade...");
                                    System.out.println("Infelizmente !!! a sua jornada até aqui foi determinada pelas suas escolhas!");
                                    System.out.println("Fim de Jornada "+nome);
                                }

                            }                                                  
                                                   
                          
                        }
                        else{
                            System.out.println("Opção inexistente, tente novamente!");
                        }
                    }
 
    
                }
                else if(confirmação == 2){
                    controle += 1;
                    System.out.println("Que pena, você está perdendo uma ótima aventura ! Até a próxima "+nome);                    
       
                }
                else{
                    System.out.println("Opção inexistente, tente novamente !");
                }

            }
                      
    
        }
        else{
            System.out.println("Infelizmente você não pode traçar suas próprias escolhas");
            System.out.println("Volte quando você completar 18 anos "+nome+" ! :)");    
          }
        ler.close();        
    }
}