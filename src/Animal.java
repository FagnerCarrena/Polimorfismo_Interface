public class Animal {
    public void fazerSom(){
        System.out.println("Barulho do animal");
    }
}

 class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Miau Miau");
    }

}

class Cachorro extends Animal{

    public void fazerSom(){
        System.out.println("Au Au");

    }

}
