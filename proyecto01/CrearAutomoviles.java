package com.cursojava.proyecto01;

import java.util.ArrayList;
import java.util.Random;
/*Clases para crear Automoiles del concesionario*/

public class CrearAutomoviles {
	
	private static final int NUM_RUEDAS_COCHE = 4;
	private static final int NUM_RUEDAS_MOTO = 2;
	private static final int NUM_ENTIDADES = 3;
	private static TodoTerreno todoTerreno;
	private static Moto moto;
	
	private static String numPlaca;
	private static String nomAutomoviles;
	private static int numCaballos;
	private static double pesoAutomoviles;

	protected static ArrayList<Automovil> crearListaTodoTerreno() {
		ArrayList<Automovil> listaCoche = new ArrayList<>();
		
		for (int i = 0; i < NUM_ENTIDADES; i++) {
			todoTerreno = crearTodoTerreno();
			listaCoche.add(todoTerreno);
		}
		
		return listaCoche;
	}
	
	protected static ArrayList<Automovil> crerListaMoto() {
		ArrayList<Automovil> listaMoto = new ArrayList<>();
		
		for (int i = 0; i < NUM_ENTIDADES; i++) {
			moto = crearMoto();
			listaMoto.add(moto);
		}
		
		return listaMoto;
	}
	
	/*<<<<<<<<<<<<<METODOS PARA CREAR TERRENOS>>>>>>>>>>>>>>>>>>>>*/
	
	protected static TodoTerreno crearTodoTerreno() {
		TodoTerreno todoTerrenoTem;
		numPlaca = elegirPlacas();
		nomAutomoviles = nombreTodoTerreno();
		numCaballos = numCaballosTodoTerreno();
		pesoAutomoviles = pesoCocheTodoTerreno();
		todoTerrenoTem = new TodoTerreno(NUM_RUEDAS_COCHE, numPlaca, nomAutomoviles, numCaballos, pesoAutomoviles);
		
		return todoTerrenoTem;
	}
	
	protected static String nombreTodoTerreno() {
		String [] nombre = {"Jeep Wrangles", "Lan Rover Defender", "Toyota Lan Crusier"
				, "Land Rover Discovery"};
		Random random = new Random();
		
		return nombre[random.nextInt(nombre.length)];
		
	}
	
	protected static double pesoCocheTodoTerreno() {
		double [] pesoCoche = {2383.0, 2546.0, 2354.0};
		Random random = new Random();
		
		
		return pesoCoche[random.nextInt(pesoCoche.length)];
		
	}
	
	protected static int numCaballosTodoTerreno() {
		int [] numCaballos = {375, 380, 385};
		Random random = new Random();
		
		
		return numCaballos[random.nextInt(numCaballos.length)];
		
	}
	
	/*<<<<<<<<<<<<< FINAL METODOS PARA CREAR TERRENOS>>>>>>>>>>>>>>>>>>>>*/
	
/*<<<<<<<<<<<<<METODOS PARA CREAR MOTOS>>>>>>>>>>>>>>>>>>>>*/
	
	protected static Moto crearMoto() {
		Moto motoTem;
		numPlaca = elegirPlacas();
		nomAutomoviles = nombreMoto();
		numCaballos = numCaballosMoto();
		pesoAutomoviles = pesoMoto();
		motoTem = new Moto(NUM_RUEDAS_MOTO, numPlaca, nomAutomoviles, numCaballos, pesoAutomoviles);
		
		return motoTem;
	}
	
	protected static String nombreMoto() {
		String [] nombre = {"CfMoto 125NK", "Sym Adxtg", "Honda CDB"
				, "Voge 300"};
		Random random = new Random();
		
		return nombre[random.nextInt(nombre.length)];
		
	}
	
	protected static double pesoMoto() {
		double [] pesoCoche = {250.0, 260.0, 170.0};
		Random random = new Random();
		
		
		return pesoCoche[random.nextInt(pesoCoche.length)];
		
	}
	
	protected static int numCaballosMoto() {
		int [] numCaballos = {375, 380, 385};
		Random random = new Random();
		
		
		return numCaballos[random.nextInt(numCaballos.length)];
		
	}
	
	/*<<<<<<<<<<<<< FINAL METODOS PARA CREAR TERRENOS>>>>>>>>>>>>>>>>>>>>*/
	
	protected static String elegirPlacas () {
		String placa = "";
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			int letraAscii = random.nextInt(26) + 65;
			char letra = (char) letraAscii;
			placa = placa + letra;
		}
		
		for (int i = 0; i < 3; i++) {
			int numero = random.nextInt(10);
			placa = placa + String.valueOf(numero);
		}
		
		return placa;
	}
}
