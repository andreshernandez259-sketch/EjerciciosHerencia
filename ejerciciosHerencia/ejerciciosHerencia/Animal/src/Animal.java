abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract String emitirSonido();
    public abstract double costoAlimentacionDiaria();

    public String getNombre() {
        return nombre;
    }
}
