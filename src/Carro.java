public class Carro {
    private String modelo;
    private String motor;
    private String rodas;
    private String cor;

    public Carro(String modelo, String motor, String rodas, String cor) {
        this.modelo = modelo;
        this.motor = motor;
        this.rodas = rodas;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public String getRodas() {
        return rodas;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", rodas='" + rodas + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
