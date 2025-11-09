package tema_5;

public class ejercicio_05_46 {
    public static void main(String[] args) {
        try {
            int anchura = Integer.parseInt(System.console().readLine("Por favor, introduzca la anchura del rectángulo (como mínimo 2): "));
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del rectángulo (como mínimo 2): "));
            if (anchura < 2 && altura < 2) {
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2");
                return;
            }
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=anchura; i++) {
                    if (fila==1||fila==altura||i==1||i==anchura) {
                        System.out.print("* ");
                    } else System.out.print("  ");
                }
                System.out.println();
                fila++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
