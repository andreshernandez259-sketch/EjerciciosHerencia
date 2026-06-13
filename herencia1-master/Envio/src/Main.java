public static void main(String[] args) {


    System.out.println("====== GESTIÓN DE ENVÍOS ======\n");

// Polimorfismo: instanciamos diferentes tipos de envío
    Envio[] logistica = {
            new Nacional(10.0),       // 10kg nacional
            new Internacional(5.0),   // 5kg internacional
            new Express(2.0)          // 2kg express
    };

// Procesamos la colección
    for (Envio e : logistica) {
        e.mostrarDetalles();
    }
}