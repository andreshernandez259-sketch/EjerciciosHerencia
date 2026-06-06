public class CuentaEmpresarial extends CuentaBancaria {

    public CuentaEmpresarial(String titular, double saldo) {
        super(titular, saldo);
    }

    public double calcularComisionMensual() {
        if (saldo > 100000) {
            return 0;
        } else {
            return saldo * 0.5;
        }
    }
}