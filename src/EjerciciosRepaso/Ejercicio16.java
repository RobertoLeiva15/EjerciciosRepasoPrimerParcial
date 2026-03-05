package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int multiplo = 6 * i;
            System.out.println(multiplo);
        }
    }
}