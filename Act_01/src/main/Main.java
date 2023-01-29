package main;

import gerard.Gerard;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Actividad1 de Entornos");
		System.out.println("----------------------");
		
		//creo el objeto Gerard//
		
		Gerard ger = new Gerard("Gerard");
		
		//utilizo el metodo llamar para hacer el syso//
		
		System.out.println("hola soy " + ger.llamarNombre());

	}

}
