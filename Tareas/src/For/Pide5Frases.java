package For;

import java.util.Scanner;

public class Pide5Frases {

	public static void main(String[] args) {
		// Escribe un programa que pida cinco frases y las visualice.
		String frase = "";
		String frases = "";
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("Dime una frase: ");
			frase = teclado.nextLine();
			frases = frases+frase+"\t";
		}
		System.out.println("Las frases son: " + frases);
	}
}