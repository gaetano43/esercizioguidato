package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CerchioTest {
    @Test
    void testCerchioIstanza() {
        Shape s = new Cerchio();
        assertNotNull(s);
        assertInstanceOf(Cerchio.class, s);
    }
}
