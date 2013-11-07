import java.util.Scanner;


public class NumerosMayores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un numero: " );	
		int numero1=teclado.nextInt();
		
		System.out.print("Dame un numero: " );	
		int numero2=teclado.nextInt();
		
		if (numero1 <= numero2){
			
			System.out.print("El numero menor es " + numero1 );	
				
			}else{
			System.out.print("El numero menor es " + numero2 );	
				}

	}

}
