package tema_5;

public class ejercicio_05_54 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));
            int fila = 1;
            while (fila<=altura) {
                for(int i=0; i<=altura-fila; i++) {
                    if (i==0||fila==1||i==altura-fila) System.out.print("*");
                    else System.out.print(" ");
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
