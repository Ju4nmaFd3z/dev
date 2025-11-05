package tema_5;

public class ejercicio_05_33 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la U: "));
            for (int i=1; i<altura; i++) {
                System.out.print("* ");
                for (int j=2; j<altura; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            System.out.print("  ");
            for (int i=2; i<altura; i++) {
                System.out.print("* ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
