import java.security.DrbgParameters.Capability;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
      
      Scanner ler = new Scanner(System.in);
      //////// Personagens

      LeitorCarregador leitor = new LeitorCarregador();
      HashMap<String, Personagem> personagens = leitor.lerpersonagens("rsc\\personagens.txt");

      Personagem Harry = personagens.get("Harry");
      // Personagem Hermione = personagens.get("Hermione");
      // Personagem Ronald = personagens.get("Ronald");

      HashMap<String, Capitulos> capitulos = leitor.lercapitulos("rsc\\capitulos.txt", personagens, ler);

      //////// Capítulo 0 
          
      Capitulos Capitulo0 = capitulos.get("Boas-vindas !");
          

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
      Capitulos Capitulo1 = new Capitulos();
      Capitulo1.Capitulo(NomeCapitulo1, TextoCapitulo1, Harry, 0, 0,ler);      
      
     //////// Capítulo 2

      String NomeCapitulo2 = "MAGIA!";
      String TextoCapitulo2 = "\nVocê aceitou ir para Hogwarts com Harold!"+
                              "\nPorém, para isso você precisa ter o seu matérial mágico, não é mesmo?"+
                              "\nVocês partem rumo a compra desses matériais..."+
                              "\n\n-Mas espera ai, eu não tenho dinheiro Harold... ~Disse Harry"+
                              "\n\n-Você que pensa Potter, você que pensa! Antes dos seus pais morrerem"+
                              "\nlhe deixaram uma grande quantidade de dinheiro no banco, e é lá que vamos agora! ~Harold";      
      Capitulos Capitulo2 = new Capitulos();
      Capitulo2.Capitulo(NomeCapitulo2, TextoCapitulo2, Harry, 0, 10,ler);       

      /////// Capitulo 3

      String NomeCapitulo3 = "Incerteza...";
      String TextoCapitulo3 = "\nVocê fica muito assustado com tudo isso que aconteceu, e em meio"+
                              "\na incerteza Harry decide não aceitar a proposta e permanecer morando com os tios"+
                              "\nPorém algo ali mudou..."+
                              "\nHarry começa a sentir a magia fluir em suas veias, coisa que nunca sentiu antes"+
                              "\nAliás... não sabia nem que existia!"+
                              "\n\nCerto dia no zoológico, ao olhar para uma cobra... ele começa a se comunicar com ela"+
                              "\n\n-Isso não é normal, preciso tomar uma decisão!  ~Disse Harry";            
      Capitulos Capitulo3 = new Capitulos();
      Capitulo3.Capitulo(NomeCapitulo3, TextoCapitulo3, Harry , -20, 0,ler);

      /////// Capitulo 4

       String NomeCapitulo4 = "Descobrindo a Magia !";
       String TextoCapitulo4 = "\nAo chegar no banco mágico você se depara com anões... Mas não anões normais"+
                               "\nAnões mágicos !!! Você se admira com a magia do banco, tudo é por meio de feitiços"+
                               "\nAté a fechadura do seu cofre... Sim, você tem cofre!"+
                               "\n\nApós capturar seu dinheiro no banco, você está pronto pra comprar todo o seu matérial !";       
       Capitulos Capitulo4 = new Capitulos();
       Capitulo4.Capitulo(NomeCapitulo4, TextoCapitulo4, Harry, 0, 5,ler);      

      /////// Capitulo 5

      String NomeCapitulo5 = "Correndo atrás da mágia";
      String TextoCapitulo5 = "\nVocê decidiu correr atrás do prejuízo !!! Maravilha!!!"+
                              "\nHarry manda uma carta pra Harold, e pouco tempo depois você recebe uma resposta..."+
                              "\nHArry vai poder ir pra Hogwats!!! Harry logo arruma suas malas, mesmo contra a vontade"+
                              "\ndos seus tios trouxas. Um carro mágico aparece em sua porta, e finalmente Harry vai embora"+
                              "\nDa casa dos seus tios. MAGIA!";      
      Capitulos Capitulo5 = new Capitulos();
      Capitulo5.Capitulo(NomeCapitulo5, TextoCapitulo5, Harry, 10, 5,ler);     

      /////// Capitulo 6

      String NomeCapitulo6 = "Medo";
      String TextoCapitulo6 = "\nEmbora sentir presente em você, você tem medo de assumi-lá!"+
                              "\nAssim, Harry está fadado ao fracasso de nunca arriscar viver uma vida melhor"+
                              "\ne continuar vivendo com os tios... Infeliz, incapaz e inseguro... :(";      
      Capitulos Capitulo6 = new Capitulos();
      Capitulo6.Capitulo(NomeCapitulo6, TextoCapitulo6, Harry, -101, 0,ler);      

      /////// Capitulo 7

      String NomeCapitulo7 = "Trem mágico!";
      String TextoCapitulo7 = "\nÓtimo, Harry já tem todo o seu material mágico consigo..."+
                              "\nVocê embarca em um trem em direção a Hogwarts, ao andar pelos seus corredores"+
                              "\nPercebe que há dois vagões... Um vagão parce está escuro e suas janelas estão"+
                              "\nCom aparencia que congeladas, Harry acha estranho... No outro Vagão há uma menina"+
                              "\ne um menino sentado em seus bancos. Em qual você deseja entrar?";          
      Capitulos Capitulo7 = new Capitulos();
      Capitulo7.Capitulo(NomeCapitulo7, TextoCapitulo7, Harry, 0, 0,ler);      

      /////// Capitulo 8

      String NomeCapitulo8 = "Inimigo inesperado";
      String TextoCapitulo8 = "\nAo entrar no vagão escuro não demora muito tempo, um inimigo mágico aparece"+
                              "\ne suga toda sua energia vital..."+
                              "\nAparentemente você não teve muita sorte no mundo mágico.";      
      Capitulos Capitulo8 = new Capitulos();
      Capitulo8.Capitulo(NomeCapitulo8, TextoCapitulo8, Harry, -101, 0,ler);      

      /////// Capitulo 9

      String NomeCapitulo9 = "Amigos inesperados";
      String TextoCapitulo9 = "\nAo entrar no vagão que há pessoas você logo começa a conversar com elas"+
                              "\ne conhece duas pessoas que vão lhe acompanhar pelo resto da jornada!"+
                              "\n-Hermione Granger"+
                              "\n-Ronald Weasley";              
      Capitulos Capitulo9 = new Capitulos();
      Capitulo9.Capitulo(NomeCapitulo9, TextoCapitulo9, Harry, +10, 5,ler);

      /////// Capitulo -1
      String NomeCapitulo01 = "Uma pena! Volte assim que poder!";
      String TextoCapitulo01 = "";
      Capitulos Capitulo01 = new Capitulos();
      Capitulo01.Capitulo(NomeCapitulo01, TextoCapitulo01, Harry, 0, 0, ler);

      //////// Escolhas

      Capitulo0.escolhas.add(new Escolhas( "Sim", Capitulo1));
      Capitulo0.escolhas.add(new Escolhas( "Nao", Capitulo01));
      Capitulo1.escolhas.add(new Escolhas("Continuar morando com os tios", Capitulo3));
      Capitulo1.escolhas.add(new Escolhas("Aceitar a proposta e ir embora", Capitulo2));
      Capitulo2.escolhas.add(new Escolhas("Continuar", Capitulo4));
      Capitulo3.escolhas.add(new Escolhas("Ir atras de Harold", Capitulo5)); 
      Capitulo3.escolhas.add(new Escolhas("Ter medo de voltar atras", Capitulo6));
      Capitulo4.escolhas.add(new Escolhas("Continuar", Capitulo7));
      Capitulo5.escolhas.add(new Escolhas("Continuar", Capitulo2));
      Capitulo7.escolhas.add(new Escolhas("Entrar no vagao Frio e escuro", Capitulo8));
      Capitulo7.escolhas.add(new Escolhas("Entrar no vagao que ha pessoas", Capitulo9));
      // Capitulo8.escolhas.add(new Escolhas("Continuar",null));
      // Capitulo9.escolhas.add(new Escolhas("Continuar",null));

      ///// Capítulo Raiz

      Capitulos raiz = Capitulo0;
      
      ///// Executando

      raiz.mostrar();      
      ler.close();
      }             
}