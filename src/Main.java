public class Main {
    public static void main(String[] args) {
        // Uso do Builder para construir um Carro
        CarroBuilder builder = new CarroBuilder();
        Carro carro = builder.setModelo("Gol")
                .setMotor("AP 1.6")
                .setRodas("Aro 14")
                .setCor("Cinza")
                .build();

        // Impressão do objeto Carro
        System.out.println(carro);
    }
}