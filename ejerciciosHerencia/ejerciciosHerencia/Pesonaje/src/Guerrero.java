class Guerrero extends Personaje {
    public Guerrero(String nombre, double fuerza, double defensa) {
        super(nombre, fuerza, defensa);
    }

    @Override
    public void atacar() {
        double dano = fuerza * 2; // Daño = fuerza x 2
        System.out.println(nombre + " ataca cuerpo a cuerpo con su espada causando " + dano + " de daño físico.");
    }

    @Override
    public void usarHabilidadEspecial() {
        defensa += (defensa * 0.50); // Aumenta defensa 50%
        System.out.println(nombre + " usa su habilidad especial: ¡Postura Defensiva! Su defensa aumenta a " + defensa + ".");
    }
}
