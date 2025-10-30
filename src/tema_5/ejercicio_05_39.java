package tema_5;

public class ejercicio_05_39 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            for (int actual = 1; actual <= num; actual++) {
                int factorial = 1;
                for (int i = 1; i <= actual; i++) {
                    factorial *= i;
                }
                System.out.printf("%d! = %d%n", actual, factorial);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
