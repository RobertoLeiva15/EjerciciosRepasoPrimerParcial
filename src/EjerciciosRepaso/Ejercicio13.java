package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriba un numero");
	int n = sc.nextInt();
	
	int contador= 0;
	while (n!=0) {
		int digito = n% 10;
		
		if (digito %2==0) {
			contador++;
		}
		n/=10;
	}
      System.out.println("Cantidad de digitos pares: "+contador );
	}
}
