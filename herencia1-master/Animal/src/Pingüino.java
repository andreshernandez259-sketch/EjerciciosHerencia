class Pinguino extends Animal {
    public Pinguino(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() { return "¡Graznido!"; }

    @Override
    public double costoAlimentacionDiaria() { return 15.0; }
}