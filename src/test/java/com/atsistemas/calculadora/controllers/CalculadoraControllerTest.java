package com.atsistemas.calculadora.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.calculadora.CalculadoraApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculadoraApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculadoraControllerTest {
	
	@LocalServerPort
	int randomPort;
	 
	 @Test
	 public void sumaExitosa() throws URISyntaxException {
		 
	        RestTemplate restTemplate = new RestTemplate();

	        final String baseUrl = "http://localhost:" + randomPort +
	                "/calculadora/calcula?param1=" + 1.0 +
	                "&param2=" + 2.0 + "&operacion=suma";
	        URI uri = new URI(baseUrl);

	        ResponseEntity<Double> resultado = restTemplate.getForEntity(uri, Double.class);
	        
	        Assert.assertEquals(200, resultado.getStatusCode().value());
	        Assert.assertEquals(3.0d, resultado.getBody().doubleValue(), 0.001d);      
	        
	 }
	 
	 @Test
	 public void restaExitosa() throws URISyntaxException {
	        RestTemplate restTemplate = new RestTemplate();

	        final String baseUrl = "http://localhost:" + randomPort +
	                "/calculadora/calcula?param1=" + 5.0 +
	                "&param2=" + 2.0 + "&operacion=resta";
	        URI uri = new URI(baseUrl);

	        ResponseEntity<Double> resultado = restTemplate.getForEntity(uri, Double.class);
	        
	        Assert.assertEquals(200, resultado.getStatusCode().value());
	        Assert.assertEquals(3.0d, resultado.getBody().doubleValue(), 0.001d);
	 }
	 
	 @Test
	 public void multExitosa() throws URISyntaxException {
	        RestTemplate restTemplate = new RestTemplate();

	        final String baseUrl = "http://localhost:" + randomPort +
	                "/calculadora/calcula?param1=" + 3.0 +
	                "&param2=" + 2.0 + "&operacion=multiplicacion";
	        URI uri = new URI(baseUrl);

	        ResponseEntity<Double> resultado = restTemplate.getForEntity(uri, Double.class);
	        
	        Assert.assertEquals(200, resultado.getStatusCode().value());
	        Assert.assertEquals(6.0d, resultado.getBody().doubleValue(), 0.001d);
	 }
	 
	 @Test
	 public void divExitosa() throws URISyntaxException {
	        RestTemplate restTemplate = new RestTemplate();

	        final String baseUrl = "http://localhost:" + randomPort +
	                "/calculadora/calcula?param1=" + 9.0 +
	                "&param2=" + 3.0 + "&operacion=division";
	        URI uri = new URI(baseUrl);

	        ResponseEntity<Double> resultado = restTemplate.getForEntity(uri, Double.class);
	        
	        Assert.assertEquals(200, resultado.getStatusCode().value());
	        Assert.assertEquals(3.0d, resultado.getBody().doubleValue(), 0.001d);
	 }

}
