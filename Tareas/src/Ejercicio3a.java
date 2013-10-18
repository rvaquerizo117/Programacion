import java.util.Scanner;


public class Ejercicio3a {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		double volumen, radio;
		
		System.out.print(" Introduce el radio de las esfera en centimetros: ");
		
		radio = teclado.nextDouble();
		volumen = (4* Math.PI * Math.pow(radio, 3))/3;
		System.out.println("Resultados: " );
		System.out.println("volumen "+ Math.round(volumen));

	}

}
