package PlataformaPagos;

public class BilleteraDigital extends MetodoPago {

    public BilleteraDigital(double monto) {
        super("Billetera digital", monto);
    }

    public double calcularComision() {
        if (monto > 500) {
            return monto * 0.005;
        } else {
            return monto * 0.01;
        }
    }
}