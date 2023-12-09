package exercicio02;

public class Main {
    public static void main(String[] args) {
        Assalariado guereiro = new Assalariado("fagner", 02, 2000);



//        System.out.println("meus dados sao:" + guereiro.calcularSalario() );
//        System.out.println("meus nome e:" + guereiro.getNome());


        PorHora  dev = new PorHora("carrena", 23, 30, 3);
        System.out.println("meu salario foi:" + dev.calcularSalario());
        System.out.println("meu nome é:" + dev.getNome());
    }
}
