package tema_3;

public class ejercicio_03_02 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
        double euros = Double.parseDouble(System.console().readLine());
        int pesetas = (int)Math.round(euros * 166.386);
        System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
    }
}
