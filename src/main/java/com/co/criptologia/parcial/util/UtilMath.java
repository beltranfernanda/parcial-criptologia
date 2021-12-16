package com.co.criptologia.parcial.util;

public final class UtilMath {

    public static int maximoComunDivisor(int a, int b){
        return (b == 0) ? a : maximoComunDivisor(b, a % b);
    }

    public static boolean sonPrimosRelativos(int a, int b){
        return (maximoComunDivisor(a,b) == 1);
    }

    public static boolean esInvertibleEnZn(int a, int n){
        if (a >= n || a < 0)
            throw new ArithmeticException("El numero debe ser mayor a cero y menor al módulo");
        return sonPrimosRelativos(a,n);
    }

    public static int calcularReciproco(int a, int modulo){
        if (!esInvertibleEnZn(a, modulo))
            throw new ArithmeticException(String.format("No existe reciproco para el numero: %d", a));
        for (int x=0; x<modulo; x++) {
            if (productoModular(a, x, modulo) == 1)
                return x;
        }
        return -1;
    }

    private static int productoModular(int a, int b, int modulo){
        return (a * b) % modulo;
    }
}
