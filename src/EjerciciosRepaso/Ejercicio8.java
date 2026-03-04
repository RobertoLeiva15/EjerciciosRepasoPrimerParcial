package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la hora (0-23): ");
		int hora = sc.nextInt();
		
		if (hora>=0 && hora<=11) {
			System.out.println("Mañana");
		}else if (hora>=12 && hora<=17) {
			System.out.println("Tarde");
		}else if (hora>=18 && hora<=23) {
			System.out.println("Noche");
		}else {
			System.out.println("Hora invalida");
		}
	}
}
