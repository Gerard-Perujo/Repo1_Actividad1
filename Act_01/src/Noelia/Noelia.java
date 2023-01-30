package Noelia;

public class Noelia {
	
	private String nombre;

	
	public Noelia() {
		super();
	}

	public Noelia(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "noelia [nombre=" + nombre + "]";
	} 
	
public String llamarNombre() {
	return nombre; 
	
}
	
	
}
