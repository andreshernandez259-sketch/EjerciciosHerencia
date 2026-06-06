public class EmpleadoTiempoCompleto extends Empleado {
    double salarioFijo;

    public EmpleadoTiempoCompleto(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    public double calcularSalario() {
        return salarioFijo;
    }

    public double calcularBonificacion() {
        return salarioFijo * 0.10;
    }
}