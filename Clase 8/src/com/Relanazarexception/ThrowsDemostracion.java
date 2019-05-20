package com.Relanazarexception;

public class ThrowsDemostracion {
/* En algunos caso si n metodo genera una excveption que no maneja debe declara esa exception
 * en un a clausula Throws.
 */
	
	public static int prompt(String args) throws java.io.IOException{
		System.out.println(args + " : "  );
		
	 int numero =System.in.read();
	 int result = numero /0;
	 return result;
	}
}
