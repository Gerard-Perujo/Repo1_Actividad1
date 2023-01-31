package Noelia;

public class Noelia {
	
	private String nombre, hobbi1, hobbi2, hobbi3; 
	
	public Noelia (String nombre, String hobbi1, String hobbi2, String hobbi3) {
		super();
		this.nombre = nombre;
		this.hobbi1 = hobbi1;
		this.hobbi2 = hobbi2;
		this.hobbi3 = hobbi3;
	}
	
	public Noelia() {
		super();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getHobbi1() {
		return hobbi1;
	}



	public void setHobbi1(String hobbi1) {
		this.hobbi1 = hobbi1;
	}



	public String getHobbi2() {
		return hobbi2;
	}



	public void setHobbi2(String hobbi2) {
		this.hobbi2 = hobbi2;
	}



	public String getHobbi3() {
		return hobbi3;
	}



	public void setHobbi3(String hobbi3) {
		this.hobbi3 = hobbi3;
	}




	

@Override
	public String toString() {
		return "Noelia [nombre=" + nombre + ", hobbi1=" + hobbi1 + ", hobbi2=" + hobbi2 + ", hobbi3=" + hobbi3
				+ "]";
	}




	public String tiposHobies() {
		return hobbi1 + hobbi2 + hobbi3;
}

	
	
	
public String llamarNombre() {
	return nombre; 
	
}
	
	
}
