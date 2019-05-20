package com.Relanazarexception;

public class Usodefinally {

	public static void generoError (int rec){
		int t;
		int nums[] = new int [2];
		System.out.println("REcibiendo" + rec);
		// TODO Auto-generated method stub
		
		try{
			switch(rec) {
			case 0:
				t= 10/rec ;
				break;
			case 1:
				//genero un erro de indexacion 
				nums[4]=4;
				break;
			case 2:
				//Retorno desde el Try
				return;
				
			}
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir x 0");
			return; //retornamos esde el catch
			
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println(" Elemento no encontrado en el Array");
		
		}
		
		finally { //esto se ejecutara al salir de los bloques Try/catch
			System.out.println("EStoy con del Try");

	}

}}
