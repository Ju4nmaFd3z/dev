package tema_2;

public class ejercicio_02_06 {
    public static void main(String[] args) {
        double precio_iva = 27.53;
        double base_imponible = precio_iva / 1.21;
        double iva = base_imponible * 0.21;
        System.out.printf("%-15s%10.2f%n", "Base Imponible", base_imponible);
        System.out.printf("%-15s%10.2f%n", "IVA", iva);
        System.out.printf("-------------------------%n");
        System.out.printf("%-15s%10.2f%n", "Total", precio_iva);
    }
}
