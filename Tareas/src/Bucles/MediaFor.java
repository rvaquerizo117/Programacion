package Bucles;

import java.util.Scanner;

public class MediaFor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		int suma=0;
		int alumnos=0;
		
		System.out.print("Cuantos alumnos?: ");
		alumnos=teclado.nextInt();
		
		for(int i = 0; i < alumnos ; i++ ){
			System.out.print("Escribe un numero: ");
			numero=teclado.nextInt();
			suma=numero+suma;
		}
		System.out.print("La media es: " +suma/alumnos);
		
	}

}
