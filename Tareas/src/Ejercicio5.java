import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
//Crea un programa que pida el tamaño de un archivo (Mbytes) y 
//la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.
	
			{
			
			Scanner teclado=new Scanner(System.in);
			double Mbytes, Mbps, Sg;
			
			
			System.out.print(" Introduce el tamaño en Mbytes: ");
			Mbytes=teclado.nextDouble();
			
			System.out.print(" Introduce la velocidad de tu conexión en Mbps: ");
			Mbps=teclado.nextDouble();
			
			Sg=Mbytes/Mbps;
			
			System.out.print("La estimación es: "+Sg+" segundos");
			
			teclado.close();
			
			

	}
}
