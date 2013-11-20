public class ControlFor {

	public static void main(String[] args) {
		int matriz[] = {10,20};
		int suma = 0;
		
		for(int x : matriz){
			suma += x;
		}
		System.out.println("el resultado es " + suma);
		
		int contador = 0;
		
		while(contador <=10){
		System.out.println("me estoy ejecutando " + contador);	
		contador++;
		}
	}

}
