class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Pi * radio al cuadrado
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // 2 * Pi * radio
    }
}
