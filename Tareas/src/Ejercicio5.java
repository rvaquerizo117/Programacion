import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
//Crea un programa que pida el tama�o de un archivo (Mbytes) y 
//la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
	
			{
			
			Scanner teclado=new Scanner(System.in);
			double Mbytes, Mbps, Sg;
			
			
			System.out.print(" Introduce el tama�o en Mbytes: ");
			Mbytes=teclado.nextDouble();
			
			System.out.print(" Introduce la velocidad de tu conexi�n en Mbps: ");
			Mbps=teclado.nextDouble();
			
			Sg=Mbytes/Mbps;
			
			System.out.print("La estimaci�n es: "+Sg+" segundos");
			
			teclado.close();
			
			

	}
}
