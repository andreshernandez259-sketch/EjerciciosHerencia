public class EmpleadoComisionista extends Empleado {
    double salarioBase;
    double comisiones;

    public EmpleadoComisionista(String nombre, double salarioBase, double comisiones) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comisiones = comisiones;
    }

    public double calcularSalario() {
        return salarioBase + comisiones;
    }

    public double calcularBonificacion() {
        return comisiones * 0.15;
    }
}