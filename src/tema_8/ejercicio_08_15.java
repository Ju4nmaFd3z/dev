package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_15 {
    public static void main(String[] args) {
        try {
            for (int i=1; i<=1000; i++){
                if (funciones.esPrimo(i)) System.out.print(i+" ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}