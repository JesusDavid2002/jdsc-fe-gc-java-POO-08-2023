package ejerciciosPOO.ejercicio3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones op1 = new Operaciones(2, 3);
		op1.Suma(op1.getNum1(), op1.getNum2());
		op1.Resta(op1.getNum1(), op1.getNum2());
		op1.Multi(op1.getNum1(), op1.getNum2());
		op1.Div(op1.getNum1(), op1.getNum2());
	}

}
