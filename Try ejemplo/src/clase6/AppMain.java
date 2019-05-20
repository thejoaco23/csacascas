package clase6;

public class AppMain {

	public static void main(String[] args) {
	
		int[]Array =new int [20];
		try {
			Array[-3] = 24; 
			int b = 0;
			int resultado = 50/b;
			//El error/es que quiero atrapar
			//
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Errror de indice de un array");
		} 
		 catch (ArithmeticException e) {
	       System.out.println("no se puede dividir x 0");
		}
		

	}

}
