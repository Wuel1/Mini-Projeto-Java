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
                System.out.println("\nDigite 1 para SIM || Digite 2 para NÃO");
                var confirmação = ler.nextInt();
                if(confirmação == 1){
                    controle += 1;
                    System.out.println("Que maravilha !!!");
                    var controle1 = 0;
                    System.out.println("-----------------------------------------------------------------------------------");

                    System.out.println("CHAPTER 1:");

                    System.out.println("\nVocê acaba de acordar em meio a um caos, você mora com seus tios e seu primo, entretanto a sua relação" + 
                                       " com eles não é nada boa." + "\nAssim que você acordou, escutou barulho de corujas, e seus tios gritando sem entender" +
                                       " o que estava acontecendo... \nVocê sai do quarto e se depara com um homem gigante, ele logo chama pelo seu" +
                                       " nome...\n");                                                 
                    
                    System.out.println("Qual será o nome do seu personagem?");
                    var nomePersonagem = ler.next();
                    Personagem p1Personagem = new Personagem(nomePersonagem , 70, 0);

                    System.out.println("-----------------------------------------------------------------------------------");
                    p1Personagem.status();
                    System.out.println("-----------------------------------------------------------------------------------");

                    System.out.println("\n..."+ nomePersonagem + "\n Me chamo Harold, e sou da escola de mágia e Bruxaria de Hogwarts" +
                                       "\n estou aqui para lhe fazer um convite, talvez você não saiba, mas você é um bruxo!" +
                                       "\n... Você deseja vir comigo e estudar na escola de mágia e bruxaria de Hogwarts?"                   
                    
                    );                                     
                    
                    System.out.println("\nDigite 1 para SIM || Digite 2 para NÃO");
                    while(controle1 == 0){
                        var confirmação2 = ler.nextInt();
                        if(confirmação2 == 1){
                            controle1 += 1;

                            System.out.println("\n-----------------------------------------------------------------------------------");
                            System.out.println("Bye Bye tios chatos!! Agora a mágia está no ar !!!!");
                            p1Personagem.alterarMagia(+10);
                            p1Personagem.status();
                            System.out.println("-----------------------------------------------------------------------------------");

                            System.out.println("CHAPTER 2");                

                            System.out.println("\nVocê embarca no trem em direção a Hogwarts, nele há duas salas"+
                                               "\nA primeira sala está com apenas uma pessoa, aparentemente uma menina"+
                                               "\nA segunda sala está com um cheiro estranho, e aparentemente muito fria..."                            
                            );
                            System.out.println("\nEm qual sala você deseja se assentar?");
                            System.out.println("\nDigite 1 para Primeira sala || Digite 2 para Segunda sala");
                            var controle2 = 0;
                            while(controle2 == 0){
                                var confirmação3 = ler.nextInt();
                                if(confirmação3 == 1){
                                    controle2 += 1;
                                    Personagem Hermione = new Personagem("Hermione", 100, 40);                                    
                                    System.out.println("Ao entrar no vagão, você dá de cara com uma menina, após curta conversa"+
                                                       "\nVocê descobre que o nome dela é Hermione !!");
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    Hermione.status();
                                    System.out.println("-----------------------------------------------------------------------------------");

                                    System.out.println("\nVocês conversam muito, e vê que ela é muito inteligente e já domina algumas mágias..."+
                                                      "\nApós algumas tentativas, você também começa a desenvolver suas habilidades!!"+
                                                      "\nAlém disso tudo, ela lhe oferece um chocolate mágico que recarrega a sua energia!");

                                    System.out.println("\n-----------------------------------------------------------------------------------");
                                    p1Personagem.alterarEnergia(30);
                                    p1Personagem.alterarMagia(10);
                                    p1Personagem.status();
                                    System.out.println("-----------------------------------------------------------------------------------");                               
                                    
                                    System.out.println("Aguarde os próximos capítulos! "+nome);
                                }
                                else if(confirmação3 == 2){
                                    controle2 += 1;
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("DROGA!");
                                    System.out.println("Você acabou caindo em uma armadilha e deu de cara com um dementador"+
                                                       "\nO Dementador é capaz de sugar toda a sua energia vital...");
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    p1Personagem.alterarEnergia(-70);                                   
                                    System.out.println("\nTenta novamente "+nome);
                                }
                                else{
                                    System.out.println("Opção inexistente, tente novamente");
                                }
                            }                                                                    
                   
                        }
                        else if(confirmação2 == 2){
                            controle1 += 1;
                            System.out.println("-----------------------------------------------------------------------------------");
                            p1Personagem.alterarEnergia(-30);
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("CHAPTER 2");
                            System.out.println("\nVocê rejeitou a proposta de Harold e continua morando com seus tios e levando uma vida pacata"+
                                               "\nEntretanto, agora você sabe que é um bruxo e isso não sai da sua cabeça...");
                            System.out.println("Seus tios desejam fazer um passeio e te deixam sozinho em casa..."+
                                               "\nAinda pensando sobre oq Harold falou,você resolve se testar..."+
                                               "\nPara isso você tenta abrir a porta do seu quarto apenas com o pensamento, porém não consegue..."+
                                               "\n\nVocê deseja tentar mais uma vez?");
                            var controle2 = 0;
                            while(controle2 == 0){
                                System.out.println();
                                System.out.println("\nDigite 1 para SIM || Digite 2 para NÃO");
                                var confirmação3 = ler.nextInt();
                                if(confirmação3 == 1){
                                    controle2 += 1;                                                                       
                                    System.out.println("MARAVILHA ! Você conseguiu abrir a porta apenas com a força da mente"+
                                                      "\nImpressionante! Mas e agora? o que você deve fazer?");
                                    System.out.println("\n-----------------------------------------------------------------------------------");
                                    p1Personagem.alterarMagia(5);
                                    p1Personagem.status();
                                    System.out.println("-----------------------------------------------------------------------------------");                   
                                    System.out.println("Aguarde os próximos capítulos "+nome);
                                }
                                else if(confirmação3 == 2){
                                    controle2 += 1;
                                    System.out.println("Infelizmente você não teve coragem de arriscar"+
                                                      "\nSeus tios voltam do passeio, e você perdeu uma grande oportunidade sozinho"+
                                                      "\nAgora já não tem mais jeito, você apenas continua a vida como um trouxa..."+
                                                      "\nInfelizmente a sua jornada até aqui foi determinada pelas suas escolhas!");
                                    System.out.println("\n-----------------------------------------------------------------------------------");
                                    p1Personagem.alterarEnergia(-100);
                                    p1Personagem.status();
                                    System.out.println("-----------------------------------------------------------------------------------");
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