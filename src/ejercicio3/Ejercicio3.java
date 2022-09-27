package ejercicio3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> noRepetidas = new ArrayList<>();
		LinkedHashSet<String> repetidas = new LinkedHashSet<>();
		System.out.println("Escribe una frase");
//		String frase = utilidades.Entrada.pedirTexto().toLowerCase();
		String frase = "abc5 d fd fd8 6abc";
		Scanner s = new Scanner(frase);
		System.out.println(s.delimiter());
		s.useDelimiter("[^a-zA-z]+");
		System.out.println(s.delimiter());
		while (s.hasNext()) {
			String temp = s.next();
			if (noRepetidas.contains(temp)) {
				repetidas.add(temp);
				noRepetidas.remove(temp);
			}
			else if (!repetidas.contains(temp)) {
				noRepetidas.add(temp);
			}
		}
		s.close();
//		String[] lista = frase.split(" ");
//		for (String palabra : lista) {
//			if (noRepetidas.contains(palabra)) {
//				repetidas.add(palabra);
//				noRepetidas.remove(palabra);
//			}
//			else if (!repetidas.contains(palabra)) {
//				noRepetidas.add(palabra);
//			}
//		}
		System.out.println("Palabras repetidas:");
		System.out.println(repetidas);
		System.out.println("Palabras no repetidas:");
		System.out.println(noRepetidas);
		System.out.println(repetidas.size());
		
	}

}
