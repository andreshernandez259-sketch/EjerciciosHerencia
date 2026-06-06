public abstract class Personaje {
    String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public abstract void atacar();

    public abstract void usarHabilidadEspecial();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
}