package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantos numeros va a ingresar?");
		int n= sc.nextInt();
		int positivos=0;
		int negativos=0;
		int ceros=0;
		
		for (int i=1; i<=n; i++) {
			System.out.println("Ingrese el numero" +i+":");
			int num =sc.nextInt();
			
			if (num >0) {
			positivos++;
			}else if (num <0) {
				negativos++;
			}else {
					ceros++;
				}
		}
		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);
	}

	

}
