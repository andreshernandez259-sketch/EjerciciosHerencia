public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String titular, double saldo) {
        super(titular, saldo);
    }

    public double calcularComisionMensual() {
        return saldo * 0.1;
    }
}