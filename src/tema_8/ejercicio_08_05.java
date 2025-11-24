package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_05 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            System.out.printf("El número %d tiene %d %s.%n", num, funciones.digitos(num), (funciones.digitos(num)==1)?"dígito":"dígitos");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}