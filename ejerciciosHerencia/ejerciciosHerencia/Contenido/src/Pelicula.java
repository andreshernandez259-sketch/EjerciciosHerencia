class Pelicula extends Contenido {
    public Pelicula(String titulo, double duracion) {
        super(titulo, duracion);
    }

    @Override
    public double calcularCostoLicencia() {
        return cantidad * 2.0;
    }
}
