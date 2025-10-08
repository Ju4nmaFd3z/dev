package tema_4;

public class ejercicio_04_06 {
    public static void main(String[] args) {
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = Double.parseDouble(System.console().readLine());
        final double g = 9.81;
        double s = Math.sqrt(2*h/g);
        if (h<=0) {
            System.out.println("Introduce una altura válida");
        }
        else {
            System.out.printf("El objeto tarda %d en caer.%n", s);
        }
    }
}

//DUDA GENERAL