class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularComisionMensual() {
        // Comisión del 1% del saldo
        return saldo * 0.01;
    }
}