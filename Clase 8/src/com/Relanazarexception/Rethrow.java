package com.Relanazarexception;

public class Rethrow {
	
	
	
	
	public static void generoException() {
		int numerador [] = {2,4,8,16,32,64,128,256,521,1024};
		int denominador [] = {2,0,6,4,0,7};
		
		for (int i=0;i < numerador.length ; i++) {
			try {
			System.out.println(numerador [i]+ " / " + denominador[i] + " es " + numerador[i] / denominador[i]);
	}catch(ArithmeticException exc) {
		//capturo la Exception
		System.out.println("No se puede dividir x 0");
	}catch(ArrayIndexOutOfBoundsException exc){
		//capturo la segunda exception 
	System.out.println("no se pudo encontrar el elemento en el Array");
	System.out.println(exc);
System.out.println("\n Traza de errores");
exc.printStackTrace();
//Relanzamos la exception 
		throw exc;
	}
}}}