import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Dame un numero: " );	
	
	int numero=teclado.nextInt();

	if (numero%2 == 0){
		
	System.out.print("OK, El numero " + numero + " es par" );	
		
	}else{
	System.out.print("Es impar" );	
	
		}
		
	}

}
