class Documental extends Contenido {
    public Documental(String titulo, double duracion) {
        super(titulo, duracion);
    }

    @Override
    public double calcularCostoLicencia() {
        return cantidad * 1.5;
    }

}