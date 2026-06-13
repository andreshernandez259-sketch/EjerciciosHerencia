class Correo extends Notificacion {
    public Correo(String mensaje, int cantidad) {
        super(mensaje, cantidad);
    }

    @Override
    public double obtenerCosto() {
        return 0.0; // El costo es $0
    }

    @Override
    public void enviar() {
        System.out.println("Enviando " + cantidad + " Correos | Mensaje: '" + mensaje + "'");
        System.out.println("Costo total: $" + obtenerCosto());
    }
}