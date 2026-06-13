public static void main(String[] args) {


    System.out.println("====== INICIO DEL COMBATE ======\n");

// Instanciamos los personajes
    Personaje guerrero = new Guerrero("Thorin", 25.0, 100.0);
    Personaje mago = new Mago("Gandalf", 40.0, 30.0);
    Personaje arquero = new Arquero("Legolas", 30.0, 50.0);

// Agrupamos en un arreglo aplicando POLIMORFISMO
    Personaje[] equipo = {guerrero, mago, arquero};

// Recorremos el equipo para que cada uno haga sus acciones
    for (Personaje p : equipo) {
        p.mostrarEstado();
        p.atacar();
        p.usarHabilidadEspecial();
        System.out.println("----------------------------------------");
    }
}