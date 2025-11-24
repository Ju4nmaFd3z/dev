package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_10 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int digitosRetirados = Integer.parseInt(System.console().readLine("Introduzca los dígitos que quiere retirar por delante: "));
            System.out.printf("Si al %d se le %s por delante %d %s, se queda como %d.%n", num, (digitosRetirados==1)?"quita":"quitan", digitosRetirados, (digitosRetirados==1)?"dígito":"dígitos", funciones.quitaPorDelante(num, digitosRetirados));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}