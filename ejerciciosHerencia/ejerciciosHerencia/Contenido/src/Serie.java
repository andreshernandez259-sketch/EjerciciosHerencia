class Serie extends Contenido {
    public Serie(String titulo, int episodios) {
        super(titulo, episodios);
    }

    @Override
    public double calcularCostoLicencia() {
        return cantidad * 50.0;
    }
}