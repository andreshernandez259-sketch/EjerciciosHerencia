class TarjetaCredito extends MetodoPago {
    public TarjetaCredito(String titular, double monto) {
        super(titular, monto);
    }

    @Override
    public double calcularComision() {
        // Comisión del 3%
        return monto * 0.03;
    }
}