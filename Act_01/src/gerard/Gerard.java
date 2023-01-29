package gerard;

public class Gerard {
		
		private String nombre;

		
		
		public Gerard(String nombre) {
			super();
			this.nombre = nombre;
		}



		public Gerard() {
			super();
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		@Override
		public String toString() {
			return "Gerard [nombre=" + nombre + "]";
		}

	
public String llamarNombre() {
	return nombre;
}
}
