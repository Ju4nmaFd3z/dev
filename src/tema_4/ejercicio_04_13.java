package tema_4;

public class ejercicio_04_13 {
    public static void main(String[] args) {
        try {
            System.out.println("Este programa ordena tres números introducidos por teclado.");
            System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
            int num1 = Integer.parseInt(System.console().readLine());
            int num2 = Integer.parseInt(System.console().readLine());
            int num3 = Integer.parseInt(System.console().readLine());
            if (num1 < num2 & num2 < num3) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num1, num2, num3);
            } else if (num1 < num3 & num3 < num2) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num1, num3, num2);
            } else if (num2 < num1 & num1 < num3) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num2, num1, num3);
            } else if (num2 < num3 & num3 < num1) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num2, num3, num1);
            } else if (num3 < num1 & num1 < num2) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num3, num1, num2);
            } else if (num3 < num2 & num2 < num1) {
                System.out.printf("Los números introducidos de menor a mayor son %d, %d, %d.%n", num3, num2, num1);
            } else if (num1 == num2 & num2 == num3) {
                System.out.println("Todos los números son iguales.");
            } else {
                System.out.println("Ha introducido dos números iguales, inténtelo de nuevo.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduzca 3 valores válidos.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}

//DUDA GENERAL, DISTINTO AL LIBRO