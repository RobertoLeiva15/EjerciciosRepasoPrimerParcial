package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Ingrese un numero: " );
		int n= sc.nextInt();
		
		int sumaPares=0;
		int cantidadPares = 0;
		
		for (int i=1; i<=n; i++) {
			if (i % 2==0) {
				sumaPares +=i;
				cantidadPares ++;
			}
		}
		
		if (cantidadPares > 0) {
			double promedio=(double) sumaPares/cantidadPares;
			System.out.println("El promedio de los numeros pares es de: " +promedio);
		}else {
			System.out.println("No hay numeros pares entre 1 y " + n);
		}
	}

}
