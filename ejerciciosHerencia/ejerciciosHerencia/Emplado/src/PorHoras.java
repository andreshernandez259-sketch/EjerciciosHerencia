class PorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public PorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora; // Horas x tarifa
    }

    @Override
    public double calcularBonificacion() {
        // Bonificación del 5% si supera 160 horas
        if (horasTrabajadas > 160) {
            return calcularSalario() * 0.05;
        }
        return 0.0;
    }
}
