package com.co.criptologia.parcial.rest.controller;

import com.co.criptologia.parcial.rest.dto.SuccessDto;
import com.co.criptologia.parcial.util.UtilMath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class parcialController {

    @GetMapping("/invertible/{numero}/{modulo}")
    public ResponseEntity<SuccessDto> calcularNumeroInvertible(@PathVariable("numero") int numero,
                                                               @PathVariable("modulo") int modulo){
        SuccessDto response = new SuccessDto();
        response.setNumero(numero);
        response.setModulo(modulo);
        response.setEsInvertibleEnZn(UtilMath.esInvertibleEnZn(numero, modulo));
        response.setSonPrimosRelativos(UtilMath.sonPrimosRelativos(numero, modulo));
        response.setMaximoComunDivisor(UtilMath.maximoComunDivisor(numero, modulo));
        response.setResultado(UtilMath.calcularReciproco(numero, modulo));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
