package ControlFlujo;

import java.util.Scanner;

public class Alternativa {

    //Escribe un programa que lea una serie de n�meros, muestre el primero,
    //no el segundo, si el tercero y as� sucesivamente.
    //Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.
    public static void main(String[] args) {

            Scanner teclado = new Scanner (System.in);
            
            int numero;
            String resultado;
            boolean imprimir;
            
            resultado="";
            imprimir=true;
            do {
                    System.out.println("Introduzca un n�mero: ");
                    numero = teclado.nextInt();
                    if (imprimir && (numero>=0)) {
                    	resultado=resultado + numero +" ";
                        //System.out.println("El n�mero introducido es: " + numero);
                    }
                    imprimir=!imprimir;
            }while (numero >= 0);        
                  
            System.out.println(resultado);
            teclado.close();
            
    }
}
