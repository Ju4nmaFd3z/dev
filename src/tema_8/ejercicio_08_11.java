package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_11 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
            System.out.printf("Si al %d se le pega por detrás el %d da el %d.%n", num, digito, funciones.pegaPorDetras(num, digito));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}