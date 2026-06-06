public class EmpleadoPorHoras extends Empleado {
    int horas;
    double tarifa;

    public EmpleadoPorHoras(String nombre, int horas, double tarifa) {
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public double calcularSalario() {
        return horas * tarifa;
    }

    public double calcularBonificacion() {
        double salario = calcularSalario();

        if (horas > 160) {
            return salario * 0.05;
        } else {
            return 0;
        }
    }
}