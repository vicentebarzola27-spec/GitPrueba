package pe.edu.unsch;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Financiero");

        CuentaBancaria cuenta = new CuentaBancaria(100);

        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());

        cuenta.depositar(50);

        System.out.println("Saldo después del depósito: " + cuenta.obtenerSaldo());
    }
}