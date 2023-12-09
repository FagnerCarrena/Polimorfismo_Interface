package exerc04;

 interface Veiculo {
    void acelerar();
    void frear();
}
 interface Motorizado extends Veiculo {
    void calcularConsumoCombustivel();
}

 class Carro implements Motorizado {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerou!");
    }

    @Override
    public void frear() {
        System.out.println("Carro freou!");
    }

    @Override
    public void calcularConsumoCombustivel() {
        System.out.println("Carro calculou o consumo de combustível.");
    }
}


class Moto implements Motorizado {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerou!");
    }

    @Override
    public void frear() {
        System.out.println("Moto freou!");
    }

    @Override
    public void calcularConsumoCombustivel() {
        System.out.println("Moto calculou o consumo de combustível.");
    }
}


 class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerou!");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freou!");
    }
}