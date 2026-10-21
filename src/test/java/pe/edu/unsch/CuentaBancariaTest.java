package pe.edu.unsch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {

    @Test
    void pagarServicioCorrectamente() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        boolean resultado = cuenta.pagarServicio(200);

        assertEquals(true, resultado);
        assertEquals(800, cuenta.getSaldo());
    }

    @Test
    void pagarServicioConSaldoInsuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        boolean resultado = cuenta.pagarServicio(500);

        assertEquals(false, resultado);
        assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void pagarServicioConMontoNegativo() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        boolean resultado = cuenta.pagarServicio(-200);

        assertEquals(false, resultado);
        assertEquals(1000, cuenta.getSaldo());
    }

}