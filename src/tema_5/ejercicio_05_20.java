package tema_5;

public class ejercicio_05_20 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
            String relleno = System.console().readLine("Introduzca el carácter de relleno: ");
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++){
                    System.out.print(" ");
                }
                int ancho = 2*fila-1;
                for (int i=1; i<=ancho; i++){
                    if (altura==fila||i==1||ancho==i) {
                        System.out.print(relleno);
                    } else {
                        System.out.print(" ");
                    }
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
