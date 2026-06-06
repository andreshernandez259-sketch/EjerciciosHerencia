import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(new Carro("Toyota", "Corolla", 180));
        vehiculos.add(new Motocicleta("Yamaha", "FZ", 140));
        vehiculos.add(new Camion("Volvo", "FH", 120, 12));

        double distancia = 350;
        double consumoTotal = 0;

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();

            double consumo = vehiculo.calcularConsumo(distancia);
            System.out.println("Consumo en " + distancia + " km: " + consumo + " litros");
            System.out.println();

            consumoTotal = consumoTotal + consumo;
        }

        System.out.println("Consumo total de todos los vehiculos: " + consumoTotal + " litros");
    }
}