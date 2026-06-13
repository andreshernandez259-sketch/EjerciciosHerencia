public static void main(String[] args) {


    System.out.println("====== GESTIÓN DEL ZOOLÓGICO ======\n");

// Creamos nuestra colección de animales
    Animal[] zoologico = {
            new Leon("Simba"),
            new Elefante("Dumbo"),
            new Pinguino("Pipo"),
            new Leon("Nala")
    };

    double costoMensualTotal = 0.0;
    int diasMes = 30;

// Recorremos la colección
    for (Animal a : zoologico) {
        double gastoAnimal = a.costoAlimentacionDiaria() * diasMes;
        costoMensualTotal += gastoAnimal;

        System.out.println("Animal: " + a.getNombre() + " (" + a.getClass().getSimpleName() + ")");
        System.out.println("Sonido: " + a.emitirSonido());
        System.out.println("Costo diario: $" + a.costoAlimentacionDiaria());
        System.out.println("Costo mensual: $" + gastoAnimal);
        System.out.println("------------------------------------");
    }

    System.out.println("COSTO TOTAL MENSUAL DEL ZOOLÓGICO: $" + costoMensualTotal);
}