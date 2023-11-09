package com.cursojava.proyecto01;

/**
 * Clase automovil para una proyexto de cuantos automoviles estan en el parking diferenciado por coche y moto.
 * dentro de coche estarán los desportivos y no deportivos.
 * */
public class Automovil implements gestionConcesionario{
	
	protected static int NUM_AUTOMOVILES = 0;
	protected final int  idConcesionario = 119;
	protected int numRuedas; 
	protected String numPlaca;
	
	/**
	 * Constructor de la clase automovil
	 * */
	public Automovil(int numRuedas, String numPlaca) {
		super();
		this.numRuedas = numRuedas;
		this.numPlaca = numPlaca;
		NUM_AUTOMOVILES++;
	}

	@Override
	public String toString() {
		return "Número de ruedas = " + numRuedas + ", Número de placa=" + numPlaca + "]";
	}

	protected int getNumRuedas() {
		return numRuedas;
	}

	protected String getNumPalaca() {
		return numPlaca;
	}

	@Override
	public void cocheVendido() {
		NUM_AUTOMOVILES--;
		
	}

	public int getNumAutomoviles() {
		return NUM_AUTOMOVILES;
	}
	
}
