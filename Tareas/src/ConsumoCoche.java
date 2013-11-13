import java.util.Scanner;

public class ConsumoCoche {
	
	/*
	 * 
	 *El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
	 *Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno y litros de 
	 *consumo por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a. 
	 *Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
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
		
		System.out.print("Introduce el porcentaje del dep�sito que est� lleno: ");
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
