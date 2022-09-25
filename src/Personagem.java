public class Personagem {
    private String nome;
    private int energia;
    private int magia;

    public Personagem(String nome, int energia, int magia)
    {
        this.nome = nome;
        this.energia = energia;
        this.magia = magia;
    }

    public void alterarEnergia(int alteração)
    {
        if(alteração != 0){

            this.energia = this.energia + alteração;
            
            if(this.energia > 0 && this.energia <= 100)
            {
                System.out.print("----------------------------------------------------------------------");
                System.out.println("\nA energia de "+ this.nome + " foi modificada em "+ alteração + " pontos");
                System.out.println(this.nome + " | Energia: " + this.energia);
            }                      
            else if(this.energia > 100)
            {
                this.energia = 100;
            }
            else if(this.energia <= 0)
            {
                this.energia = 0;
                System.out.println("\nA energia de "+ this.nome + " foi modificada em "+ alteração + " pontos");
                System.out.println(this.nome + " | Energia: " + this.energia);
                System.out.println("\nInfelizmente você não teve sorte no mundo mágico e acabou morrendo... Fim da jornada para "+this.nome);
            }

        }

    }
    public void alterarMagia(int alteração)
    {
        if(alteração != 0){
            this.magia = this.magia + alteração;        
            System.out.println("\nA magia de "+ this.nome + " foi modificada em "+ alteração+ " pontos");
            System.out.println(this.nome + " | Magia: " + this.magia);                                
        }
       
    }
  
}