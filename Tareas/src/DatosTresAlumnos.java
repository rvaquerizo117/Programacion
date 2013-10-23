import java.util.Scanner;

public class DatosTresAlumnos {

	public static void main(String[] args) {
		/*
		 * Utilizando como base los ejemplos vistos en clase, haz un programa que pida los datos de tres alumnos, 
		 * de los que nos interesa conocer su nombre y edad. Sabemos que los alumnos tienen la misma edad, 
		 * con lo que pediremos la edad una única vez. Para finalizar, el programa visualizará los datos de los tres alumnos.
		 */
		
		//Variables
		
		 int edadAlumnos;
		 
		 Scanner input = new Scanner(System.in);
		 
		 //Inserción de datos
		 
			System.out.print("Introduce el nombre del primer alumno ");
			String nombreAlumno1 = input.next();
			
			System.out.print("Introduce el nombre del segundo alumno ");
			String nombreAlumno2 = input.next();
			
			System.out.print("Introduce el nombre del tercer alumno ");
			String nombreAlumno3 = input.next();
			
			System.out.print("Introduce la edad de los alumnos ");
			edadAlumnos = input.nextInt();
			
		//Visulacización de datos	
			
			System.out.println("\nEl nombre del primer alumno es " + nombreAlumno1);
			System.out.println("El nombre del segundo alumno es " + nombreAlumno2);
			System.out.println("El nombre del tercer alumno es  " + nombreAlumno3);
			System.out.print("\nLa edad de los alumnos es de " + edadAlumnos + " años");

	}

}
