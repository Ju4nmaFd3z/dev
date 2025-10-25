package tema_5;

public class ejercicio_05_15 {
    public static void main(String[] args) {
        try {
            int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
            int exponenteMax = Integer.parseInt(System.console().readLine("Introduzca el exponente máximo: "));
            for (int i=1; i<=exponenteMax; i++) {
                int resultado = 1;
                for (int j=0; j<=i; j++) {
                    resultado *= base;
                }
                System.out.printf("%d^%d = %d%n", base, i, resultado);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
