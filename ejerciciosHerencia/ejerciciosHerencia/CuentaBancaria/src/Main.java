public static void main(String[] args) {

    System.out.println("====== EJERCICIO 2: SISTEMA BANCARIO ======");
// ==========================================
CuentaBancaria cuentaAhorros = new CuentaAhorros(800.0);
CuentaBancaria cuentaCorriente = new CuentaCorriente(5000.0);
CuentaBancaria cuentaEmpresarial = new CuentaEmpresarial(150000.0);

    System.out.println("--- PRUEBA DE CUENTA DE AHORROS ---");
    System.out.println("Saldo inicial: $" + cuentaAhorros.getSaldo());
        System.out.println("Comisión mensual: $" + cuentaAhorros.calcularComisionMensual());

        System.out.println("\n--- PRUEBA DE CUENTA CORRIENTE ---");
    cuentaCorriente.retirar(1000);
    System.out.println("Comisión mensual (1% de " + cuentaCorriente.getSaldo() + "): $" + cuentaCorriente.calcularComisionMensual());

        System.out.println("\n--- PRUEBA DE CUENTA EMPRESARIAL ---");
    System.out.println("Saldo inicial: $" + cuentaEmpresarial.getSaldo());
        System.out.println("Comisión mensual (> $100.000): $" + cuentaEmpresarial.calcularComisionMensual());

        cuentaEmpresarial.retirar(60000);
    System.out.println("Nueva comisión mensual (0.5% de " + cuentaEmpresarial.getSaldo() + "): $" + cuentaEmpresarial.calcularComisionMensual() + "\n");


