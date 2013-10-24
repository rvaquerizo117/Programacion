import java.util.Scanner;

public class DatosTresAlumnosB {

	public static void main(String[] args) {
		/*
		 * Utilizando como base los ejemplos vistos en clase, haz un programa que pida los datos de tres alumnos, 
		 * de los que nos interesa conocer su nombre y edad. Sabemos que los alumnos tienen la misma edad, 
		 * con lo que pediremos la edad una única vez. Para finalizar, el programa visualizará los datos de los tres alumnos.
		 * 
		 * Modifica el programa anterior de forma que la edad de los alumnos ya no sea la misma. 
		 * El programa debe calcular y mostrar la edad media de los tres alumnos.
		 */
		
		//Variables
		
		 int edadAlumno1, edadAlumno2, edadAlumno3;
		 
		 Scanner input = new Scanner(System.in);
		 
		 //Inserción de datos (edad y años)
		 
		 	//Al1
		 
			System.out.print("Introduce el nombre del primer alumno ");
			String nombreAlumno1 = input.next();
			
			System.out.print("Introduce la edad del primer alumno ");
			edadAlumno1 = input.nextInt();
			
			//Al2
			
			System.out.print("Introduce el nombre del segundo alumno ");
			String nombreAlumno2 = input.next();
			
			System.out.print("Introduce la edad del segundo alumno ");
			edadAlumno2 = input.nextInt();
			
			 //Al3
			
			System.out.print("Introduce el nombre del tercer alumno ");
			String nombreAlumno3 = input.next();
			
			System.out.print("Introduce la edad del tercer alumno ");
			edadAlumno3 = input.nextInt();
		
			
		//Visulacización de datos	
			
			System.out.print("\nNombres de alumnos ");
			
			System.out.println("\nEl nombre del primer alumno es " + nombreAlumno1);
			System.out.println("El nombre del segundo alumno es " + nombreAlumno2);
			System.out.println("El nombre del tercer alumno es " + nombreAlumno3);
			
			System.out.println("\nEdades de alumnos ");
			
			System.out.println("\nLa edad de los alumnos es de " + edadAlumno1 + " años");
			System.out.println("La edad de los alumnos es de " + edadAlumno2 + " años");
			System.out.println("La edad de los alumnos es de " + edadAlumno3 + " años");
			

	}

}