class TransferenciaBancaria extends MetodoPago {
    public TransferenciaBancaria(String titular, double monto) {
        super(titular, monto);
    }

    @Override
    public double calcularComision() {
        // Comisión fija de $1
        return 1.0;
    }
}
