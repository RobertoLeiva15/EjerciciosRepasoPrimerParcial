package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriba un numero");
	int n = sc.nextInt();
	
	for (int i=1; i<=10;i++) {
	System.out.println(n + " / " + i + " = " + (double) n / i);
	}
}
}