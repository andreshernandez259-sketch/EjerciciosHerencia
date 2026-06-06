public class Mago extends Personaje {
    int poderMagico;

    public Mago(String nombre, int poderMagico) {
        super(nombre);
        this.poderMagico = poderMagico;
    }

    public void atacar() {
        System.out.println(nombre + " lanza un ataque magico de " + poderMagico + " de dano.");
    }

    public void usarHabilidadEspecial() {
        System.out.println(nombre + " usa explosion magica.");
        System.out.println("La habilidad dana a todos los enemigos.");
    }
}