package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("¿Cuantos numeros va a ingresar? ");
	        int n = sc.nextInt();
	        
	        int sumaNegativos=0;
	        int cantidadNegativos=0;
	        
	        for( int i=1; i<=n;i++) {
	        	System.out.println("Ingrese un numero" + i + ":");
	        	int num = sc.nextInt();
	        	
	        	 if (num < 0) {
	                 sumaNegativos += num;
	                 cantidadNegativos++;
	             }
	         }

	         if (cantidadNegativos > 0) {
	             double promedio = (double) sumaNegativos / cantidadNegativos;
	             System.out.println("Promedio de negativos: " + promedio);
	         } else {
	             System.out.println("No hay negativos");
	         }
	     }
}