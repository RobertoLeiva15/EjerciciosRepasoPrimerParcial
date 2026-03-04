package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba un numero");
		int n = sc.nextInt();
		
		System.out.println("Numeros divisibles entre 3 pero no entre 2: ");
		
		for (int i=1; i<=n; i++) {
			if(i % 3 ==0 && i % 2 !=0) {
				System.out.println(i);
			}
		}
	}
}