package tema_5;

public class ejercicio_05_36 {
    public static void main(String[] args) {
        try {
            long num = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            if (num < 0) {
                System.out.println("Debe introducir un número positivo.");
                return;
            }
            long aux = num;
            long invertido = 0;
            while (aux > 0) {
                long ultDig = aux % 10;
                invertido = invertido * 10 + ultDig;
                aux /= 10;
            }
            System.out.printf("El %d %ses capicúa.%n", num, (num == invertido) ? "" : "no ");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}