package MariaIsabel;

public class MariaIsabel {
	
	private String nombre, hobby1, hobby2, hobby3, comida1, comida2, comida3;
	//Constructores
	public MariaIsabel(String nombre, String hobby1, String hobby2, String hobby3, String comida1, String comida2,
			String comida3) {
		super();
		this.nombre = nombre;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
		this.comida1 = comida1;
		this.comida2 = comida2;
		this.comida3 = comida3;
	}
	
	public MariaIsabel() {
		super();
		
	//Getters and setters
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
	
	public String getComida1() {
		return comida1;
	}
	public void setComida1(String comida1) {
		this.comida1 = comida1;
	}
	public String getComida2() {
		return comida2;
	}
	public void setComida2(String comida2) {
		this.comida2 = comida2;
	}
	public String getComida3() {
		return comida3;
	}
	public void setComida3(String comida3) {
		this.comida3 = comida3;
	}
	//Metodo toString 
	@Override
	public String toString() {
		return "MariaIsabel [nombre=" + nombre + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
				+ ", comida1=" + comida1 + ", comida2=" + comida2 + ", comida3=" + comida3 + "]";
	}
	
	//Metodos propios
		public String llamarNombre() {
			return nombre;
		}

		public String misHobbys() {
			return hobby1+ ", " + hobby2+ " y " + hobby3;
		}
		
		public String comidasFavoritas() {
			return comida1 + ", " + comida2 + " y " + comida3;
		}

}
