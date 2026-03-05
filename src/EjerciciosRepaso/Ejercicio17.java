package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int n = sc.nextInt();
	        
	        while (n>1 && n %2==0) {
	        	n=n/2;
	        }
	        if(n==1) {
	        	System.out.println("Es potencia de 2");
	        }else {
	        	System.out.println("No es portencia de 2");
	        }
	}
}