package ejerciciosPOO.ejercicio8;

public class Password {
	
	private int longitud = 8;
	private String contra;
	
	public Password(String contra) {
		this.contra = contra;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contra = generarContra(longitud);
	}

	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	private String generarContra(int longitud) {
		// TODO Auto-generated method stub
		String datosContra = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
		String contra = "";
		
		for(int i = 0; i < longitud; i++) {
			contra += (datosContra.charAt((int)(Math.random() * datosContra.length())));
		}
		
		return contra;
	}
	
}
