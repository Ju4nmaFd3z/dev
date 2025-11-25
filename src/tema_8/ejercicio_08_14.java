package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_14 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int digito1 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
            int digito2 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
            System.out.printf("Al %d le cojo el trozo que va de la posición %d a la %d: %d%n", num, digito1, digito2, funciones.trozoDeNumero(num, digito1, digito2));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}