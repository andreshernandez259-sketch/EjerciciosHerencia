public static void main(String[] args) {

    // ==========================================
    System.out.println("====== EJERCICIO 1: VEHÍCULOS ======");
    // ==========================================
    Vehiculo[] flota = new Vehiculo[3];
    flota[0] = new Automovil("Toyota", "Corolla", 180);
    flota[1] = new Motocicleta("BMW", "S1000RR", 299);
    flota[2] = new Camion("Volvo", "FH16", 120, 15);

    double distanciaRuta = 350.0;
    double consumoTotalColeccion = 0;

    System.out.println("--- Reporte de Consumo (Ruta de " + distanciaRuta + " km) ---");

    for (Vehiculo v : flota) {
        v.mostrarInformacion();
        double consumo = v.calcularConsumo(distanciaRuta);
        System.out.println("Consumo: " + String.format("%.2f", consumo) + " litros\n");
        consumoTotalColeccion += consumo;
    }

    System.out.println("Consumo TOTAL de la colección: " + String.format("%.2f", consumoTotalColeccion) + " litros\n");
}