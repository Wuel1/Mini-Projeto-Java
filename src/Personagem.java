public class Personagem {
    String nome;
    int energia;
    int magia;

    Personagem(String nome, int energia, int magia){
        this.nome = nome;
        this.energia = energia;
        this.magia = magia;
    }
    void alterarEnergia(int alteração){
        this.energia = this.energia + alteração;
        System.out.println("A energia de"+ this.nome + " foi modificada em"+ alteração+ " pontos"+
                           "Agora sua energia é de:"+ this.energia +" Hp"
        );        
    }
    void alterarMagia(int alteração){
        this.magia = this.magia + alteração;
        System.out.println("A magia de "+ this.nome + " foi modificada em "+ alteração+ " pontos"+
                           "\nAgora sua magia é de:"+ this.magia +" Powers"
        );   
    }
}

