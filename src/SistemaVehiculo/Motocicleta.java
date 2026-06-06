public class Motocicleta extends Vehiculo {

    public Motocicleta(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    public double calcularConsumo(double distancia) {
        double consumo = distancia / 25;

        if (distancia > 200) {
            consumo = consumo + (consumo * 0.05);
        }

        return consumo;
    }
}