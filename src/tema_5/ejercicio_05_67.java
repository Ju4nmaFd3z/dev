package tema_5;

public class ejercicio_05_67 {
    public static void main(String[] args) {
        try {
            int numEscalones = Integer.parseInt(System.console().readLine("Introduzca el número de escalones: "));
            int alturaEscalones = Integer.parseInt(System.console().readLine("Introduzca la altura de cada escalón: "));
            int fila = 1;
            while (fila<=alturaEscalones*numEscalones) {
                for (int i=1; i<=fila; i+=2) {
                    System.out.print("****");
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
