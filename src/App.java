import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
      
      Scanner ler = new Scanner(System.in);
      //////// Personagens

      Personagem Harry = new Personagem("Harry", 100, 0);
    //  Personagem Hermione = new Personagem("Hermione", 100, 30);
    //  Personagem Ronald = new Personagem("Ronald Weasley", 70, 0);

      //////// Capítulo 0       

      String NomeCapitulo0 = "Boas-vindas !";
      String MensagemInicial = "\nOlá !! Seja bem vindo ao Mini Projeto !"+
                               "\nAqui você vai vai mergulhar em uma história de altas aventuras,"+
                               "\ne o melhor... Você quem decide seu caminho!"+
                               "\n\nDeseja começar?";
      String[] escolhascap0 = new String[2];
      escolhascap0[0] = "Sim";  
      escolhascap0[1] = "Não";
      Capitulos Capitulo0 = new Capitulos();
      Capitulo0.Capitulo(NomeCapitulo0,MensagemInicial,escolhascap0,Harry,0,0);
      Capitulo0.mostrar();

      //////// Capítulo 1
      
      String NomeCapitulo1 = "Uma vida desprezível";
      String TextoCapitulo1 = "\nVocê acaba de acordar em meio ao caos... Você mora com seus tios, entretanto a sua relação"+
                              "\ncom eles não é nada boa. Você escuta barulho de vários papéis se batendo, e logo após os seus"+
                              "\ntios começam a gritar o seu nome em tom de enfurecimento..."+
                              "\n\n~HARRY POTTEEER !!!!"+
                              "\n\nVocê sai do quarto e já é puxado pela orelha pelo seu tio em direção a sala"+
                              "\nAo chegar na sala vocês dois tem uma surpresa... Um homem alto e forte está entrando"+
                              "\nEle se chama Harold, ele veio lhe convidar pra fazer parte da escola de Bruxária de"+
                              "\nHogwarts...";
      String[] escolhascap1 = new String[2];
      escolhascap1[0] = "Continuar morando com os tios";
      escolhascap1[1] = "Aceitar a proposta e ir embora";
      Capitulos Capitulo1 = new Capitulos();
      Capitulo1.Capitulo(NomeCapitulo1, TextoCapitulo1, escolhascap1, Harry, 0, 0);
      Capitulo1.mostrar();
      
     //////// Capítulo 2

      String NomeCapitulo2 = "MAGIA!";
      String TextoCapitulo2 = "\nVocê aceitou ir para Hogwarts com Harold!"+
                              "\nPorém, para isso você precisa ter o seu matérial mágico, não é mesmo?"+
                              "\nVocês partem rumo a compra desses matériais..."+
                              "\n\n-Mas espera ai, eu não tenho dinheiro Harold... ~Disse Harry"+
                              "\n\n-Você que pensa Potter, você que pensa! Antes dos seus pais morrerem"+
                              "\nlhe deixaram uma grande quantidade de dinheiro no banco, e é lá que vamos agora! ~Harold";
      String[] escolhascap2 = new String[2];
      escolhascap2[0] = "";
      escolhascap2[1] = "";
      Capitulos Capitulo2 = new Capitulos();
      Capitulo2.Capitulo(NomeCapitulo2, TextoCapitulo2, null, Harry, 0, 0);
      Capitulo2.mostrar();  

      /////// Capitulo 3

      String NomeCapitulo3 = "Incerteza...";
      String TextoCapitulo3 = "\nVocê fica muito assustado com tudo isso que aconteceu, e em meio"+
                              "\na incerteza Harry decide não aceitar a proposta e permanecer morando com os tios"+
                              "\nPorém algo ali mudou..."+
                              "\nHarry começa a sentir a magia fluir em suas veias, coisa que nunca sentiu antes"+
                              "\nAliás... não sabia nem que existia!"+
                              "\n\nCerto dia no zoológico, ao olhar para uma cobra... ele começa a se comunicar com ela"+
                              "\n\n-Isso não é normal, preciso tomar uma decisão!  ~Disse Harry";
      String[] escolhascap3 = new String[2];
      escolhascap3[0] = "Ir atrás de Harold e voltar atrás na decisão de ir pra Hogwarts";
      escolhascap3[1] = "Ter medo de voltar atrás, e continuar com sua vida pacata.";
      Capitulos Capitulo3 = new Capitulos();
      Capitulo3.Capitulo(NomeCapitulo3, TextoCapitulo3, escolhascap3, Harry , 0, 0);
      Capitulo3.mostrar();


       /////// Capitulo 4

       String NomeCapitulo4 = "Descobrindo a Magia !";
       String TextoCapitulo4 = "\nAo chegar no banco mágico";
       String[] escolhascap4 = new String[2];
       escolhascap4[0] = "";
       escolhascap4[1] = "";
       Capitulos Capitulo4 = new Capitulos();
       Capitulo4.Capitulo(NomeCapitulo4, TextoCapitulo4, escolhascap4, Harry, 0, 0);


      /////// Capitulo 5

      String NomeCapitulo5 = "Correndo atrás da mágia";
      String TextoCapitulo5 = "\nVocê decidiu correr atrás do prejuízo !!! Maravilha!!!"+
                              "\nHarry manda uma carta pra Harold, e pouco tempo depois você recebe uma resposta..."+
                              "\nHArry vai poder ir pra Hogwats!!! Harry logo arruma suas malas, mesmo contra a vontade"+
                              "\ndos seus tios trouxas. Um carro mágico aparece em sua porta, e finalmente Harry vai embora"+
                              "\nDa casa dos seus tios. MAGIA!";
      String[] escolhascap5 = new String[2];
      escolhascap5[0] = "";
      escolhascap5[1] = "";
      Capitulos Capitulo5 = new Capitulos();
      Capitulo5.Capitulo(NomeCapitulo5, TextoCapitulo5, null, Harry, 0, 0);
      Capitulo5.mostrar();

      /////// Capitulo 6

      String NomeCapitulo6 = "Medo";
      String TextoCapitulo6 = "";
      String[] escolhascap6 = new String[2];
      escolhascap6[0] = "";
      escolhascap6[1] = "";
      Capitulos Capitulo6 = new Capitulos();
      Capitulo6.Capitulo(NomeCapitulo6, TextoCapitulo6, escolhascap6, Harry, 0, 0);

      /////// Capitulo 7

      String NomeCapitulo7 = "Trem mágico!";
      String TextoCapitulo7 = "";
      String[] escolhascap7 = new String[2];
      escolhascap7[0] = "";
      escolhascap7[1] = "";
      Capitulos Capitulo7 = new Capitulos();
      Capitulo7.Capitulo(NomeCapitulo7, TextoCapitulo7, escolhascap7, Harry, 0, 0);


                               

    
        

