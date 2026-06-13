abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos abstractos que cada hijo debe implementar
    public abstract double calcularConsumo(double distancia);
    public abstract void mostrarInformacion();
}