public abstract class Figura {
    String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}