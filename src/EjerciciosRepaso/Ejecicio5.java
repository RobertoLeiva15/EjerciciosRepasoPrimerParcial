package EjerciciosRepaso;
import java.util.Scanner;
public class Ejecicio5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingrese un numero: ");
	int n = sc.nextInt();
	int suma=0;
	int numero=n;
	
	while ( n > 0) {
		int digito = n % 10;
		suma += digito;
		n = n/10;
	}
System.out.println("La suma de los digitos de " + numero +" es de: " + suma);
	}

}
