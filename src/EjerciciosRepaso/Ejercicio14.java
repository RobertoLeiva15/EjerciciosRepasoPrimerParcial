package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        
        int suma = 0;
        int k=1;
        
        while (suma<n) {
        	suma+=k;
        	k++;
        }
        if (suma==n) {
        	System.out.println("Es un numero triangular ");
        } else {
        	System.out.println("No es un numero triangular ");
        }
	}
}