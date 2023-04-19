package com.atsistemas.calculadora.exceptions.controlleradvices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.atsistemas.calculadora.exceptions.CalculadoraException;



@ControllerAdvice
public class CalculadoraExceptionController {

	
	@ExceptionHandler(value = CalculadoraException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> exception(CalculadoraException exception) {
		return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
	}
}
