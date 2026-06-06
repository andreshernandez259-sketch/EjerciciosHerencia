public class Guerrero extends Personaje {
    int fuerza;
    int defensa;

    public Guerrero(String nombre, int fuerza, int defensa) {
        super(nombre);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public void atacar() {
        int dano = fuerza * 2;
        System.out.println(nombre + " ataca con espada y causa " + dano + " de dano.");
    }

    public void usarHabilidadEspecial() {
        defensa = defensa + (defensa / 2);
        System.out.println(nombre + " usa escudo poderoso.");
        System.out.println("Su defensa aumento a " + defensa);
    }
}