class Express extends Envio {
    public Express(double pesoKg) {
        super(pesoKg);
    }

    @Override
    public double calcularCosto() {
        return pesoKg * 25; // $25 por kg [cite: 55]
    }

    @Override
    public String calcularTiempoEntrega() {
        return "24 horas"; // [cite: 55]
    }
}
