package PlataformaPagos;

public class TarjetaCredito extends MetodoPago {

    public TarjetaCredito(double monto) {
        super("Tarjeta de credito", monto);
    }

    public double calcularComision() {
        return monto * 0.03;
    }
}