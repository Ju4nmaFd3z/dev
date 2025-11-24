package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_03 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            System.out.printf("El siguiente primo mayor a %d es %d.%n", num, funciones.siguientePrimo(num));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}