public abstract class Empleado {
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public abstract double calcularBonificacion();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
}