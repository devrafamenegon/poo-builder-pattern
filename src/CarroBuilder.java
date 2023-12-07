public class CarroBuilder {
    private String modelo;
    private String motor;
    private String rodas;
    private String cor;
    public CarroBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public CarroBuilder setRodas(String rodas) {
        this.rodas = rodas;
        return this;
    }

    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Carro build() {
        return new Carro(modelo, motor, rodas, cor);
    }
}
