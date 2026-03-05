package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la temperatura en Celsius: ");
		double c=sc.nextDouble();
		
		double f= (c*9/5)+32;
		System.out.println("La temperatura en Fahrenheit: "+f);
	}
}
