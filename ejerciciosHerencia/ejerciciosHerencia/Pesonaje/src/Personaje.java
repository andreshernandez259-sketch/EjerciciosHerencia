abstract class Personaje {
    protected String nombre;
    protected double fuerza; // Lo usaremos como estadística principal de daño
    protected double defensa;

    public Personaje(String nombre, double fuerza, double defensa) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    // Métodos abstractos obligatorios
    public abstract void atacar();
    public abstract void usarHabilidadEspecial();

    // Método común para ver las estadísticas
    public void mostrarEstado() {
        System.out.println("Personaje: " + nombre + " | Fuerza/Poder: " + fuerza + " | Defensa: " + defensa);
    }
}