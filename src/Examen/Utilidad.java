package Examen;
 /**
  * Clase para el examen
  * @author Manuel
  * @version 1.0
  * @since 06/03/2023
  */

public class Utilidad {

	/**
	 * Emplea el metodo factorial para devolver el factorial
	 * @param a entero para calcular el factorial
	 * @return resultado de aplicar el factorial
	 * @see factorial()
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * Calcula el factorial de un número mediante recursividad
	 * @param n entero a calcular su factorial
	 * @return resultado
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * Método para aplicar factorización
	 * @param a
	 * @param b
	 * @return
	 * @deprecated
	 */
	public boolean refactorizacionD(int a, int b) {
		// Extraído a método para eliminar estructura repetitiva
		int c = sumaExtracted(a , b);
		
		int d = sumaExtracted(c , 34);
		
		//Extraído como método
		return extracted(d);
	}

	/**
	 * Método para sumar
	 * @param c
	 * @return resultado suma
	 */
	private int sumaExtracted(int a, int b) {
		int d = a + b;
		return d;
	}
	

	/**
	 * Calculo si d es primo
	 * @param d
	 * @return booleano primo
	 */
	private boolean extracted(int d) {
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		//devuelvo directamente el resultado
		return (!esPrimo);
	}
	
}