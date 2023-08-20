package ejerciciosPOO.ejercicio3;

public class Operaciones {
	
	private int numero1;
	private int numero2;
	
	public Operaciones(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int getNum1() {
		return numero1;
	}
	
	public int getNum2() {
		return numero2;
	}
	
	public void Suma(int numero1, int numero2) {
		int result = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + result);
	}
	
	public void Resta(int numero1, int numero2) {
		int result = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + result);
	}
	
	public void Multi(int numero1, int numero2) {
		int result = numero1 * numero2;
		System.out.println("El resultado de la multiplicación es: " + result);
	}
	
	public void Div(double numero1, double numero2) {
		double result = numero1 / numero2;
		System.out.println("El resultado de la división es: " + result);
	}
}
