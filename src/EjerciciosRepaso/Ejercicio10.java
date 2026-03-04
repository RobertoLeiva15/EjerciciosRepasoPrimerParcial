package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese opción (1=Sumar, 2=Restar, 3=Multiplicar): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}