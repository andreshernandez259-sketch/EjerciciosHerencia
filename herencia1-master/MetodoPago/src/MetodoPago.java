abstract class MetodoPago {
    protected String titular;
    protected double monto; // Atributo deducido necesario para calcular comisiones

    public MetodoPago(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    // Método abstracto que cada hijo calculará a su manera
    public abstract double calcularComision();

    // Método común para procesar el pago (usando la comisión calculada)
    public void procesarPago() {
        double comision = calcularComision();
        double total = monto + comision;

        System.out.println("Titular de cuenta: " + titular);
        System.out.println("Monto base a pagar: $" + monto);
        System.out.println("Comisión aplicada: $" + comision);
        System.out.println("Total debitado: $" + total);
        System.out.println("----------------------------------------");
    }
}