abstract class Empleado {
    protected String nombre; // Atributo extra para identificar al empleado

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos requeridos
    public abstract double calcularSalario();
    public abstract double calcularBonificacion();

    // Método común para mostrar la información
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
        System.out.println("Bonificación: $" + calcularBonificacion());
        System.out.println("Total a pagar: $" + (calcularSalario() + calcularBonificacion()));
        System.out.println("----------------------------");
    }
}