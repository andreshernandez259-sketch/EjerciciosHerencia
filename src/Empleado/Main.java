import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        empleados.add(new EmpleadoTiempoCompleto("Laura", 2000));
        empleados.add(new EmpleadoPorHoras("Pedro", 170, 12));
        empleados.add(new EmpleadoComisionista("Sofia", 1000, 800));

        double totalSalarios = 0;
        double totalBonificaciones = 0;

        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();

            double salario = empleado.calcularSalario();
            double bonificacion = empleado.calcularBonificacion();

            System.out.println("Salario: $" + salario);
            System.out.println("Bonificacion: $" + bonificacion);
            System.out.println();

            totalSalarios = totalSalarios + salario;
            totalBonificaciones = totalBonificaciones + bonificacion;
        }

        System.out.println("Total de salarios: $" + totalSalarios);
        System.out.println("Total de bonificaciones: $" + totalBonificaciones);
    }
}