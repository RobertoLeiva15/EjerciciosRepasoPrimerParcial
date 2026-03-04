package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba un numero del 1 al 5: ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: 
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		default:
			System.out.println("Numero fuera del rango");
		}
	}
}