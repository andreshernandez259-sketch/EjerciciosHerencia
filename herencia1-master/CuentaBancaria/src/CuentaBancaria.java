abstract class CuentaBancaria {
    protected double saldo; // Atributo esencial deducido para que el sistema funcione

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método común para todas las cuentas
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se depositaron $" + monto + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    // Método común para todas las cuentas
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido para retirar $" + monto);
        }
    }

    // Método abstracto que cada cuenta debe calcular a su manera
    public abstract double calcularComisionMensual();

    // Método para obtener el saldo (Getter)
    public double getSaldo() {
        return saldo;
    }
}