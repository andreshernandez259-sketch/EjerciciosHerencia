class Comisionista extends Empleado {
    private double salarioBase;
    private double comisiones;

    public Comisionista(String nombre, double salarioBase, double comisiones) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comisiones = comisiones;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comisiones; // Salario base + comisiones
    }

    @Override
    public double calcularBonificacion() {
        return comisiones * 0.15; // Bonificación del 15% sobre las comisiones
    }
}
