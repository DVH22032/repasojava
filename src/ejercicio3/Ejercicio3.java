package ejercicio3;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> repetidas = new ArrayList<>();
		LinkedHashSet<String> noRepetidas = new LinkedHashSet<>();
		System.out.println("Escribe una frase");
		String frase = utilidades.Entrada.pedirTexto().toLowerCase();
		String[] lista = frase.split(" ");
		for (String palabra : lista) {
			if (noRepetidas.contains(palabra)) {
				repetidas.add(palabra);
				noRepetidas.remove(palabra);
			}
			else if (!repetidas.contains(palabra)) {
				noRepetidas.add(palabra);
			}
		}
		System.out.println("Palabras repetidas:");
		System.out.println(repetidas);
		System.out.println("Palabras no repetidas:");
		System.out.println(noRepetidas);
		
	}

}
