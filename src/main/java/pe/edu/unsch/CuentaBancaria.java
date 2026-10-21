
package pe.edu.unsch;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean pagarServicio(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }

        return false;
    }
}
