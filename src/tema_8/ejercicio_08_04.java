package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_04 {
    public static void main(String[] args) {
        try {
            int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
            int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
            System.out.printf("%d^%s%d%s = %.3f%n", base, (exponente<0)?"(":"", exponente, (exponente<0)?")":"", funciones.potencia(base, exponente));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}