package colecciones;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Colecciones {
	
	public void eliminarLasDeLongitudPar(ArrayList<String> cadenas) {
		for (String cadena : cadenas) {
			if (cadena.length()%2 == 0) {
				cadenas.remove(cadena);
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
