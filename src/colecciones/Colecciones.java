package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Colecciones {
	static TreeSet<String> ej1 = new TreeSet<>();
	public static void main(String[] args) {
		ej1.add("hola");
		ej1.add("adios");
		ej1.add("casa");
		ej1.add("ola");
		System.out.println(ej1);
		eliminarLasDeLongitudPar(ej1);
		System.out.println(ej1);
	}
	
	public static void eliminarLasDeLongitudPar(TreeSet<String> cadenas) {
		Iterator<String> it = cadenas.iterator();
		while (it.hasNext()) {
			if (it.next().length()%2==0) {
				it.remove();
			}
		}
	}
	
	public boolean contieneImpares(ArrayList<Integer> numeros) {
		boolean imparSi = false;
		int contador = 0;
		for (Integer numero : numeros) {
			if (numero%2!=0) {
				contador++;
			}
		}
		if (contador>0) {
			imparSi = true;
		}
		return imparSi;
	}
	
	public boolean valoresUnicos(LinkedHashMap<String, String> cadenas) {
		boolean resultado = false;
		
		return resultado;
	}
}
