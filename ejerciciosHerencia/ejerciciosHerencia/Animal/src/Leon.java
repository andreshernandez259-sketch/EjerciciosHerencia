class Leon extends Animal {
    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() { return "¡Rugido!"; }

    @Override
    public double costoAlimentacionDiaria() { return 40.0; }
}