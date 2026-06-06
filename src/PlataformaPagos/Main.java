package PlataformaPagos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MetodoPago> pagos = new ArrayList<MetodoPago>();

        pagos.add(new TarjetaCredito(200));
        pagos.add(new TransferenciaBancaria(300));
        pagos.add(new BilleteraDigital(600));
        pagos.add(new BilleteraDigital(400));

        for (MetodoPago pago : pagos) {
            pago.procesarPago();
            System.out.println();
        }
    }
}