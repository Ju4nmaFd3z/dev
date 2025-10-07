package experimentos;

import java.util.Scanner;

public class ejercicio_03_01_exp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa multiplica dos números enteros.");
        System.out.println("---------------------------------------------");
        System.out.print("Por favor, introduzca el primer número: ");
        int n1 = s.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int n2 = s.nextInt();
        int resultado = n1 * n2;
        System.out.printf("%d * %d = %d", n1, n2, resultado);
        s.close();
    }
}
