package org.gradle;

public class Claudioladora {

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
		
		return false;
	}

	public boolean verificarLongitud(String string) {
		
		return false;
	}

}
