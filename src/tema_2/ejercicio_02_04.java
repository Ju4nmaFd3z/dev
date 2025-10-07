package tema_2;

public class ejercicio_02_04 {
    public static void main(String[] args) {
        double euros = 6.0;
        double pesetas = (double) euros * (double) 166.386;
        System.out.printf("%.1f euros son %d pesetas.", euros, (int) pesetas);
    }
}
