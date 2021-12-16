package com.co.criptologia.parcial.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilMathTest {

    @Test
    public void ElReciprocoDeTresModuloDiezEsSiete(){
        Assertions.assertEquals(7, UtilMath.calcularReciproco(3,10));
    }

    @Test
    public void ElReciprocoDeSieteModuloDiezEsTres(){
        Assertions.assertEquals(3, UtilMath.calcularReciproco(7,10));
    }

    @Test
    public void ElReciprocoDeNueveModuloDiezEsNueve(){
        Assertions.assertEquals(9, UtilMath.calcularReciproco(9,10));
    }

    @Test
    public void ElReciprocoDeUnoModuloDiezEsUno(){
        Assertions.assertEquals(1, UtilMath.calcularReciproco(1,10));
    }

    @Test
    public void CincoModuloDiezNoTieneReciproco(){
        Assertions.assertThrows(Exception.class, () -> UtilMath.calcularReciproco(5,10));
    }
}
