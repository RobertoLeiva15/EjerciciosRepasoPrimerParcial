package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int n= sc.nextInt();
		
		int suma=n*(n+1)/2;
		
		if (suma%2==0) {
			System.out.println("La suma es par");
		}else {
			System.out.println("La suma es impar");
		}
	}
}