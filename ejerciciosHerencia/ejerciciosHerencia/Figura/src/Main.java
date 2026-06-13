public static void main(String[] args) {


    System.out.println("====== SISTEMA DE FIGURAS ======\n");

// Instanciamos las figuras
    Figura circulo = new Circulo("Círculo A", 5.0); // Radio 5
    Figura rectangulo = new Rectangulo("Rectángulo B", 4.0, 7.0); // Base 4, Altura 7
    Figura triangulo = new Triangulo("Triángulo C", 6.0, 4.0, 5.0, 5.0, 6.0); // Base 6, Altura 4, Lados 5, 5, 6

// Polimorfismo: arreglo de figuras
    Figura[] figuras = {circulo, rectangulo, triangulo};

// Variables para resolver el Reto
    Figura figuraMayorArea = null;
    double maxArea = 0.0;

// Recorremos el arreglo para mostrar datos y encontrar el área mayor
    for (Figura fig : figuras) {
        double areaActual = fig.calcularArea();
        double perimetroActual = fig.calcularPerimetro();

        System.out.println("Figura: " + fig.getNombre());
        System.out.println("Área: " + String.format("%.2f", areaActual));
        System.out.println("Perímetro: " + String.format("%.2f", perimetroActual));
        System.out.println("-------------------------");

// Lógica del RETO: si el área actual es mayor a maxArea, actualizamos las variables
        if (areaActual > maxArea) {
            maxArea = areaActual;
            figuraMayorArea = fig;
        }
    }
}
