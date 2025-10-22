package tema_5;

public class ejercicio_05_14 {
    public static void main(String[] args) {
        System.out.println("Cálculo de una potencia");
        try {
            int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
            int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
            double potencia = 1;
            if (exponente == 0) {
                potencia = 1;
            }
            if (exponente > 0) {
                for (int i=0; i<exponente; i++) {
                    potencia *= base;
                }
            }
            if (exponente < 0) {
                for (int i=0; i< -exponente; i++) {
                    potencia *= base;
                }
                potencia = 1.0/potencia;
            }
            if (potencia % 1 == 0) {
                System.out.printf("%d^%d = %.0f%n", base, exponente, potencia);                
            } else {
                System.out.printf("%d^%d = %.5f%n", base, exponente, potencia);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
