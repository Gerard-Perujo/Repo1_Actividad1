package MariaIsabel;

public class MariaIsabel {
	//Atributos privados
	private String nombre, hobby1, hobby2, hobby3;
	
<<<<<<< HEAD
	//Constructores, uno con todos los parametros y otro sin nada
	public MariaIsabel() {
		super();
	}

	public MariaIsabel(String nombre, String hobby1, String hobby2, String hobby3) {
=======
	private String nombre, hobby1, hobby2, hobby3, com1, com2, com3;
	//Constructores

<<<<<<< HEAD
	public MariaIsabel(String nombre, String hobby1, String hobby2, String hobby3, String comida1, String comida2,
			String comida3) {
=======
	public MariaIsabel(String nombre, String hobby1, String hobby2, String hobby3, String com1, String com2,
			String com3) {
>>>>>>> develop
>>>>>>> 9a5966787144b7f294a56fde12347fd62c3bd25b
		super();
		this.nombre = nombre;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
<<<<<<< HEAD
=======
		this.com1 = com1;
		this.com2 = com2;
		this.com3 = com3;
>>>>>>> 9a5966787144b7f294a56fde12347fd62c3bd25b
	}
<<<<<<< HEAD
	
	
	//Getters and setters

<<<<<<< HEAD
		public String getNombre() {
=======

=======
	public MariaIsabel() {
		super();
	}
	
	//Getters and setters
	
>>>>>>> develop
	public String getNombre() {
>>>>>>> 9a5966787144b7f294a56fde12347fd62c3bd25b
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
	
<<<<<<< HEAD
	// Redefinir metodo de Object

		@Override
	public String toString() {
		return "MariaIsabel [nombre=" + nombre + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
				+ "]";
=======
<<<<<<< HEAD

	//Metodo toString 

=======
	public String getCom1() {
		return com1;
	}
	public void setCom1(String com1) {
		this.com1 = com1;
	}
	public String getCom2() {
		return com2;
	}
	public void setCom2(String com2) {
		this.com2 = com2;
	}
	public String getCom3() {
		return com3;
	}
	public void setCom3(String com3) {
		this.com3 = com3;
	}
	
	
	//Metodo toString 
>>>>>>> develop
	
	@Override
	public String toString() {
		return "MariaIsabel [nombre=" + nombre + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
				+ ", com1=" + com1 + ", com2=" + com2 + ", com3=" + com3 + "]";
>>>>>>> 9a5966787144b7f294a56fde12347fd62c3bd25b
	}

		//Metodos propios
		public String llamarNombre() {
			return nombre;
		}

		public String misHobbys() {
			return hobby1+ ", " + hobby2+ " y " + hobby3;
		}
		
<<<<<<< HEAD

=======
		public String comidasFavoritas() {
			return com1 + ", " + com2 + " y " + com3;
		}
>>>>>>> 9a5966787144b7f294a56fde12347fd62c3bd25b

}
