package Bucles;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime la temperatura en F: ");
		double temperatura=teclado.nextDouble();
		
		temperatura = (temperatura - 32)/1.8;
		
		//Si la temperatura es menor que 0ºC
		
		if (temperatura <= 0){
			System.out.println("La temperatura es: " + temperatura + " ºC");
			System.out.println("La temperatura es menor de 0º C ");
		}else{
			System.out.println("No problem");
		}
	}
}
