import java.util.Scanner;

public class ConsumoCoche {
	
	/*
	 * 
	 *El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
	 *Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno y litros de 
	 *consumo por 100kms. El programa mostrará los kilómetros que quedan de autonomía. 
	 *Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
	 *
	 */

	public static void main(String[] args) {
		double capacidadDeposito = 0;
		double porcentajeDeGasolina = 0;
		double consumo = 0;
		double estimacion = 0;
		
		 Scanner input = new Scanner(System.in);
		 
		System.out.print("Introduce la capacidad del deposito: ");
		capacidadDeposito = input.nextDouble();
		
		System.out.print("Introduce el porcentaje del depósito que está lleno: ");
		porcentajeDeGasolina = input.nextDouble();
		
		System.out.print("Introduce los litros de consumo por 100 kms: ");
		consumo = input.nextDouble();
		
		estimacion = capacidadDeposito * porcentajeDeGasolina / consumo;
		
		System.out.print("Puedes hacer: " + estimacion + " Kilometros.");
		
		if(estimacion < 30){
			System.out.print(" Tienes que repostar!");
		}
		
	}

}
