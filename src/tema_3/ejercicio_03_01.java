package tema_3;

public class ejercicio_03_01 {
    public static void main(String[] args) {
        System.out.println("Este programa multiplica dos números enteros.");
        System.out.println("---------------------------------------------");
        System.out.print("Por favor, introduzca el primer número: ");
        String n1 = System.console().readLine();
        int n1_int = Integer.parseInt(n1);
        System.out.print("Introduzca el segundo número: ");
        String n2 = System.console().readLine();
        int n2_int = Integer.parseInt(n2);
        int resultado = n1_int * n2_int;
        System.out.printf("%d * %d = %d", n1_int, n2_int, resultado);
    }
}
