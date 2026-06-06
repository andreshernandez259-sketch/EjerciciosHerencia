public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String titular, double saldo) {
        super(titular, saldo);
    }

    public double calcularComisionMensual() {
        if (saldo < 1000) {
            return 5;
        } else {
            return 0;
        }
    }
}