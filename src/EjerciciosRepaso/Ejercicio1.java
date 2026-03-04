package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese un numero: ");
		int n = sc.nextInt();
		
		int suma=0;
		
		for (int i=1; i <=n; i++) {
			if (i % 4 == 0) {
				suma +=i;
			}
		}
System.out.println("La suma de los numeros divisibles entre 4 es: " + suma);
	}

}
