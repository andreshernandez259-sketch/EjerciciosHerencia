import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

        cuentas.add(new CuentaAhorros("Ana", 800));
        cuentas.add(new CuentaCorriente("Carlos", 5000));
        cuentas.add(new CuentaEmpresarial("Empresa ABC", 120000));
        cuentas.add(new CuentaEmpresarial("Empresa XYZ", 80000));

        double comisionTotal = 0;

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarInformacion();

            double comision = cuenta.calcularComisionMensual();
            System.out.println("Comision mensual: $" + comision);
            System.out.println();

            comisionTotal = comisionTotal + comision;
        }

        System.out.println("Comision total del banco: $" + comisionTotal);
    }
}