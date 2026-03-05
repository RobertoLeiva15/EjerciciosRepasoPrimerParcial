package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Escribe el primer numero");
	int a = sc.nextInt();
	System.out.println("Escribe el segundo numero");
	int b = sc.nextInt();
	
	int mayor, menor;
	
	if(a > b) {
		mayor = a;
		menor = b;
	}else {
		mayor = b;
		menor = a;
	}
	int diferencia = Math.abs(a-b);
	System.out.println("Mayor: " + mayor);
	System.out.println("Menor: " + menor);
	System.out.println("La diferencia absoluta es de: " + diferencia);
	}
}
