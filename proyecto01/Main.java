package com.cursojava.proyecto01;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Automovil> listaTodoTerreno = new ArrayList<>();
		ArrayList<Automovil> listaMoto = new ArrayList<>();
		
		listaTodoTerreno = CrearAutomoviles.crearListaTodoTerreno();
		System.err.println("lista coches todo terreno");
		for (Automovil automovil : listaTodoTerreno) {
			System.out.println(automovil.toString());
		}
		System.err.println("lista motos");
		listaMoto = CrearAutomoviles.crerListaMoto();
		for (Automovil automovil : listaMoto) {
			System.out.println(automovil.toString());
		}
		
		
	}

}
