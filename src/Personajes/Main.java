import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        personajes.add(new Guerrero("Thor", 20, 30));
        personajes.add(new Mago("Merlin", 40));
        personajes.add(new Arquero("Robin", 15));

        for (Personaje personaje : personajes) {
            personaje.mostrarInformacion();
            personaje.atacar();
            personaje.usarHabilidadEspecial();
            System.out.println();
        }
    }
}