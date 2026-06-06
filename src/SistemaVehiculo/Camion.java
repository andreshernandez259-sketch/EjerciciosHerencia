public class Camion extends Vehiculo {
    double toneladas;

    public Camion(String marca, String modelo, int velocidadMaxima, double toneladas) {
        super(marca, modelo, velocidadMaxima);
        this.toneladas = toneladas;
    }

    public double calcularConsumo(double distancia) {
        double consumo = distancia / 5;

        if (toneladas > 10) {
            consumo = consumo + (consumo * 0.25);
        }

        return consumo;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Toneladas: " + toneladas);
    }
}