import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import interfaces.Convierte;

public class MainConvierte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  EJERCICIO 1
          
          Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
          lista con los strings en mayúscula.

          EJERCICIO 2
          
          Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
          método debe devolver un String que concatene separando por coma y espacio todas las
          palabras, en la lista, que tengan más de "n" caracteres.
        */
		
		
		List<String> palabras = new ArrayList<>();
		
		
		palabras.add("Casa");
	    palabras.add("Arbol");
	    palabras.add("Patio");
	     
	    Convierte mayuscula = (x) -> { 
	    	List<String> nueva = new ArrayList<>();
	    	for(String a : x) {
	    	   nueva.add(a.toUpperCase());
	    	  }
	    	return nueva;
	    };
	    
	    Convierte minuscula = (x) -> { 
	    	List<String> nueva = new ArrayList<>();
	    	for(String a : x) {
	    	   nueva.add(a.toLowerCase());
	    	  }
	    	return nueva;
	    };
	    System.out.println(" PALABRAS A MAYUSCULA CON INTERFAZ FUNCIONAL Y LAMBDA");
	    for (String a : mayuscula.convertir(palabras)) {
	    	
	    	System.out.println(a);
	    }
	    System.out.println(" PALABRAS A MINUSCULA CON INTERFAZ FUNCIONAL Y LAMBDA");
	    for (String a : minuscula.convertir(palabras)) {
	    	
	    	System.out.println(a);
	    }
	
	
	   
	   System.out.println( "Palabras en Mayuscula con Stream: " +
			   palabras.stream()
			   .map((x) -> x.toUpperCase())
			   .collect(Collectors.toList())
			   );
	   
	   System.out.println( "Palabras en Minuscula con Stream: " +
			   palabras.stream()
			   .map((x) -> x.toLowerCase())
			   .collect(Collectors.toList())  
			   );
	    
	   System.out.println("Palabras Separadas , con Stream: " +
			   palabras.stream()
			   .map((x)-> x.toUpperCase())
			   .collect(Collectors.joining(" , "))
			   );
	   int n = 4;
	   
	   System.out.println( "Palabras que tienen mas de " + n + " Letras: "+			   
			   palabras.stream()
			   .filter((x)-> x.length() > n)
			   .collect(Collectors.joining(" , "))
			   
			   );
	   
	
	}

}
