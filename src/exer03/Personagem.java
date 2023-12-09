package exer03;

class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        System.out.println(nome + " atacou!");
    }

    public  void defender(){
        System.out.println(nome + " se defendeu!");
    }
    public String getNome() {
        return nome;
    }

}

class Mago extends Personagem{

    public Mago(String nome, int vida){
        super(nome, vida);
    }
public String getNome(){
        return super.getNome();
}

    public void habilidades() {
        System.out.println(getNome() + "usou uma habilidade unica da classe Mago");
    }

}

class Guereiro extends Personagem{
    public Guereiro(String nome, int vida){
        super(nome, vida);
    }
    public void habilidades(){
        System.out.println(getNome()+ " usou habilidades unica da classe guereiro");
    }


}

class Arqueiro extends Personagem{
    public  Arqueiro(String nome, int vida){
        super(nome, vida);
    }

    public void habilidades(){
        System.out.println(getNome() + "usou habilidades da classe Arqueiro");
    }

}
