abstract class Contenido {
    protected String titulo;
    protected double cantidad; // Usamos cantidad tanto para duración como para episodios

    public Contenido(String titulo, double cantidad) {
        this.titulo = titulo;
        this.cantidad = cantidad;
    }

    // Métodos solicitados
    public abstract double calcularCostoLicencia();

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Costo de licencia: $" + calcularCostoLicencia());
        System.out.println("----------------------------------------");
    }
}


