package tema_8;
import tema_8.funciones.funciones;

public class ejercicio_08_16 {
    public static void main(String[] args) {
        try {
            long decimal = 0;
            long binario = Long.parseLong(System.console().readLine("Introduce un número en binario: "));
            int bits = funciones.digitos(binario);
            
            for (int i=0; i<bits; i++) {
                final long bit = funciones.digitoN(binario, bits-i-1);
                decimal += bit * funciones.potencia(2, i);
            }
            
            System.out.printf("%d en binario es %d en decimal.%n", binario, decimal);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}