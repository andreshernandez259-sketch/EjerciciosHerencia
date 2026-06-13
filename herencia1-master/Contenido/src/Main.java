public static void main(String[] args) {


    System.out.println("====== CATÁLOGO DE STREAMING ======\n");

// Polimorfismo: arreglo de Contenido
    Contenido[] catalogo = {
            new Pelicula("Inception", 148),
            new Serie("Breaking Bad", 62),
            new Documental("Nuestro Planeta", 60)
    };

// Recorremos y mostramos detalles
    for (Contenido c : catalogo) {
        c.mostrarDetalles();
    }
}