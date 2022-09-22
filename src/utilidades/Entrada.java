package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
	// ATRIBUTOS
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	// METODOS
	public static String pedirTexto() {
		String texto = "";
		boolean esTexto = false;
		do {
			try {
				texto = in.readLine();
				esTexto = true;
			} catch (IOException e) {
				
			}
		} while (!esTexto);
		return texto;
	}
	
	public static int pedirEntero() {
		int entero = 0;
		boolean esEntero = false;
		do {
			try {
				entero = Integer.parseInt(in.readLine());
				esEntero = true;
			} catch (NumberFormatException e) {
				System.out.println("VALOR INCORRECTO\nTeclea un numero entero");
			} catch (IOException e) {
				
			}
		} while (!esEntero);
		return entero;
	}
}
