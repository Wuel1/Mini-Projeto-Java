public class Personagem {
    String nome;
    int energia;
    int magia;

    Personagem(String nome, int energia, int magia)
    {
        this.nome = nome;
        this.energia = energia;
        this.magia = magia;
    }
    void alterarEnergia(int alteração)
    {
        this.energia = this.energia + alteração;
        //System.out.println("\nA energia de "+ this.nome + " foi modificada em "+ alteração+ " pontos"+
        //                   "\nAgora sua energia é de: "+ this.energia +" Hp"); 
        if(this.energia > 100)
       {
            this.energia = 100;
        }
           else if(this.energia <= 0)
        {
            System.out.println("\nInfelizmente você não teve sorte no mundo mágico e acabou morrendo... Fim da jornada para "+this.nome);
    }

    }
    void alterarMagia(int alteração)
    {
        this.magia = this.magia + alteração;
        
        //System.out.println("\nA magia de "+ this.nome + " foi modificada em "+ alteração+ " pontos"+
        //                   "\nAgora sua magia é de: "+ this.magia +" Powers");   
    }
    void status()
    {
        System.out.println(this.nome + " | Energia: " + this.energia + "| Magia: " + this.magia);
    }

}

