package main;

import java.util.ArrayList;

/**
 * Clase para pruebas del GIT
 * @author bpj15
 *
 */

class ExampleClass {
	// Tu programa convierte texto a número
	public static void main(String args[]) {
		System.out.println("Pasar texto (String) a entero (int)");
		String numCadena = "1";
		String variableNoUSada= "";
		int numEntero = Integer.parseInt(numCadena);
		System.out.println("Resultado: " + numEntero);
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
	}

	/**
	 * 
	 * @param i
	 * @param a
	 */
	public void metodo(int i, String a) {

	}
}