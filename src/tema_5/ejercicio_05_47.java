package tema_5;

public class ejercicio_05_47 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la anchura del rectángulo (como mínimo 2): "));
            int anchura = 6;
            if (altura<5&&altura%2==0) {
                System.out.println("La altura introducida no es correcta");
                return;
            }
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=anchura; i++) {
                    if (fila==1||fila==altura||i==1||i==anchura||fila==altura/2+1) {
                        System.out.print("M");
                    } else System.out.print(" ");
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
