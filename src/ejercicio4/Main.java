package ejercicio4;

public class Main {
	
	static String instruccion;
	static String[] palabras;
	static Palabras p;
	
	public static void main(String[] args) {
		Palabras prueba = new Palabras();
		prueba.leerFichero("El Quijote.txt");
		prueba.mostrarColeccion();
		prueba.mostrarPalabras(0);
		
//		Palabras lista = new Palabras("Esta cadena es de prueba");
//		lista.mostrarColeccion();
		
//		p = new Palabras();
//		boolean fin = false;
//		do {
//			System.out.println("Las instrucciones disponibles son: ");
//			System.out.println("añadir: <palabras> | Se almacenaran las palabras escritas a continuacion de los dos puntos");
//			System.out.println("lista n            | Se mostrara la lista de palabras de longitud n");
//			System.out.println("borrar             | Borra todas las palabras almacenadas");
//			System.out.println("borrar: <palabras> | Sustituye las palabras almacenadas anteriormente por las palabras escritas a continuacion de los dos puntos");
//			System.out.println("fin                | Termina el programa");
//			System.out.println("========================================================================");
//			leerInstruccion(utilidades.Entrada.pedirTexto());
//			switch (instruccion) {
//			case "añadir:":
//				System.out.println("*********************************************");
//				insertarDeArray(palabras);
//				System.out.println("*********************************************");
//				break;
//			case "lista":
//				System.out.println("*********************************************");
//				p.mostrarPalabras(Integer.parseInt(palabras[0]));
//				System.out.println("*********************************************");
//				break;
//			case "borrar":
//				System.out.println("*********************************************");
//				p.borrarColeccion();
//				if (p.estaVacia()) {
//					System.out.println("Coleccion borrada");
//				}
//				else {
//					System.out.println("Borrado incorrecto");
//				}
//				System.out.println("*********************************************");
//				break;
//			case "borrar:":
//				System.out.println("*********************************************");
//				p.borrarColeccion();
//				insertarDeArray(palabras);
//				System.out.println("*********************************************");
//				break;
//			case "fin":
//				fin = true;
//				break;
//			default:
//				System.out.println("*********************************************");
//				System.out.println("INSTRUCCION INCORRECTA");
//				System.out.println("*********************************************");
//				break;
//			}
//		} while (!fin);
	}
	
	/**
	 * Metodo que recibe una cadena
	 * @param texto
	 */
	public static void leerInstruccion(String texto) {
		String[] cadena = texto.split("[^a-zA-z0-9ñ:]+");
		for (String palabra:cadena) {
			System.out.println(palabra);
		}
		instruccion = cadena[0];
		palabras = new String[cadena.length-1];
		for (int i = 1; i<cadena.length; i++) {
			palabras[i-1] = cadena[i];
		}
	}
	
	public static void insertarDeArray(String[] palabras) {
		for (String palabra:palabras) {
			p.insertar(palabra);
		}
	}
	
	
	

}
