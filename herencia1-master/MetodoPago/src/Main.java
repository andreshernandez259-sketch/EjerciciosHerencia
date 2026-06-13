public static void main(String[] args) {


    System.out.println("====== PROCESAMIENTO DE PAGOS ======\n");

// Creamos las instancias de cada pago
    MetodoPago pago1 = new TarjetaCredito("Juan Pérez", 100.0);
    MetodoPago pago2 = new TransferenciaBancaria("María Gómez", 250.0);

// Billetera que NO supera los $500 (Aplica 1%)
    MetodoPago pago3 = new BilleteraDigital("Carlos Ruiz", 400.0);

// Billetera que SÍ supera los $500 (Aplica 0.5%)
    MetodoPago pago4 = new BilleteraDigital("Ana Torres", 600.0);

// Agrupamos en un arreglo aplicando polimorfismo
    MetodoPago[] transacciones = {pago1, pago2, pago3, pago4};

// Recorremos el arreglo y procesamos cada pago
    for (MetodoPago transaccion : transacciones) {
        transaccion.procesarPago();
    }
}