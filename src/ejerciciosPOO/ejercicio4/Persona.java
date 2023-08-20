package ejerciciosPOO.ejercicio4;

public class Persona {
	
	private String nombre;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludo(String nombre) {
		System.out.println("Hola, soy " + nombre);
	}
	
}
