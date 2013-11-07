import java.util.Scanner;


public class MenordeTresNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("1- Dame un numero: " );	
		int numero1=teclado.nextInt();
		
		System.out.print("2- Dame un numero: " );	
		int numero2=teclado.nextInt();
		
		System.out.print("3- Dame un numero: " );	
		int numero3=teclado.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3 ){
			
				System.out.print("El numero menor es " + numero1 );	
				
		}else if (numero2 <= numero1 && numero2 <= numero3 ){
				System.out.print("El numero menor es " + numero2 );	
			
		}else{
				System.out.print("El numero menor es " + numero3 );	
			}

		}
}
