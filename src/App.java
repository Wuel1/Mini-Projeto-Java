import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // Lendo o nome do usuário.

        System.out.println("Olá !! Primeiramente, qual seu nome ?");
        var nome = ler.nextLine();
        System.out.println("Seja Bem vindo "+nome+"! Vamos começar a nossa aventura?" ); 
                
            // Loop até escolher uma opção válida.
            
            System.out.println("Deseja começar?");
            System.out.println("\n-Sim");
            System.out.println("-Não");
            Escolhas confirmação0 = new Escolhas();
            int confirmação = confirmação0.escolher(ler);

                if(confirmação == 1)
                {                    
                    System.out.println("Que maravilha !!!");                                   

                    // Começo da História 
                    // Cap1                   

                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Qual será o nome do seu personagem?");
                    var nomePersonagem = ler.next();
                    Personagem p1Personagem = new Personagem(nomePersonagem , 70, 0);
                    System.out.println("-----------------------------------------------------------------------------------");
                    p1Personagem.status();
                    System.out.println("-----------------------------------------------------------------------------------");

                    // Declarando variáveis do Cap 1

                    String cap1 = "Chapter 1";
                    String texto1cap1v1 = "\nVocê acaba de acordar em meio a um caos, você mora com seus tios e seu primo, entretanto a sua relação" + 
                                        " com eles não é nada boa." + "\nAssim que você acordou, escutou barulho de corujas, e seus tios gritando sem entender" +
                                        " o que estava acontecendo... \nVocê sai do quarto e se depara com um homem gigante, ele logo chama pelo seu" +
                                        " nome...\n";
                    String texto2cap1v1 = "\n..."+ nomePersonagem + "\n Me chamo Harold, e sou da escola de mágia e Bruxaria de Hogwarts" +
                                          "\n estou aqui para lhe fazer um convite, talvez você não saiba, mas você é um bruxo!" +
                                          "\n... Você deseja vir comigo e estudar na escola de mágia e bruxaria de Hogwarts?"; 
                    String[] escolhascap1 = new String[2];
                    escolhascap1[0] = "Ir para Hogwarts";
                    escolhascap1[1] = "Fica com os tios";

                    // Criando e mostrando capítulo 1                   
                    Capitulos chapter1v1 = new Capitulos();
                    chapter1v1.Capitulo(cap1, texto1cap1v1 + texto2cap1v1 , escolhascap1 ,  p1Personagem, 0,0);
                    chapter1v1.mostrar();
                    confirmação = confirmação0.escolher(ler);
                    
                        if(confirmação == 1)
                        {                            
                            System.out.println("\n-----------------------------------------------------------------------------------");
                            System.out.println("Bye Bye tios chatos!! Agora a mágia está no ar !!!!");
                            p1Personagem.alterarMagia(+10);
                            p1Personagem.status();
                            System.out.println("-----------------------------------------------------------------------------------");

                            // Declarando e mostrando capítulo 2v1                            
                            
                            Personagem Hermione = new Personagem("Hermione", 100, 40);
                            String cap2 = "Chapter 2";
                            String texto1cap2v1 = "\nVocê embarca no trem em direção a Hogwarts, e entra no primeiro vagão"+
                                                  "\nNele você encontra uma menina, e logo descobre o nome dela...";
                            String texto2cap2v1 = "\nVocês conversam muito, e vê que ela é muito inteligente e já domina algumas mágias..."+
                                                  "\nApós algumas tentativas, você também começa a desenvolver suas habilidades!!"+
                                                  "\nAlém disso tudo, ela lhe oferece um chocolate mágico que pode recarregar a sua energia!";                                                  
                            //String[] escolhascap2v1 = new String[2];
                            //escolhascap2v1[0] = "Aceitar chocolate";
                            //escolhascap2v1[1] = "Rejeitar chocolate";

                            Capitulos chapter2v1 = new Capitulos();
                            chapter2v1.Capitulo(cap2, texto1cap2v1 + texto2cap2v1, null , p1Personagem, 0,0);
                            chapter2v1.mostrar(); 

                            System.out.println("\n-----------------------------------------------------------------------------------");
                            p1Personagem.alterarEnergia(30);
                            p1Personagem.alterarMagia(10);
                            p1Personagem.status();
                            Hermione.status();
                            System.out.println("-----------------------------------------------------------------------------------");                               
                                    
                            System.out.println("Aguarde os próximos capítulos! "+nome);                                         
                   
                         } 
                        else if(confirmação == 2)
                        {
                            // Declarando e mostrando o capitulo 2v2

                            System.out.println("-----------------------------------------------------------------------------------");
                            String cap2 = "Chapter 2";
                            String texto1cap2v2 = "\nVocê rejeitou a proposta de Harold e continua morando com seus tios e levando uma vida pacata"+
                                                  "\nEntretanto, agora você sabe que é um bruxo e isso não sai da sua cabeça...";
                            String texto2cap2v2 = "Seus tios desejam fazer um passeio e te deixam sozinho em casa..."+
                                                  "\nAinda pensando sobre oq Harold falou,você resolve se testar..."+
                                                  "\nPara isso você tenta abrir a porta do seu quarto apenas com o pensamento, porém não consegue..."+
                                                  "\n\nVocê deseja tentar mais uma vez?";
                            String[] escolhascap2v2 = new String[2];
                            escolhascap2v2[0] = "Tentar abrir a porta mais um vez";
                            escolhascap2v2[1] = "Não tentar abrir mais";

                            Capitulos chapter2v2 = new Capitulos();
                            chapter2v2.Capitulo(cap2, texto1cap2v2 + texto2cap2v2 , escolhascap2v2 , p1Personagem,  0, 0);
                            chapter2v2.mostrar();                            
                            confirmação = confirmação0.escolher(ler);   

                                if(confirmação == 1)
                                {                                                                                                       
                                    System.out.println("\nMARAVILHA ! Você conseguiu abrir a porta apenas com a força da mente"+
                                                      "\nImpressionante! Mas e agora? o que você deve fazer?");
                                    System.out.println("\n-----------------------------------------------------------------------------------");
                                    p1Personagem.alterarMagia(5);
                                    p1Personagem.status();
                                    System.out.println("-----------------------------------------------------------------------------------");                   
                                    System.out.println("Aguarde os próximos capítulos "+nome);
                                }
                                else if(confirmação == 2)
                                {                                   
                                    System.out.println("\nInfelizmente você não teve coragem de arriscar"+
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
                    else
                    {
                     System.out.println("Que pena, você está perdendo uma ótima aventura!");
                    }    
                }             
   
}