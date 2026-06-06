public abstract class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Se depositaron $" + cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Se retiraron $" + cantidad);
        } else {
            System.out.println("No hay suficiente saldo para retirar.");
        }
    }

    public abstract double calcularComisionMensual();

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}