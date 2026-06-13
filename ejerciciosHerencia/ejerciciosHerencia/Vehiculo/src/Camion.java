class Camion extends Vehiculo {
    private double toneladasCarga; // Atributo específico del camión

    public Camion(String marca, String modelo, double velocidadMaxima, double toneladasCarga) {
        super(marca, modelo, velocidadMaxima);
        this.toneladasCarga = toneladasCarga;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia / 5.0; // Consume 1 litro cada 5 km
        if (toneladasCarga > 10) {
            consumo *= 1.25; // Aumenta 25% si transporta más de 10 toneladas
        }
        return consumo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Camión - " + marca + " " + modelo + " | Vel. Max: " + velocidadMaxima + " km/h | Carga: " + toneladasCarga + "t");
    }
}
