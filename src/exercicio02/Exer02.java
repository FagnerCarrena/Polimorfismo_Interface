package exercicio02;


 class Funcionario {
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public double calcularSalario() {

        return 0.0;
    }
    public String getNome() {
        return nome;
    }


}


 class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, int id, double salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
    public  String getNome(){
        return super.getNome();
    }


}


 class PorHora extends Funcionario {
    private double salarioPorHora;
    private int horasTrabalhadas;

    public PorHora(String nome, int id, double salarioPorHora, int horasTrabalhadas) {
        super(nome, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }

    public String getNome(){
        return super.getNome();
    }


}

