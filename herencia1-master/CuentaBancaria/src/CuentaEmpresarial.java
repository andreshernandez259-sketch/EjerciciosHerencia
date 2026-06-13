class CuentaEmpresarial extends CuentaBancaria {
    public CuentaEmpresarial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularComisionMensual() {
        // Si supera $100.000 no cobra comisión
        if (saldo > 100000) {
            return 0.0;
        }
        // Comisión del 0.5% del saldo
        return saldo * 0.005;
    }
}
