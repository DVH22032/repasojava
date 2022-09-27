package ejercicio4;

import java.util.TreeMap;
import java.util.TreeSet;

public class Palabras {
	//ATRIBUTOS
	TreeMap<Integer, TreeSet<String>> palabras;
	
	//CONSTRUCTORES
	public Palabras() {
		palabras = new TreeMap<Integer, TreeSet<String>>();
	}
	
	//METODOS
	/**
	 * Metodo que añade una palabra, que se la pasa como parametro, al conjunto
	 * segun su longitud.
	 * @param palabra
	 */
	public void insertar(String palabra) {
		int longitud = palabra.length();
		TreeSet<String> valor = palabras.get(longitud);
		if (valor == null) {
			valor = new TreeSet<String>();
			palabras.put(longitud, valor);
		}
		valor.add(palabra);
	}
	
	/**
	 * Metodo que añade las palabras de una cadena, que se le pasa como parametro, al 
	 * conjunto, segun su longitud.
	 */
	public void insertarCadena(String cadena) {
		String[] lista = cadena.split(" ");
		for (int i=0; i<lista.length; i++) {
			insertar(lista[i]);
		}
	}
	
	/**
	 * Metodo que comprueba si una palabra, que se le pasa como parametro, esta contenida
	 * en la estructura de datos.
	 */
	public void comprobar(String palabra) {
		int longitud = palabra.length();
		TreeSet<String> valor = palabras.get(longitud);
		if (valor != null) {
			if (valor.contains(palabra)) {
				System.out.println("La palabra ya existe");
			}
			else {
				System.out.println("La palabra no existe");
			}
		}
	}
	
	/**
	 * Metodo que muestra todas las palabras de una longitud que se le pasa como parametro.
	 * @param longitud
	 */
	public void mostrarPalabras(int longitud) {
		TreeSet<String> valor = palabras.get(longitud);
		if (valor != null) {
			System.out.println(valor);
		}
		else {
			System.out.println("No existen palabras de esa longitud");
		}
		
	}
	
	public void sustituir(String cadena) {
		
	}
}
