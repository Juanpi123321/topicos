package testTopicos;
import testTopicos.Calculadora;

public class Principal {
	public static void main(String[] args){
		Calculadora c = new Calculadora();
		int resultado = c.sumar(2,3);
		System.out.print("Resultado: " + resultado);
	}
}
