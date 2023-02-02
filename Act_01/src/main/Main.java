package main;


import Noelia.Noelia;

import MariaIsabel.MariaIsabel;

import gerard.Gerard;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Actividad1 de Entornos");
		System.out.println("----------------------");
		
		//creo el objeto Gerard//
		
		Gerard ger = new Gerard("Gerard", "Snowboard", "Senderismo", "Automobilismo", "patatas fritas", "turrones", "polvorones");
		
		//utilizo el metodo llamar para hacer el syso//
		
		System.out.println("hola soy " + ger.llamarNombre());
		

		//Se crea el objeto 

		Noelia noe = new Noelia ("Noelia", "natación", "kick boxing", "esquiar", "macarrones", "sopa", "paella"); 

		
		//Se realiza SYSO llamando al método
		System.out.println("Hola soy" + noe.llamarNombre());

		//creo el objeto MariaIsabel y llamo al metodo en el syso
		
		MariaIsabel maria = new MariaIsabel ("Maria Isabel", "buceo", "video", "aviones", "lentejas", "crepes", "rollitos de primavera");
		System.out.println("Hola soy " + maria.llamarNombre());
		
		
		//llamo el metodo hobies//
		
		System.out.println("Los hobbies de Gerard son : " + ger.tiposHobies());
		System.out.println("Los hobbies de Maria Isabel son : " + maria.misHobbys());
		System.out.println("los hobbies de Noelia son: " + noe.tiposHobies());
		
		// Llamo al metodo de comidas favoritas
		System.out.println("Las comidas favoritas de Maria Isabel son : " + maria.comidasFavoritas());
		System.out.println("Las comidas favoritas de Gerard son : " + ger.comidaQueMeGusta());
		System.out.println("Las comidas favoritass de Noelia son : " + noe.comidasFavoritas());

	}

}
