package ejerciciosPOO.ejercicio2;

public class Empleado {
	
	private String nombre;
	private int sueldo;
	
	public Empleado() {
		this.nombre = "";
		this.sueldo = 0;
	}
	
	public Empleado(String newNombre, int newSueldo) {
		this.nombre = newNombre;
		this.sueldo = newSueldo;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void pagarImpuestos (int sueldo) {
		
		if(sueldo >= 3000) {
			System.out.println("Debe de pagar impuestos.");
		} else {
			System.out.println("No debe de pagar impuestos.");
		}
	}
}
