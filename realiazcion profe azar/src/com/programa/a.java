package com.programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroAdivinar = (int)(Math.random()*500);
		System.out.println("tu numero es: " + numeroAdivinar);
		int numero = 0;
		int intentos = 0 ;
		do {
			boolean leido;
			do {
				System.out.println("ingrese el numero entre 1 y 500");
			
			try {
				intentos ++;
				numero = teclado.nextInt();
				System.out.println("introduciste el nuemro : " + numero);
				leido = true;
			}catch(InputMismatchException e) {
				System.out.println("no introduciste un numero integer");
		teclado.next();
		leido = false;
			}
			
		}while (leido = false);
			if (numero > numeroAdivinar ) {
				System.out.println("ingreso un numero menor, continue intentando");}
				if (numero < numeroAdivinar ) {
				System.out.println("ingreso un numero mayor, continue intentando");}
			} while (  numero != numeroAdivinar);
	System.out.println("Congratuasdasuio, le pegaste papu");
	System.out.println("El numero es : " + numeroAdivinar);
	System.err.println("Te llevo " + intentos + " muy lento querido" );
		
		
	}

}
