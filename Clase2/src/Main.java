
import interfaces.Calcular;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calcular suma = (a,b) ->  a + b ;
		Calcular resta = (a,b) ->  a - b ;
		Calcular multi = (a,b) ->  a * b ;
		Calcular dividir = (a,b) ->  a / b ;
		
		
		System.out.println( suma.calculo(2,3));
		System.out.println( resta.calculo(2,3));
		System.out.println( multi.calculo(2,3));
		System.out.println( dividir.calculo(2,3));
		
		// TIPOS DE EXPRESIONES LAMBDA.
		// CONSUMIDORES ACEPTAN VALORES SIN RETURN
		// PROVEDOR SIN PARAMETROS RETURN
		// FNCIONAL RETORN Y TIENE PARAMETROS
		// PREDICADO 1 SOLO RETURN 1 PARAMETRO
		
	    	
	    
		
	}

}
