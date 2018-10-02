package Gallardo.CalculadoraMaven;

/**
 * Calculadora class
 * @author Agustin Mascheroni
 * @author Juanpi Gallardo
 *
 */
public class Calculadora {

	/**
	 * Realiza la operacion Sumar
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
	 * Realiza la operacion Resta
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
	 * Realiza la operacion Multiplicacion
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
	 * Realiza la operacion División
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
	 * Realiza la operacion Potencia
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2); //hace un cast xq pow utiliza double
	}

	/**
	 * Realiza la operacion Factorial
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int factorial(int num) {
		int resultado = 1;
		while(num > 1)
			resultado *= num--; //A *= B-->(A = A * B)      
								  //-- decrementa en una unidad
		return resultado;
	}
	
	/**
	 * Realiza la sucesion Fibonacci y devuelve el valor de la posicion ingresada
	 * 0,1,1,2,3,5,8,13,21,34,55,89,144,..
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int fibonacci(int num) {
		int a = 0;
		int b = 1;
		for(int i = 2; i <= num; i++){
			a = a + b;
			b = a - b;
		}
		return a;
	}
	
	/**
	 * Realiza la operacion Mayor, devuelve el mayor valor de dos numero ingresados
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int mayor(int num1, int num2) {
		if(num1 > num2){
			return num1;
		}
		return num2;
	}
	
	/**
	 * Realiza la operacion Menor, devuelve el menor valor de dos numero ingresados
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int menor(int num1, int num2) {
		if(num1 < num2){
			return num1;
		}
		return num2;
	}
	
	/**
	 * Realiza la operacion Cuadrado
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int cuadrado(int num) {
		return num * num;
	}
	
	/**
	 * Realiza la operacion Raiz Cuadrada
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo double
	 * 
	 * @author Juanpi Gallardo
	 */
	public int raizCuadrada(int num) {
		return (int) Math.sqrt(num); //hace un cast xq sqrt utiliza double
	}
	
	/**
	 * Realiza la operacion Valor Absoluto
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo int
	 * 
	 * @author Juanpi Gallardo
	 */
	public int valorAbsoluto(int num) {
		if (num < 0){
			return (num * -1);
		}
		return num;
	}
	
	/**
	 * Realiza la operacion Raiz Cubica
	 * 
	 * @param un numero entero de tipo int
	 * @return resultado de tipo double
	 * 
	 * @author Juanpi Gallardo
	 */
	public int raizCubica(int num) {
		return (int) Math.cbrt(num); //hace un cast xq sqrt utiliza double
	}
}
