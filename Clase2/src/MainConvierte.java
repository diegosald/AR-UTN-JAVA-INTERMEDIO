import java.util.ArrayList;
import java.util.List;

import interfaces.Convierte;

public class MainConvierte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implemente un método que reciba como parámetro una lista de strings y una
		 * interfaz funcional que transforme cada String de la lista en mayúsculas. El
		 * método debe devolver un nuevo listado de String transformados.
		 */

		List<String> palabras = new ArrayList<>();

		palabras.add("Casa");
		palabras.add("Arbol");
		palabras.add("Patio");

		Convierte mayuscula = (x) -> x.toUpperCase();

		Convierte minuscula = (x) -> x.toLowerCase();

		for (String a : palabras) {

			System.out.println(mayuscula.convertir(a));
		}

		for (String a : palabras) {

			System.out.println(minuscula.convertir(a));
		}

	}

}
