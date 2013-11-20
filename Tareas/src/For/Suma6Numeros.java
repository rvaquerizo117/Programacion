package For;

import java.util.Scanner;

public class Suma6Numeros {

	public static void main(String[] args) {
		// Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		
		for(int i=1;i<7;i++){
			System.out.print("Dame el numero "+i+": ");
			numero= teclado.nextInt();
			suma=suma+numero;
		}
		System.out.print("El total de la suma es: "+suma);
	}
}
