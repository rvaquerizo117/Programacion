import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	/*
	Crea un programa que pida el tama�o de un archivo (Mbytes) y 
	la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
	*/

			{
			
			Scanner teclado=new Scanner(System.in);
			double tama�o, velocidad;
			
			
			System.out.print(" Introduce el tama�o en Mbytes: ");
			tama�o=teclado.nextDouble();
			
			System.out.print(" Introduce la velocidad de tu conexi�n en Mbps: ");
			velocidad=teclado.nextDouble();
			
			tama�o = (tama�o / 1000000)  * 1024 * 1024 * 8;
			teclado.close();
			
			System.out.println("Datos:" + tama�o + "bits");
			System.out.println("Velocidad:" + velocidad +"bps");
			System.out.println("Tiempo para transfereir:"+ tama�o/velocidad);
			
			
			

	}
}
