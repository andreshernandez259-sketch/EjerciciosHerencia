class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularComisionMensual() {
        // Comisión fija de $5 si el saldo es menor a $1.000
        if (saldo < 1000) {
            return 5.0;
        }
        return 0.0;
    }
}