//         // Lendo o nome do usuário.

//         System.out.println("Olá !! Primeiramente, qual seu nome ?");
//         var nome = ler.nextLine();
//         System.out.println("Seja Bem vindo "+nome+"! Vamos começar a nossa aventura?" ); 
                
//             // Loop até escolher uma opção válida.
            
//             System.out.println("Deseja começar?");
//             System.out.println("\n-Sim");
//             System.out.println("-Não");
//             Escolhas confirmação0 = new Escolhas();
//             int confirmação = confirmação0.escolher(ler);

//                 if(confirmação == 1)
//                 {                    
//                     System.out.println("Que maravilha !!!");                                   

//                     // Começo da História 
//                     // Cap1                   

//                     System.out.println("-----------------------------------------------------------------------------------");
//                     System.out.println("Qual será o nome do seu personagem?");
//                     var nomePersonagem = ler.next();
//                     Personagem p1Personagem = new Personagem(nomePersonagem , 70, 0);
//                     System.out.println("-----------------------------------------------------------------------------------");
//                     p1Personagem.status();
//                     System.out.println("-----------------------------------------------------------------------------------");

//                     // Declarando variáveis do Cap 1

//                     String cap1 = "Chapter 1";
//                     String texto1cap1v1 = "\nVocê acaba de acordar em meio a um caos, você mora com seus tios e seu primo, entretanto a sua relação" + 
//                                         " com eles não é nada boa." + "\nAssim que você acordou, escutou barulho de corujas, e seus tios gritando sem entender" +
//                                         " o que estava acontecendo... \nVocê sai do quarto e se depara com um homem gigante, ele logo chama pelo seu" +
//                                         " nome...\n";
//                     String texto2cap1v1 = "\n..."+ nomePersonagem + "\n Me chamo Harold, e sou da escola de mágia e Bruxaria de Hogwarts" +
//                                           "\n estou aqui para lhe fazer um convite, talvez você não saiba, mas você é um bruxo!" +
//                                           "\n... Você deseja vir comigo e estudar na escola de mágia e bruxaria de Hogwarts?"; 
//                     String[] escolhascap1 = new String[2];
//                     escolhascap1[0] = "Ir para Hogwarts";
//                     escolhascap1[1] = "Fica com os tios";

//                     // Criando e mostrando capítulo 1                   
//                     Capitulos chapter1v1 = new Capitulos();
//                     chapter1v1.Capitulo(cap1, texto1cap1v1 + texto2cap1v1 , escolhascap1 ,  p1Personagem, 0,0);
//                     chapter1v1.mostrar();
//                     confirmação = confirmação0.escolher(ler);
                    
