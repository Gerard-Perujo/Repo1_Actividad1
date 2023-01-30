package main;

import MariaIsabel.MariaIsabel;
import gerard.Gerard;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Actividad1 de Entornos");
		System.out.println("----------------------");
		
		//creo el objeto Gerard//
		
		Gerard ger = new Gerard("Gerard");
		
		//utilizo el metodo llamar para hacer el syso//
		
		System.out.println("hola soy " + ger.llamarNombre());
		
		//creo el objeto Maria y llamo al metodo en el syso
		
		MariaIsabel maria = new MariaIsabel ("Maria Isabel");
		System.out.println("Hola soy " + maria.llamarNombre());

	}

}
