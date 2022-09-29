package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Palabras prueba = new Palabras();
		prueba.mostrarColeccion();
		prueba.leerFichero("El Quijote.txt");
		prueba.mostrarColeccion();
		prueba.comprobar("del");
		prueba.mostrarPalabras(3);

	}

}
