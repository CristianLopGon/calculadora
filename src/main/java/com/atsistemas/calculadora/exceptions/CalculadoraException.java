package com.atsistemas.calculadora.exceptions;

public class CalculadoraException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4415383627961701456L;
	
	public String errorMessage;
	
	public CalculadoraException(String message) {
		this.errorMessage = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
