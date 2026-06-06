package PlataformaPagos;

public class TransferenciaBancaria extends MetodoPago {

    public TransferenciaBancaria(double monto) {
        super("Transferencia bancaria", monto);
    }

    public double calcularComision() {
        return 1;
    }
}