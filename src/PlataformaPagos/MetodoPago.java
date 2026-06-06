package PlataformaPagos;

public abstract class MetodoPago {
    String nombre;
    double monto;

    public MetodoPago(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void procesarPago() {
        double comision = calcularComision();
        double total = monto + comision;

        System.out.println("Metodo de pago: " + nombre);
        System.out.println("Monto: $" + monto);
        System.out.println("Comision: $" + comision);
        System.out.println("Total a pagar: $" + total);
    }

    public abstract double calcularComision();
}