package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClaudioladora {

	@Test
	public void sumarIyI() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		String result = calc.sumar("I", "I");
		// Assert
		assertEquals("II", result);
	}

	@Test
	public void validarNumeroRomano() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.validarNumeroRomano("III");
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void verificarSimbolosInvalidos() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.verificarSimbolosValidos("AEIOU");
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void validarLongitudCadena() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.verificarLongitud("IIIII");
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void verificarSimbolosValidos() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.verificarSimbolosValidos("IIIII");
		// Assert
		assertTrue(result);
	}
	
}
