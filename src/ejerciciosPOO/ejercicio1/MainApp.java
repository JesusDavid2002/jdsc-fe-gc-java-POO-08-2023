package ejerciciosPOO.ejercicio1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno("Jesus", 18);
		Alumno alumno2 = new Alumno("Marta", 15);
		
		System.out.println("Nombre del alumno: " + alumno1.getNombre());
		System.out.println("Edad del alumno: " + alumno1.getEdad());
		alumno1.mayoriaEdad(alumno1.getEdad());
		System.out.println("-------------------------------");
		System.out.println("Nombre del alumno: " + alumno2.getNombre());
		System.out.println("Edad del alumno: " + alumno2.getEdad());
		alumno2.mayoriaEdad(alumno2.getEdad());
	}

}
