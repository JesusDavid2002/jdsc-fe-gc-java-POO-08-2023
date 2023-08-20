package ejerciciosPOO.ejercicio4;

public class PruebaPersonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona ();
		Persona persona2 = new Persona ();
		
		persona1.setNombre("Juan Luis");
		persona2.setNombre("María");
		
		persona1.saludo(persona1.getNombre());
		persona2.saludo(persona2.getNombre());
	}

}
