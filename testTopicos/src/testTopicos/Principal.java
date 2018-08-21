package testTopicos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa Principal");
		int a = 2;
		int b = 2;
		Calculadora c = new Calculadora();
		System.out.println(a+" + "+b+" es: "+ c.suma(a,b));
		System.out.println(a+" / "+b+" es: "+ c.divide(a,b));
	}

}
