import java.util.Scanner;

public class DiasDeLaSemana {

	public static void main(String[] args) {
		
		System.out.print("Escribe el numero de día: ");
		Scanner teclado = new Scanner(System.in);
		
		int diadelasemana=teclado.nextInt();
				
				switch (diadelasemana){
			case 1:
				System.out.println("Hoy es el día 1");
				break;
			case 2:
				System.out.println("Hoy es el día 2");
				break;
			case 3:
				System.out.println("Hoy es el día 3");
				break;
			case 4:
				System.out.println("Hoy es el día 4");
				break;
			case 5:
				System.out.println("Hoy es el día 5");
				break;
			case 6:
				System.out.println("Hoy es el día 6");
				break;
			case 7:
				System.out.println("Hoy es el día 7");
				break;
				
			default: 	
				System.out.println("Escribe un numero de día correcto");
				
				}if(diadelasemana < 6){
					System.out.println("Es laborable");
				}else{
					System.out.println("No es laborable");
			}
		}

	}
