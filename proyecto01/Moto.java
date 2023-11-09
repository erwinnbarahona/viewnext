package com.cursojava.proyecto01;

public class Moto extends Automovil{
	
	protected String nombre;
	protected int numCaballos;
	protected double peso;
	
	public Moto(int numRuedas, String numPlaca, String nombre, int numCaballos, double peso) {
		super(numRuedas, numPlaca);
		this.nombre = nombre;
		this.numCaballos = numCaballos;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nombre de Moto" + nombre +
				", Número de caballos=" + numCaballos + 
				", peso de moto=" + peso + " " + super.toString();
	}
	
	
	
	
	
	
	

}
