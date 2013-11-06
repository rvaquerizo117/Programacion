package Operaciones.Aritmeticas;

public class Comparadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a,b;
		
		a= 3>5;
		b= 12 != 8;
		
		System.out.println("a\tb\ta and b\ta or b\tnot a \tnot b");
		
		System.out.print("3>5\t12!=8\t"+ ( a && b));
		System.out.print("\t");
		System.out.print (a || b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		
		
		
		

	}

}
