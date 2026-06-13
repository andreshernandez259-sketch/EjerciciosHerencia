class Push extends Notificacion {
    public Push(String mensaje, int cantidad) {
        super(mensaje, cantidad);
    }

    @Override
    public double obtenerCosto() {
        double costoBase = cantidad * 0.01; // Costo de $0.01 por cada Push

        // Descuento del 20% si se envían más de 1000
        if (cantidad > 1000) {
            return costoBase * 0.80; // Multiplicar por 0.80 es lo mismo que restar el 20%
        }
        return costoBase;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando " + cantidad + " notificaciones Push | Mensaje: '" + mensaje + "'");
        if (cantidad > 1000) {
            System.out.println("¡Descuento del 20% por volumen aplicado!");
        }
        System.out.println("Costo total: $" + obtenerCosto());
    }
}