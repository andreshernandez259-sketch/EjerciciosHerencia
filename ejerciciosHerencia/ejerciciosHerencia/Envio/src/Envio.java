abstract class Envio {
    protected double pesoKg; // Atributo necesario para los cálculos

    public Envio(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    // Métodos abstractos requeridos
    public abstract double calcularCosto();
    public abstract String calcularTiempoEntrega();

    // Método para mostrar resumen
    public void mostrarDetalles() {
        System.out.println("Envío de " + pesoKg + " kg");
        System.out.println("Costo total: $" + calcularCosto());
        System.out.println("Tiempo estimado: " + calcularTiempoEntrega());
        System.out.println("----------------------------------------");
    }
}
