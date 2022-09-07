public class Escolhas 
{    
    private String texto;
    private Capitulos Próximo;    
    
    public Escolhas(String texto, Capitulos próximo)
    {
      this.texto = texto;
      this.Próximo = próximo;
    }

    public String getTexto()
    {
      return this.texto;
    }
    
    public Capitulos getPróximo()
    {
      return this.Próximo;
    }
}
    

