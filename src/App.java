import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
      
      Scanner ler = new Scanner(System.in);
      //////// Personagens

      LeitorCarregador leitor = new LeitorCarregador();
      HashMap<String, Personagem> personagens = leitor.lerpersonagens("rsc\\personagens.txt");

      /////// Capitulos 

      HashMap<String, Capitulos> capitulos = leitor.lercapitulos("rsc\\capitulos.txt", personagens, ler);

      ///// Capítulo Raiz

      Capitulos raiz = capitulos.get("Boas-vindas !");
      
      ///// Executando

      raiz.mostrar();      
      ler.close();
      }             
}