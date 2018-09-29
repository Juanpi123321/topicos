package Gallardo.CalculadoraMaven;

import org.junit.Assert;
import org.junit.Test;


/**
 * CalculadoraTest class
 * @author Agustin Mascheroni
 *
 */
public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	
	/**
	 * Verifica el escenario simple del metodo sumar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void sumaTest() {
		int a = 2;
		int b = 5;
		int c = 3;
		int resultado = 10;
		int obtenido = calculadora.sumar(a, b, c);
		Assert.assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo restar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void restaTest() {
		int a = 10;
		int b = 2;
		int resultado = 8;
		int obtenido = calculadora.restar(a, b);
		Assert.assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo multiplicar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void multiplicacionTest() {
		int a = 2;
		int b = 3;
		int resultado = 6;
		int obtenido = calculadora.multiplicar(a, b);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo dividir
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void dividirTest() {
		int a = 10;
		int b = 2;
		int resultado = 5;
		int obtenido = calculadora.dividir(a, b);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo potencia
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void potenciaTest() {
		int a = 2;
		int b = 3;
		int resultado = 8;
		int obtenido = calculadora.potencia(a, b);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo factorial
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void factorialTest() {
		int a = 4;
		int resultado = 24;
		int obtenido = calculadora.factorial(a);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo fibonacci
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void fibonacciTest() {
		int a = 5;
		int resultado = 3;
		int obtenido = calculadora.fibonacci(a);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo mayor
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void mayorTest() {
		int a = 2;
		int b = 5;
		int resultado = 5;
		int obtenido = calculadora.mayor(a, b);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo menor
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void menorTest() {
		int a = 2;
		int b = 5;
		int resultado = 2;
		int obtenido = calculadora.menor(a, b);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo cuadrado
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void cuadradoTest() {
		int a = 5;
		int resultado = 25;
		int obtenido = calculadora.cuadrado(a);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo raizCuadrada
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void raizCuadradaTest() {
		int a = 25;
		int resultado = 5;
		int obtenido = calculadora.raizCuadrada(a);
		Assert.assertEquals(resultado, obtenido);
	}
	
	/**
	 * Verifica el escenario simple del metodo valorAbsoluto
	 * 
	 * @author Juanpi Gallardo
	 */
	@Test
	public void valorAbsolutoTest() {
		int a = -5;
		int resultado = 5;
		int obtenido = calculadora.valorAbsoluto(a);
		Assert.assertEquals(resultado, obtenido);
	}
}