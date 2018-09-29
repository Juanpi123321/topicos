package Gallardo.CalculadoraMaven;

/**
 * Calculadora class
 * @author Agustin Mascheroni
 * @author Juanpi Gallardo
 *
 */
public class Calculadora {

	/**
	 * Realiza una sumar
	 * 
	 * @param numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Agustin Mascheroni
	 */
	public int sumar(int... numeros) {
		int resultado = 0;
		for (int numero: numeros) {
			resultado = resultado + numero;
		}
		return resultado;
	}

	/**
	 * Realiza una resta
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Agustin Mascheroni
	 */
	public int restar(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * Realiza una multiplicacion
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Agustin Mascheroni
	 */
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Realiza una división
	 * 
	 * @param dos números enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Agustin Mascheroni
	 */
	public int dividir(int dividendo, int divisor) {
		try {
			return dividendo / divisor;
		} catch(Exception e) {
			return 0;
		}
	}
	
	/**
	 * Realiza una potencia
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2); //hace un cast xq pow utiliza double
	}

	
}
