class Nacional extends Envio {
    public Nacional(double pesoKg) {
        super(pesoKg);
    }

    @Override
    public double calcularCosto() {
        return pesoKg * 5; // $5 por kg [cite: 53]
    }

    @Override
    public String calcularTiempoEntrega() {
        return "3 días"; // [cite: 53]
    }
}
