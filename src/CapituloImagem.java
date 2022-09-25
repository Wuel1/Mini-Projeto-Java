import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulos {
    private String imagem;

    public CapituloImagem(HashMap<String, Personagem> personagens, 
                          Scanner ler, 
                          HashMap<String, Capitulos> capitulos,
                          Scanner lerArquivoCapitulos)
    {
        this.lercapitulo(personagens, ler, lerArquivoCapitulos);
        this.escolhas = new ArrayList<>();   
    }

    @Override
    public void mostrar()
    {
        System.out.println();
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }

    @Override
    protected void lercapitulo(HashMap<String,Personagem> personagens,
                             Scanner ler,                             
                             Scanner lerArquivoCapitulos)
    {
        String linha = lerArquivoCapitulos.nextLine(); // CAPITULO_COM_IMAGEM
        linha = lerArquivoCapitulos.nextLine();
        this.imagem = linha;
        linha = lerArquivoCapitulos.nextLine();
        
        while(!linha.equals("FIM_DA_IMAGEM"))
        {
            this.imagem = this.imagem + "\n" + linha;
            linha = lerArquivoCapitulos.nextLine();
        }
        super.lercapitulo(personagens, ler, lerArquivoCapitulos);
    }
}
