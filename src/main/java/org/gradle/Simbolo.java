package org.gradle;

public enum Simbolo {
	
	I("I", 1), V("V", 5), X("X", 10), L("L", 50), C("C", 100), D("D", 500), M("M", 1000);
	
	private String romano;
	private int decimal;
	
	private Simbolo(String romano, int decimal) {
		this.romano = romano;
		this.decimal = decimal;
	}
	
	public String getRomano() {
		return this.romano;
	}
	
	public int getDecimal() {
		return this.decimal;
	}
	
	public static String getSimbolos() {
		return I.getRomano() + V.getRomano() + X.getRomano() + L.getRomano()
			+ C.getRomano() + D.getRomano() + M.getRomano();
	}
	
}
