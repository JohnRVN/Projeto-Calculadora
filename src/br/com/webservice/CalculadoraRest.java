package br.com.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import calculadora.Calculadora;

@RestController
public class CalculadoraRest {

	@GetMapping("/somar")
	public float somar(float a, float b) {
		return Calculadora.somar(a, b);
	}
}
