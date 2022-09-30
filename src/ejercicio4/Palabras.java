package ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Palabras {
	//ATRIBUTOS
	TreeMap<Integer, TreeSet<String>> palabras;
	
	//CONSTRUCTORES
	public Palabras() {
		palabras = new TreeMap<Integer, TreeSet<String>>();
	}
	
	/**
	 * Constructor que crea la estructura y almacena en ella las palabras que forman
	 * parte de la cadena que se le pasa como parametro.
	 * @param cadena
	 */
	public Palabras(String cadena) {
		this();
		insertarCadena(cadena);
	}
	//METODOS
	/**
	 * Metodo que a�ade una palabra, que se la pasa como parametro, al conjunto
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
	 * Metodo que a�ade las palabras de una cadena, que se le pasa como parametro, al 
	 * conjunto, segun su longitud.
	 */
	public void insertarCadena(String cadena) {
		String[] lista = cadena.split("[\\s\\W\\d]+");
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
	
	/**
	 * Metodo que borra todos los elementos de la coleccion.
	 */
	public void borrarColeccion() {
		palabras.clear();
	}
	
	/**
	 * Metodo que comprueba si la coleccion esta vacia.
	 * @return
	 */
	public boolean estaVacia() {
		return palabras.isEmpty();
	}
	
	/**
	 * Metodo que muestra el contenido de la coleccion con el formato:
	 * LONGITUD: (n� de letras de la palabra) N� DE PALABRAS: (n� de palabras de esa longitud)
	 */
	public void mostrarColeccion() {
//		palabras.forEach(longitud, valores -> System.out.println("LONGITUD: %d - PALABRAS: %s\n", longitud, valores));
//		for (Entry<Integer, TreeSet<String>> p: palabras.entrySet()) {
//			System.out.printf("LONGITUD: %d - N� PALABRAS: %d - PALABRAS: %s\n", p.getKey(),p.getValue().size() , p.getValue());
//		}
		if (!palabras.isEmpty()) {
			Iterator<Entry<Integer, TreeSet<String>>> i = palabras.entrySet().iterator();
			while (i.hasNext()) {
				Entry<Integer, TreeSet<String>> e = i.next();
				System.out.printf("LONGITUD: %d Nº DE PALABRAS: %d\n", e.getKey(),e.getValue().size());
			}
		}
		else {
			System.out.println("LA COLECCION ESTA VACIA");
		}
	}
	
	/**
	 * Metodo que lee un fichero cuya ruta se pasa como parametro y almacena las palabras en la
	 * coleccion.
	 * @param ruta
	 */
	public void leerFichero(String ruta) {
		try (BufferedReader in = new BufferedReader(new FileReader(ruta))) {
			String linea = in.readLine();
			while (linea != null) {
				insertarCadena(linea);
				linea = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se encuentra");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
