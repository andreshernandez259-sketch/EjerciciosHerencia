class Arquero extends Personaje {
    public Arquero(String nombre, double agilidad, double defensa) {
        super(nombre, agilidad, defensa);
    }

    @Override
    public void atacar() {
        // Ataque a distancia
        System.out.println(nombre + " realiza un ataque a distancia disparando una flecha.");
    }

    @Override
    public void usarHabilidadEspecial() {
        // Habilidad dispara tres flechas
        System.out.println(nombre + " usa su habilidad especial: ¡Disparo Múltiple! Dispara tres flechas simultáneas.");
    }
}
