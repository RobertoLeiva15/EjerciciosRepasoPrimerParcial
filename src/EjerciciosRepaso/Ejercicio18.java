package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escriba un numero: ");
	int n = sc.nextInt();
	
	int invertido=0;
	
	while (n>0) {
		int digito = n%10;
		invertido =invertido*10+digito;
		
		n=n/10;
	}
	System.out.println("Numero invertido: " +invertido);
	}
}