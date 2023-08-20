package ejerciciosPOO.ejercicio1;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno() {
		this.nombre = "";
		this.edad = 0;
	}
	
	public Alumno(String newNombre, int newEdad) {
		this.nombre = newNombre;
		this.edad = newEdad;
	}
	

	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}

	public void mayoriaEdad (int edad) {
			
		if(edad >= 18) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}
	}

}
