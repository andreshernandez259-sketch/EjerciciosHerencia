public static void main(String[] args) {


    System.out.println("====== EJERCICIO 3: REPORTE DE NÓMINA ======");
// ==========================================
    Empleado emp1 = new TiempoCompleto("Ana Gómez", 3000.0);
    Empleado emp2 = new PorHoras("Luis Pérez", 170, 15.0);
    Empleado emp3 = new PorHoras("María López", 100, 15.0);
    Empleado emp4 = new Comisionista("Carlos Ruiz", 1000.0, 500.0);

    Empleado[] nomina = {emp1, emp2, emp3, emp4};

    for (Empleado emp : nomina) {
        emp.mostrarDetalles();
    }
}