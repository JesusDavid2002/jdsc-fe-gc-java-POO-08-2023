package ejerciciosPOO.ejercicio6;

public class Coche {
	
	private String marca;
	private String modelo;
	private int cilindrada;
	private double potencia;
	
	public Coche(String marca, String modelo, int cilindrada, double potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche("BMW", "E30", 2302, 200);
		System.out.println("El coche es un " + coche1.getMarca() + " - " + coche1.getModelo() + " con una cilindrada de " + 
		coche1.getCilindrada() + " cm3 y una potencia de " + coche1.getPotencia() + " PS.");
		
	}

}
