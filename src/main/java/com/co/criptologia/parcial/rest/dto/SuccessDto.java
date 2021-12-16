package com.co.criptologia.parcial.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessDto {

    private int numero;
    private int modulo;
    private int maximoComunDivisor;
    private boolean sonPrimosRelativos;
    private boolean esInvertibleEnZn;
    private int resultado;
}
