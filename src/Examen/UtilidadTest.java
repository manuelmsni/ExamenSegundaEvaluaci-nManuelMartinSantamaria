package Examen;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UtilidadTest {
	
	static Utilidad ut;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ut = new Utilidad();
	}

	@Test
	public void cP1() {
		int esperado = 0;
		int resultado = ut.ejercicioD(0);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void cP2() {
		int esperado = 4;
		int resultado = ut.ejercicioD(2);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void cP3() {
		int esperado = 9;
		int resultado = ut.ejercicioD(3);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void cP4() {
		int esperado = 28;
		int resultado = ut.ejercicioD(4);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void cP5() {
		int esperado = 125;
		int resultado = ut.ejercicioD(5);
		assertEquals(esperado, resultado, 0);
	}

}
