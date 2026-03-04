package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int n= sc.nextInt();
		
		if (n % 7==0 || n%11==0) {
			System.out.println("El numero es multiplo de 7 o de 11" );
		}else {
			System.out.println("El numero no es multiplo de 7 ni de 11" );
		}
	}
}
