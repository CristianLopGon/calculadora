package com.atsistemas.calculadora.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.atsistemas.calculadora.exceptions.CalculadoraException;

@Service
public class CalculadoraService {
	
	private static final Logger log = LoggerFactory.getLogger(CalculadoraService.class);
	
	public Double opera (Double param1, Double param2, String operacion) {
		Double result = 0.0;
		log.debug("Calculando "+ operacion + "para : " + param1 + ", "+ param2);
		
		switch(operacion) {
			case "suma": 
				result = param1 + param2;
				break;
			case "resta":
				result = param1 - param2;
				break;
			case "multiplicacion": 
				result = param1 * param2;
				break;
			case "division": 
				result = param1 / param2;
				break;
			default: 
				log.error("El tipo de operación introducida no está permitida. Debe elegir entre: suma, resta, multiplicacion y division");
				throw new CalculadoraException("El tipo de operación introducida no está permitida. Debe elegir entre: suma, resta, multiplicacion y division");
		}
		
		return result;		
	}
	
}
