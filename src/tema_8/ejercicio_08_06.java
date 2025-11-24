package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_06 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            System.out.printf("El número %d volteado es %d.%n", num, funciones.voltea(num));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}