//                         if(confirmação == 1)
//                         {                            
//                             System.out.println("\n-----------------------------------------------------------------------------------");
//                             System.out.println("Bye Bye tios chatos!! Agora a mágia está no ar !!!!");
//                             p1Personagem.alterarMagia(+10);
//                             p1Personagem.status();
//                             System.out.println("-----------------------------------------------------------------------------------");

//                             // Declarando e mostrando capítulo 2v1                            
                            
//                             Personagem Hermione = new Personagem("Hermione", 100, 40);
//                             String cap2 = "Chapter 2";
//                             String texto1cap2v1 = "\nVocê embarca no trem em direção a Hogwarts, e entra no primeiro vagão"+
//                                                   "\nNele você encontra uma menina, e logo descobre o nome dela...";
//                             String texto2cap2v1 = "\nVocês conversam muito, e vê que ela é muito inteligente e já domina algumas mágias..."+
//                                                   "\nApós algumas tentativas, você também começa a desenvolver suas habilidades!!"+
//                                                   "\nAlém disso tudo, ela lhe oferece um chocolate mágico que pode recarregar a sua energia!";                                                  
//                             //String[] escolhascap2v1 = new String[2];
//                             //escolhascap2v1[0] = "Aceitar chocolate";
//                             //escolhascap2v1[1] = "Rejeitar chocolate";

//                             Capitulos chapter2v1 = new Capitulos();
//                             chapter2v1.Capitulo(cap2, texto1cap2v1 + texto2cap2v1, null , p1Personagem, 0,0);
//                             chapter2v1.mostrar(); 

//                             System.out.println("\n-----------------------------------------------------------------------------------");
//                             p1Personagem.alterarEnergia(30);
//                             p1Personagem.alterarMagia(10);
//                             p1Personagem.status();
//                             Hermione.status();
//                             System.out.println("-----------------------------------------------------------------------------------");                               
                                    
//                             System.out.println("Aguarde os próximos capítulos! "+nome);                                         
                   
//                          } 
//                         else if(confirmação == 2)
//                         {
//                             // Declarando e mostrando o capitulo 2v2

//                             System.out.println("-----------------------------------------------------------------------------------");
//                             String cap2 = "Chapter 2";
//                             String texto1cap2v2 = "\nVocê rejeitou a proposta de Harold e continua morando com seus tios e levando uma vida pacata"+
//                                                   "\nEntretanto, agora você sabe que é um bruxo e isso não sai da sua cabeça...";
//                             String texto2cap2v2 = "Seus tios desejam fazer um passeio e te deixam sozinho em casa..."+
//                                                   "\nAinda pensando sobre oq Harold falou,você resolve se testar..."+
//                                                   "\nPara isso você tenta abrir a porta do seu quarto apenas com o pensamento, porém não consegue..."+
//                                                   "\n\nVocê deseja tentar mais uma vez?";
//                             String[] escolhascap2v2 = new String[2];
//                             escolhascap2v2[0] = "Tentar abrir a porta mais um vez";
//                             escolhascap2v2[1] = "Não tentar abrir mais";

//                             Capitulos chapter2v2 = new Capitulos();
//                             chapter2v2.Capitulo(cap2, texto1cap2v2 + texto2cap2v2 , escolhascap2v2 , p1Personagem,  0, 0);
//                             chapter2v2.mostrar();                            
//                             confirmação = confirmação0.escolher(ler);   

//                                 if(confirmação == 1)
//                                 {                                                                                                       
//                                     System.out.println("\nMARAVILHA ! Você conseguiu abrir a porta apenas com a força da mente"+
//                                                       "\nImpressionante! Mas e agora? o que você deve fazer?");
//                                     System.out.println("\n-----------------------------------------------------------------------------------");
//                                     p1Personagem.alterarMagia(5);
//                                     p1Personagem.status();
//                                     System.out.println("-----------------------------------------------------------------------------------");                   
//                                     System.out.println("Aguarde os próximos capítulos "+nome);
//                                 }
//                                 else if(confirmação == 2)
//                                 {                                   
//                                     System.out.println("\nInfelizmente você não teve coragem de arriscar"+
//                                                       "\nSeus tios voltam do passeio, e você perdeu uma grande oportunidade sozinho"+
//                                                       "\nAgora já não tem mais jeito, você apenas continua a vida como um trouxa..."+
//                                                       "\nInfelizmente a sua jornada até aqui foi determinada pelas suas escolhas!");
//                                     System.out.println("\n-----------------------------------------------------------------------------------");
//                                     p1Personagem.alterarEnergia(-100);
//                                     p1Personagem.status();
//                                     System.out.println("-----------------------------------------------------------------------------------");
//                                     System.out.println("Fim de Jornada "+nome);
//                                 }

//                             }                     
                        
//                     }
//                     else
//                     {
//                      System.out.println("Que pena, você está perdendo uma ótima aventura!");
//                     }    
ler.close();
      }             
}