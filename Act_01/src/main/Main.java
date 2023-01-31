package main;

import Noelia.Noelia;
import gerard.Gerard;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Actividad1 de Entornos");
		System.out.println("----------------------");
		
		//creo el objeto Gerard//
		
		Gerard ger = new Gerard("Gerard");
		
		//utilizo el metodo llamar para hacer el syso//
		
		System.out.println("hola soy " + ger.llamarNombre());
		
		//Se crea el objeto 
		Noelia noe = new Noelia ("Noelia", "kick boxing", "natación", "esquiar"); 
		
		//Se realiza SYSO llamando al método
		System.out.println("Hola soy" + noe.llamarNombre());
	}

}
