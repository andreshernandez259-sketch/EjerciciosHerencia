public class Carro extends Vehiculo {

    public Carro(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    public double calcularConsumo(double distancia) {
        double consumo = distancia / 15;

        if (distancia > 300) {
            consumo = consumo + (consumo * 0.10);
        }

        return consumo;
    }
}