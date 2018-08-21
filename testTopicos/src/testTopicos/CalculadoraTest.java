package testTopicos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora c;
	@Before
	public void inicio(){
		c=new Calculadora();
	}
	@After
	public void fin(){
		System.out.println("Nada"); //aca podria ir un eliminar objeto o algo asi
	}
	@Test
	public void testSuma(){
		int resultado = c.suma(2,3);
		int esperado = 5; //2 + 3 = 5
		assertEquals(esperado,resultado); //compara esos dos
	}
	@Test
	public void testResta(){
		int resultado = c.resta(3,2);
		int esperado = 1; //3 - 2 = 1
		assertEquals(esperado,resultado);
	}
	@Test
	public void testMultiplica(){
		int resultado = c.multiplica(3,3);
		int esperado = 9; //3 * 3 = 9
		assertEquals(esperado,resultado);
	}
	@Test
	public void testDivide(){
		int resultado = c.divide(3,3);
		int esperado = 1; //3 / 3 = 1
		assertEquals(esperado,resultado);
	}
}
