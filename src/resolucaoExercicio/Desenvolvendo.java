package resolucaoExercicio;

interface FiguraGeometrica {
    double calculaArea();
    double calculaPerimetro();
    String getNome();

}

 class Circulo implements FiguraGeometrica  {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
@Override
    public String getNome(){
        return "circulo";
    }
    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;

    }
}

class Quadrado implements FiguraGeometrica{
    private double lado;

    Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calculaArea(){
        return Math.pow(lado, 2);
    }
    @Override
    public double calculaPerimetro(){
        return 4 * lado;
    }

    public String getNome(){
        return "Quadrado";
    }
}

class Triangulo implements FiguraGeometrica{

    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculaArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

    }
    @Override
    public double calculaPerimetro(){
        return lado1 + lado2 + lado3;
    }

    @Override
    public String getNome(){
        return "Triangulo";
    }



}


