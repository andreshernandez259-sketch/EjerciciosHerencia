class Elefante extends Animal {
    public Elefante(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() { return "¡Barritar!"; }

    @Override
    public double costoAlimentacionDiaria() { return 60.0; }
}