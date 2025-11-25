package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_13 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int num2 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
            System.out.printf("Juntando el %d y el %d da el %d%n", num1, num2, funciones.juntaNumeros(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}