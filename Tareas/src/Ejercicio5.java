import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	/*
	Crea un programa que pida el tamaño de un archivo (Mbytes) y 
	la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.
	*/

			{
			
			Scanner teclado=new Scanner(System.in);
			double tamaño, velocidad;
			
			
			System.out.print(" Introduce el tamaño en Mbytes: ");
			tamaño=teclado.nextDouble();
			
			System.out.print(" Introduce la velocidad de tu conexión en Mbps: ");
			velocidad=teclado.nextDouble();
			
			tamaño = (tamaño / 1000000)  * 1024 * 1024 * 8;
			teclado.close();
			
			System.out.println("Datos:" + tamaño + "bits");
			System.out.println("Velocidad:" + velocidad +"bps");
			System.out.println("Tiempo para transfereir:"+ tamaño/velocidad);
			
			
			

	}
}
