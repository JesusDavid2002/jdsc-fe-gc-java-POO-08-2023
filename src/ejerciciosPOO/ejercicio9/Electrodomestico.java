package ejerciciosPOO.ejercicio9;

public class Electrodomestico {	
	
	protected double precioBase = 100;
	protected String color = "blanco";
	protected char consumo = 'F';
	protected double peso = 5;
	
	public Electrodomestico() {}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = validarColor(color) ? color : "blanco";
		this.consumo = validarConsumo(consumo) ? consumo : 'F';
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public char getConsumo() {
		return consumo;
	}
	
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean validarConsumo(char cosumo) {
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		boolean validado = false;
		
		for(char letra : letras) {
			if(letra == Character.toLowerCase(cosumo)) {
				validado = true;
			}
		}
		return validado;
	}
	
	public boolean validarColor(String color) {
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean validado = false;
		
		for(String colorArray : colores) {
			if(colorArray.equalsIgnoreCase(color)) {
				validado = true;
			}
		}
		return validado;
	}
}
