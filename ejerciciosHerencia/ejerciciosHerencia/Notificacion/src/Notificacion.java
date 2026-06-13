abstract class Notificacion {
    protected String mensaje;
    protected int cantidad; // Fundamental para calcular costos totales y descuentos

    public Notificacion(String mensaje, int cantidad) {
        this.mensaje = mensaje;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void enviar();
    public abstract double obtenerCosto();
}
