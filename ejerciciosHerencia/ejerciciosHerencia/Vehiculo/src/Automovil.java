class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia / 15.0; // Consume 1 litro cada 15 km
        if (distancia > 300) {
            consumo *= 1.10; // Aumenta un 10% si supera 300 km
        }
        return consumo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Automóvil - " + marca + " " + modelo + " | Vel. Max: " + velocidadMaxima + " km/h");
    }
}
