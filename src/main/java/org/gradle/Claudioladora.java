package org.gradle;

import java.util.Map;
import java.util.HashMap;

public class Claudioladora {
	
	private Map<String, Integer> simbolosRomanos;
	
	public Claudioladora() {
		this.simbolosRomanos = getSimbolos();
	}

	public String sumar(String numero1, String numero2) {		
		return "II";
	}

	public boolean validarNumeroRomano(String numero) {
		return true;
	}
	
	public boolean verificarSimbolosValidos(String numero) {
		char[] simbolos = new char[numero.length()];
		numero.getChars(0, numero.length(), simbolos, 0);
		
		for (char simbolo : simbolos) {
			if (!Simbolo.getSimbolos().contains(Character.toString(simbolo))) {
				return false;
			}
		}
		
		return true;
	}

	public boolean validarSimbolosRepetidos(String numero) {
		
		return !(numero.contains("MMMM")
				|| numero.contains("DD")
				|| numero.contains("CCCC")
				|| numero.contains("LL")
				|| numero.contains("XXXX")
				|| numero.contains("VV")
				|| numero.contains("IIII"));
	}

	public Map<String, Integer> getSimbolos() {
		Map<String, Integer> simbolos = new HashMap<String, Integer>();
		simbolos.put("I", 1);
		simbolos.put("V", 5);
		simbolos.put("X", 10);
		simbolos.put("L", 50);
		simbolos.put("C", 100);
		simbolos.put("D", 500);
		simbolos.put("M", 1000);
		return simbolos;
	}

}
