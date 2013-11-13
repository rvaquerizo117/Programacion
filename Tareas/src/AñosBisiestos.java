import java.util.Scanner;


public class AñosBisiestos {

	public static void main(String[] args) {
		/*
		 * Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo 
		 * (aquel divisible por 100),  salvo que este último sea divisible por 400
		 *  http://es.wikipedia.org/wiki/Año_bisiesto. Haz un programa que pida un año y muestre un mensaje 
		 *  de si es o no bisiesto.
		 *  
		 * */ 
		
		Scanner teclado = new Scanner(System.in);
		
		int año = 0;
		
		System.out.print("Introduce el año: ");
		año = teclado.nextInt();
		
	if( año % 4 == 0  && año % 100 != 0 || (año % 400 == 0) ){
	System.out.print("Es bisiesto");
		}else{
			System.out.print("No es bisiesto");
		}
	}

}
