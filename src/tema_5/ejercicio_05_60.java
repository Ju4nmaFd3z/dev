package tema_5;

public class ejercicio_05_60 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de los calcetines: "));
            int filasRestantes = altura;
            while (filasRestantes>0) {
                for (int i = 1; i <= altura; i++) {
                    System.out.print("***");
                    if (filasRestantes<=2&&filasRestantes>0) {
                        System.out.print("***");
                    } else System.out.print("   ");
                    System.out.print("  ");
                    System.out.print("***");
                    if (filasRestantes<=2&&filasRestantes>0) {
                        System.out.print("***");
                    }
                    System.out.println();
                    filasRestantes--;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
