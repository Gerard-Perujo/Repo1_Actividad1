package MariaIsabel;

public class MariaIsabel {
	//Atributos privados
	private String nombre, hobby1, hobby2, hobby3;
	
	//Constructores, uno con todos los parametros y otro sin nada
	public MariaIsabel() {
		super();
	}

	public MariaIsabel(String nombre, String hobby1, String hobby2, String hobby3) {
		super();
		this.nombre = nombre;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
	}
	
	
	//Getters and setters

		public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHobby1() {
		return hobby1;
	}

	public void setHobby1(String hobby1) {
		this.hobby1 = hobby1;
	}

	public String getHobby2() {
		return hobby2;
	}

	public void setHobby2(String hobby2) {
		this.hobby2 = hobby2;
	}

	public String getHobby3() {
		return hobby3;
	}

	public void setHobby3(String hobby3) {
		this.hobby3 = hobby3;
	}
	
	// Redefinir metodo de Object

		@Override
	public String toString() {
		return "MariaIsabel [nombre=" + nombre + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
				+ "]";
	}

		//Metodos propios
		public String llamarNombre() {
			return nombre;
		}

		public String misHobbys() {
			return hobby1+ ", " + hobby2+ " y " + hobby3;
		}
		


}
