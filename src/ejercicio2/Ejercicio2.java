package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		for (int i=0; i<100; i++) {
			numeros.add(random.nextInt(100)+1);
		}
		System.out.println("\nListado numeros ArrayList");
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedHashSet<Integer> noRepetidos = new LinkedHashSet<>();
		for (Integer numero : numeros) {
			noRepetidos.add(numero);
		}
		System.out.println("\nListado numeros LinkedHashSet");
		for (Integer numero : noRepetidos) {
			System.out.println(numero);
		}
		TreeSet<Integer> ordenados = new TreeSet<>();
		for (Integer numero : noRepetidos) {
			ordenados.add(numero);
		}
		System.out.println("\nListado numeros TreeSet");
		ordenados.forEach(numero -> System.out.println(numero));
		System.out.println("Tamaño ArrayList: " + numeros.size());
		System.out.println("Tamaño LinkedHashSet: " + noRepetidos.size());
		System.out.println("Tamaño TreeSet: " + ordenados.size());

	}

}
