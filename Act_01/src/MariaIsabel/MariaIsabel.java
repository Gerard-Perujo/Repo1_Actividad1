package MariaIsabel;

public class MariaIsabel {
	
	private String nombre;
	//Constructores

	public MariaIsabel(String nombre) {
		super();
		this.nombre = nombre;
	}
	public MariaIsabel() {
		super();
	}
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodo toString 
	@Override
	public String toString() {
		return "MariaIsabel [nombre=" + nombre + "]";
	}
	
	//Metodo propio
	public String llamarNombre() {
		return nombre;
	}

}
