package exercicio;

public interface Animal {
void fazerBarulho();
void comer();
}

class Cachorro implements Animal {
    public void fazerBarulho(){
        System.out.println( "AuAuAuAu");
    }

    public void comer(){
        System.out.println("Linguiça");
    }
}

class Gato implements Animal{

    public void fazerBarulho(){
        System.out.println("MIAUMIAUMIAU");

    }
    public void comer(){
        System.out.println("Se vier eu traço!!");

    }
}


