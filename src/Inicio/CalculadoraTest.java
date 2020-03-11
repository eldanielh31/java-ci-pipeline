package Inicio;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {

        assertEquals(Inicio.Calculadora.Sumar(2,3), 5);

    }

    @org.junit.jupiter.api.Test
    void restar() {

        assertEquals(Inicio.Calculadora.Restar(5 , 1), 4);

    }

    @org.junit.jupiter.api.Test
    void multiplicar() {

        assertEquals(Inicio.Calculadora.Multiplicar(1, 2), 2);

    }

    @org.junit.jupiter.api.Test
    void dividir() {

        assertEquals(Inicio.Calculadora.Dividir(2, 1), 2);

    }
}