class Internacional extends Envio {
    public Internacional(double pesoKg) {
        super(pesoKg);
    }

    @Override
    public double calcularCosto() {
        return pesoKg * 15; // $15 por kg [cite: 54]
    }

    @Override
    public String calcularTiempoEntrega() {
        return "10 días"; // [cite: 54]
    }
}