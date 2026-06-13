abstract class Figura {
    protected String nombre; // Añadimos un nombre para identificar la figura fácilmente

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos requeridos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getNombre() {
        return nombre;
    }
}
