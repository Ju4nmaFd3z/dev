package tema_5;

public class ejercicio_05_31 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la L: "));
            for (int fila = 1; fila <= altura; fila++) {
                System.out.println("*");
                if (fila==altura-1) {
                    for(int base=1; base<altura/2+1; base++)
                    System.out.print("* ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
