public class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}