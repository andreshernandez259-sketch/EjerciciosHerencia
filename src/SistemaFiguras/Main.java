import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(8, 4));
        figuras.add(new Triangulo(6, 7, 6, 7, 8));

        Figura figuraMayor = figuras.get(0);

        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println();

            if (figura.calcularArea() > figuraMayor.calcularArea()) {
                figuraMayor = figura;
            }
        }

        System.out.println("La figura con mayor area es:");
        figuraMayor.mostrarInformacion();
    }
}