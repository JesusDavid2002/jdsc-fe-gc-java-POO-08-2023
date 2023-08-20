package ejerciciosPOO.ejercicio2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("Juan Carlos", 4500);
		Empleado empleado2 = new Empleado("Pedro", 2300);
		
		System.out.println("El nombre del empleado es: " + empleado1.getNombre());
		System.out.println("El sueldo del empleado es: " + empleado1.getSueldo());
		empleado1.pagarImpuestos(empleado1.getSueldo());
		System.out.println("-------------------------------");
		System.out.println("El nombre del empleado es: " + empleado2.getNombre());
		System.out.println("El sueldo del empleado es: " + empleado2.getSueldo());
		empleado2.pagarImpuestos(empleado2.getSueldo());
		
	}

}
