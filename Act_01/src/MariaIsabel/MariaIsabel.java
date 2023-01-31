package MariaIsabel;

public class MariaIsabel {
	
	private String nombre, hobby1, hobby2, hobby3, com1, com2, com3;
	//Constructores

	

	
	public MariaIsabel() {
		super();
		
	//Getters and setters
	}
	
	
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
	

	//Metodo toString 

	
	
	//Metodos propios
		public String llamarNombre() {
			return nombre;
		}

		@Override
		public String toString() {
			return "MariaIsabel [nombre=" + nombre + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
					+ ", com1=" + com1 + ", com2=" + com2 + ", com3=" + com3 + "]";
		}


		public String misHobbys() {
			return hobby1+ ", " + hobby2+ " y " + hobby3;
		}
		
		public String comidasFavoritas() {
			return com1 + ", " + com2 + " y " + com3;
		}

}
