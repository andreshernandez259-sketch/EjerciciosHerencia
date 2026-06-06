public class Arquero extends Personaje {
    int danoFlecha;

    public Arquero(String nombre, int danoFlecha) {
        super(nombre);
        this.danoFlecha = danoFlecha;
    }

    public void atacar() {
        System.out.println(nombre + " dispara una flecha y causa " + danoFlecha + " de dano.");
    }

    public void usarHabilidadEspecial() {
        int danoTotal = danoFlecha * 3;
        System.out.println(nombre + " dispara tres flechas.");
        System.out.println("Dano total: " + danoTotal);
    }
}