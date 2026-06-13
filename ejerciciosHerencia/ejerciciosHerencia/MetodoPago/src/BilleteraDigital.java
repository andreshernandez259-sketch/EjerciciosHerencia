class BilleteraDigital extends MetodoPago {
    public BilleteraDigital(String titular, double monto) {
        super(titular, monto);
    }

    @Override
    public double calcularComision() {
        // Si supera $500 cobra 0.5%
        if (monto > 500) {
            return monto * 0.005;
        }
        // De lo contrario, comisión normal del 1%
        return monto * 0.01;
    }
}