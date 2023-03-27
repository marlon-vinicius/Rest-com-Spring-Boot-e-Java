package br.com.marlon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.marlon.converters.NumberConverter;
import br.com.marlon.exceptions.UnsupportedMathOperationException;
import br.com.marlon.math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping("/soma/{numberOne}/{numberTwo}")
	public Double soma(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.soma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/subtracao/{numberOne}/{numberTwo}")
	public Double subtracao(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/multiplicacao/{numberOne}/{numberTwo}")
	public Double multiplicacao(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.multiplicacao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/divisao/{numberOne}/{numberTwo}")
	public Double divisao(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/media/{numberOne}/{numberTwo}")
	public Double media(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/raiz/{number}")
	public Double raiz(
			@PathVariable(value = "number") String number
			) throws Exception {
		
		if (!NumberConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Por favor insira um número válido");
		}
		return math.raiz(NumberConverter.convertToDouble(number));
	}

	
}
