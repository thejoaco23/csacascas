package com.Relanazarexception;

import java.io.IOException;

public class MainRethrowDemostracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*try {
			Rethrow.generoException();
		}catch(ArrayIndexOutOfBoundsException exc) {
			//recapturo la excepcion
			System.out.println("Error - capturado en el main - Fin del programa");
		}

	

//for(int i = 0; i <3; i++) {
	
	Usodefinally.generoError(i);
System.out.println("estoy en el main");
}}}
*/ 
		char ch;
		int p;
		try {
 p = ThrowsDemostracion.prompt("ingrese una letra");
		}catch (IOException e) {
			System.out.println("ocurrio un exception de E/S");
			
p = 0;
e.printStackTrace();
		}
				System.out.println("ustes preciono la tecla " +  p);
	}}