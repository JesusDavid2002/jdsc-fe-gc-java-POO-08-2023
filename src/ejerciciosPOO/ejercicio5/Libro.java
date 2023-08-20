package ejerciciosPOO.ejercicio5;

public class Libro {
	
	private String autor;
	private String titulo;
	private String ubicacion;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		libro1.setAutor("Robert Greene");
		libro1.setTitulo("48 leyes de poder");
		libro1.setUbicacion("Londres");
		
		System.out.println("El autor " + libro1.getAutor() + " a escrito " + libro1.getTitulo() + " ubicado en " + libro1.getUbicacion());
		
	}

}




