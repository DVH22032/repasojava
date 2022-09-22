package ejercicio1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		LinkedHashSet<String> agenda = new LinkedHashSet<>();
		String nombre;
		int numero;
		System.out.println("Teclea el numero de nombres a insertar");
		numero = utilidades.Entrada.pedirEntero();
		for (int i = 0; i<numero; i++) {
			System.out.println("Teclea un nombre");
			nombre = utilidades.Entrada.pedirTexto();
			agenda.add(nombre);
		}
		System.out.println("AGENDA:");
		Iterator<String> it = agenda.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
