package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryShapeTest {

    @Test
    void testCreaCerchio() {
        Shape shape = FactoryShape.crea(TipiShape.CERCHIO);
        assertNotNull(shape);
        assertTrue(shape instanceof Cerchio);
    }

    @Test
    void testCreaRettangolo() {
        Shape shape = FactoryShape.crea(TipiShape.RETTANGOLO);
        assertNotNull(shape);
        assertTrue(shape instanceof Rettangolo);
    }

    @Test
    void testCreaTrapezio() {
        Shape shape = FactoryShape.crea(TipiShape.TRAPEZIO);
        assertNotNull(shape);
        assertTrue(shape instanceof Trapezio);
    }

    @Test
    void testTipoNullLanciaEccezione() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactoryShape.crea(null);
        });
    }
}
