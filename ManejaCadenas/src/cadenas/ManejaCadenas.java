package cadenas;

import utiles.Teclado;

/**
 * ManejaCadenas con paquetes Sube el fichero "ManejaCadenas.java" que basándose
 * en una cadena introducida por teclado: Imprima su longitud Muestre el número
 * de veces que se repite un carácter (también introducido por teclado) Invierta
 * la cadena La convierta a mayúsculas Cuente el número de palabras Indique si
 * es o no un palíndromo
 * 
 * Estructura los códigos en paquetes.
 * 
 * paquete cadenas: clase ManejaCadenas paquete utiles: Clase Teclado
 * 
 * @author Antonio Luque Bravo
 *
 */
public class ManejaCadenas {
	public static void main(String[] args) {
		String cadena = Teclado.leerCadena("Dame una cadena..");
		String cadenaInvertida = "";
		cadena.trim();// Quita los espacios de antes y despues de la cadena.
		System.out.println("La longitud de la cadena introducida es: " + cadena.length());// imprime
																							// su
																							// longitud
		System.out.println("Las veces que se repite ese caracter son: " + repeticionCaracter(cadena));// muestra
																										// las
																										// veces
																										// que
																										// se
																										// repite
																										// el
																										// caracter
																										// introducido
																										// por
																										// teclado.
		System.out.println("Cadena invertida: " + invertirCadena(cadena));// invierte
																			// la
																			// cadena
		System.out.println("Cadena convertida a mayusculas: " + cadena.toUpperCase());// La
																						// coloca
																						// en
																						// mayusculas.
		System.out.println("Hay " + contarPalabras(cadena) + " palabra/s en la cadena introducida.");// Cuenta
																										// las
																										// palabras
																										// que
																										// hay
																										// en
																										// la
																										// cadena.
		cadena = cadena.replace(" ", "");// Reemplaza los espacios por vacios
											// para poder calcular si es
											// palindromo.
		cadenaInvertida = invertirCadena(cadena);
		cadenaInvertida = cadenaInvertida.replace(" ", "");// Reemplaza los
															// espacios por
															// vacios para poder
															// calcular si
															// espalindromo.
		comprobaPalindromo(cadena, cadenaInvertida);// Comprueba si la cadena es
													// palindromo.

	}

	/**
	 * Muestre el n&uacute;mero de veces que se repite un car&aacute;cter
	 * (tambi&eacute;n introducido por teclado)
	 * 
	 * @param cadena
	 *            cadena objetivo.
	 * @return devuelve el n&uacute;mero de veces que se ha repetido.
	 */
	static int repeticionCaracter(String cadena) {
		char caracter;
		int j = 0;
		caracter = Teclado.leerCaracter("Elige el caracter para ver cuantas veces se ha repetido: ");
		for (int i = 0; i < cadena.length(); i++) {
			if (caracter == cadena.charAt(i))
				j++;
		}
		return j;
	}

	/**
	 * Invierte la cadena.
	 * 
	 * @param cadena
	 *            Cadena a invertir.
	 * @return Devuelve la cadena ya invertida.
	 */
	private static String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		return cadenaInvertida;
	}

	/**
	 * Cuenta el n&uacute;mero de palabras de la cadena introducida.
	 * 
	 * @param cadena
	 *            Cadena para calcular el n&uacute;mero de palabras que posee.
	 * @return Devuelve las palabras que contenga esa cadena.
	 */
	static int contarPalabras(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length() - 1; i++) {
			if (cadena.charAt(i) != ' ' && cadena.charAt(i + 1) == ' ')
				contador++;
		}
		return contador + 1;
	}

	/**
	 * Comprueba si la cadena introducida es un pal&iacite;ndromo, es decir se
	 * lee igual por ambos lados.
	 * 
	 * @param cadena
	 *            Cadena
	 * @param cadenaInvertida
	 *            La misma cadena, pero invertida para comprobar si es
	 *            pal&iacute;ndromo.
	 */
	private static void comprobaPalindromo(String cadena, String cadenaInvertida) {
		if (cadenaInvertida.equalsIgnoreCase(cadena))
			System.out.println("La cadena es palindroma");
		else
			System.out.println("La cadena no es palindroma");
	}

}
