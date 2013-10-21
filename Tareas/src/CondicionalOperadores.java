import java.util.Scanner;

public class CondicionalOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int valor1;
		System.out.println("Introduce el primer valor ");
		valor1 = input.nextInt();
		
		int valor2;
		System.out.println("Introduce el segundo valor ");
		valor2 = input.nextInt();
		
		if (valor1 == valor2)
			System.out.println("Son inguales ");
			
		if (valor1 != valor2)
		System.out.print("No son inguales ");	
		
		if (valor1 > valor2)
			System.out.println("por que Valor1 es mayor que valor2 ");	
		
		if (valor1 < valor2)
			System.out.println("por que valor2 es mayor que valor1 ");	
		

	}

}
