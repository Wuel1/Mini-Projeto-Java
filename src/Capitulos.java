import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//import java.util.Scanner;

public class Capitulos {
    private String nome;
    private String texto;
    private ArrayList<Escolhas> escolhas;    
    private Personagem personagem;
    private int alterarEnergia;
    private int alterarMagia;
    private Scanner escaneador;   

    public Capitulos(HashMap<String, Personagem> personagens,
                     Scanner ler, HashMap<String, Capitulos> capitulos,
                    Scanner lerArquivoCapitulos)
    {
        this.lercapitulo(personagens, ler, lerArquivoCapitulos);
        this.escolhas = new ArrayList<>();
    }

    public void Capitulo(String nome,
                          String texto,                                        
                          Personagem personagem,
                          int alterarEnergia,
                          int alterarMagia,
                          Scanner escaneador)
    {

        this.nome = nome;
        this.texto = texto;              
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
        this.alterarMagia = alterarMagia;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<>();

    }

    public void mostrar()
    {
       
        this.personagem.alterarEnergia(this.alterarEnergia);
        this.personagem.alterarMagia(this.alterarMagia);
        System.out.println("----------------------------------------------------------------------");     
        System.out.println(this.nome);
        System.out.println(this.texto);      
        
        if(this.escolhas.size() > 0)
        {
            System.out.println();    
            for (Escolhas escolhas : escolhas) 
            {
                System.out.println("-" + escolhas.getTexto());    
            }                       
            int escolha = escolher();
            this.escolhas.get(escolha).getPróximo().mostrar();                       
        } 
    }

    private int escolher()
    {
        int escolha = -1;

        if(escolhas != null)
        {
            while (escolha == -1)
            {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Digite sua escolha:");  
                System.out.print("-");                       
                String EscolhaDigitada = escaneador.nextLine(); 

                for(int i = 0; i < escolhas.size(); i++)
                {
                    if(EscolhaDigitada.equals(escolhas.get(i).getTexto()))
                    {
                        escolha = i;
                    }
                    
                }
                if(escolha == -1)
                {
                    System.out.println("Escolha uma opção válida...");   
                }                         
            }
                        
        }

        return escolha;
    }
            
    private void lercapitulo(HashMap<String,Personagem> personagens,
                             Scanner ler,                             
                             Scanner lerArquivoCapitulos){                            
        
        this.escaneador = ler;
        lerArquivoCapitulos.nextLine();
        this.nome = lerArquivoCapitulos.nextLine(); //Nome Capitulo
        lerArquivoCapitulos.nextLine();
        this.texto = lerArquivoCapitulos.nextLine(); //Texto Capitulo
        lerArquivoCapitulos.nextLine();
        this.personagem = personagens.get(lerArquivoCapitulos.nextLine()); //Personagem do Capitulo
        lerArquivoCapitulos.nextLine();
        this.alterarEnergia = Integer.parseInt(lerArquivoCapitulos.nextLine()); // Energia Personagem
        lerArquivoCapitulos.nextLine();
        this.alterarMagia = Integer.parseInt(lerArquivoCapitulos.nextLine()); // Magia Personagem                     
    }
  
    public void adicionarEscolha(Escolhas Escolha)
    {
        this.escolhas.add(Escolha);
    }

    public String getnome() {
        return this.nome;
    }

    public String gettexto() {
        return this.texto;
    }

    public Object getPersonagem(){        
        return this.personagem;
    }

    public int getEnergiaVar() {
        return this.alterarEnergia;
    }

    public int getMagiaVar() {
        return this.alterarMagia;
    }

}
