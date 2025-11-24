package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_08 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int digito = Integer.parseInt(System.console().readLine("Introduzca el dígito del que quiera sacar la posición: "));
            if (funciones.posicionDeDigito(num, digito)==-1) {
                System.out.println("Debe introducir un dígito existente en el número!");
            } else System.out.printf("En el %d, el dígito %d está está en la posición %d.%n", num, digito, funciones.posicionDeDigito(num, digito));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}