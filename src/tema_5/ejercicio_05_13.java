package tema_5;

public class ejercicio_05_13 {
    public static void main(String[] args) {
        try {
            System.out.println("Por favor, introduzca 10 números enteros:");
            int numPositivos = 0;
            int numNegativos = 0;
            int ceros = 0;
            for (int i=1; i<=10; i++){
                int num = Integer.parseInt(System.console().readLine());
                if (num == 0) {
                    ceros++;
                } else if (num >= 0) {
                    numPositivos++;
                } else {
                    numNegativos--;
                }
            }
            if (ceros == 1) {
                System.out.printf("Ha introducido %d positivos, %d negativos y %d cero.%n", numPositivos, numNegativos, ceros);
            } else if (ceros > 1) {
                System.out.printf("Ha introducido %d positivos, %d negativos y %d ceros.%n", numPositivos, numNegativos, ceros);
            } else {
                System.out.printf("Ha introducido %d positivos y %d negativos.%n", numPositivos, numNegativos);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
