class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia / 25.0; // Consume 1 litro cada 25 km
        if (distancia > 200) {
            consumo *= 1.05; // Aumenta un 5% si supera 200 km
        }
        return consumo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Motocicleta - " + marca + " " + modelo + " | Vel. Max: " + velocidadMaxima + " km/h");
    }
}