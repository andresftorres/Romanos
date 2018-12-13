package org.gradle;

import static org.junit.Assert.*;

import java.util.Map;

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
	public void verificarSimbolosValidos() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.verificarSimbolosValidos("IIIII");
		// Assert
		assertTrue(result);
	}

	@Test
	public void LongitudCadena1s() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.validarSimbolosRepetidos("IIIII");
		// Assert
		assertFalse(result);
	}

	@Test
	public void testValidarSimbolosRepetidosCuandoLLDebeRetornarFalso() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.validarSimbolosRepetidos("LL");
		// Assert
		assertFalse(result);
	}

	@Test
	public void testvalidarSimbolosRepetidosCuandoXXDebeRetornarVerdadero() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		boolean result = calc.validarSimbolosRepetidos("XX");
		// Assert
		assertTrue(result);
	}

	@Test
	public void ListaSimbolos() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		Map<String, Integer> result = calc.getSimbolos();
		// Assert
		assertNotNull(result);
	}

	@Test
	public void testListaSimbolosContiene5() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		Map<String, Integer> result = calc.getSimbolos();
		// Assert
		assertEquals(result.get("V"), 5, 0);
	}

	@Test
	public void testListaSimbolosContiene100() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		Map<String, Integer> result = calc.getSimbolos();
		// Assert
		assertEquals(result.get("C"), 100, 0);
	}
	
	@Test
	public void testValidarOrden() {
		// Arrange
		Claudioladora calc = new Claudioladora();
		// Act
		Map<String, Integer> result = calc.getSimbolos();
		// Assert
		assertEquals(result.get("C"), 100, 0);
	}
}
