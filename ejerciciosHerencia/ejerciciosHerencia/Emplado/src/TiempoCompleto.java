class TiempoCompleto extends Empleado {
    private double salarioFijo;

    public TiempoCompleto(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo; // Salario fijo [cite: 19]
    }

    @Override
    public double calcularBonificacion() {
        return salarioFijo * 0.10; // Bonificación del 10% [cite: 19]
    }
}