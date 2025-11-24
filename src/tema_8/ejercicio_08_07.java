package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_07 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int posicion = Integer.parseInt(System.console().readLine("Introduzca la posición del dígito: "));
            if (funciones.digitoN(num, posicion)==-1) {
                System.out.println("Debe introducir una posición dentro del rango!");
            } else System.out.printf("En la posicion %d del %d está el %d.%n", posicion, num, funciones.digitoN(num, posicion));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}