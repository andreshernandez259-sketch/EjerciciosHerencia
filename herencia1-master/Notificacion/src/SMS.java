class SMS extends Notificacion {
    public SMS(String mensaje, int cantidad) {
        super(mensaje, cantidad);
    }

    @Override
    public double obtenerCosto() {
        return cantidad * 0.05; // Costo de $0.05 por cada SMS
    }

    @Override
    public void enviar() {
        System.out.println("Enviando " + cantidad + " SMS | Mensaje: '" + mensaje + "'");
        System.out.println("Costo total: $" + obtenerCosto());
    }
}
