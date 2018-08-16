package testTopicos;

import junit.framework.TestCase;

public class CalculadoraTest2 extends TestCase {

	Calculadora c = new Calculadora();
	int resultado = c.sumar(2,2);
	assertEquals(4,resultado);	
}
