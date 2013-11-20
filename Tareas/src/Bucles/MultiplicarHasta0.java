package Bucles;

import java.util.Scanner;

public class MultiplicarHasta0 {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroIntroducido = 0;
		int resultadoMultipli = 1;
		
		 do {
	        System.out.print("Introduce un numero: ");
	        numeroIntroducido=teclado.nextInt();
	        
	       if( numeroIntroducido != 0) resultadoMultipli=numeroIntroducido*resultadoMultipli;
	        System.out.println("resultado multiplicacion " + resultadoMultipli  );
	
	        } while ( numeroIntroducido != 0);
		 
			System.out.print("el resultado total es: "+ resultadoMultipli);
		 
		 

	}

}
