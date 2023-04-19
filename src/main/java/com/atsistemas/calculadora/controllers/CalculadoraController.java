package com.atsistemas.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.calculadora.services.CalculadoraService;

import io.corp.calculator.TracerImpl;



@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	
	private TracerImpl tracer = new TracerImpl();

	
	@GetMapping("/hello")
	public String hello() {	
		return "It Works fine";
	}
	
	
	@GetMapping("/calcula")
	public ResponseEntity<Double> calcula(@RequestParam() Double param1,
											@RequestParam() Double param2,
											@RequestParam() String operacion) {
		double result = this.calculadoraService.opera(param1, param2, operacion);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
