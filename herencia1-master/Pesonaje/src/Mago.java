class Mago extends Personaje {
    public Mago(String nombre, double poderMagico, double defensa) {
        super(nombre, poderMagico, defensa);
    }

    @Override
    public void atacar() {
        // Ataque mágico
        System.out.println(nombre + " lanza un ataque mágico básico.");
    }

    @Override
    public void usarHabilidadEspecial() {
        // Habilidad daña a todos los enemigos
        System.out.println(nombre + " usa su habilidad especial: ¡Lluvia de Meteoros! Daña a TODOS los enemigos en el campo.");
    }
}