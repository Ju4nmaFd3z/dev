package tema_1;

public class ejercicio_01_04 {
    public static void main(String[] args) {
        String prog = "PROG";
        String si = "SI";
        String bbdd = "BBDD";
        String ipe1 = "IPE1";
        String digt = "DIGT";
        String ed = "ED";
        String lm = "LM";
        String sost = "SOST";
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", si, prog, si, ipe1, bbdd);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", si, prog, si, ipe1, bbdd);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", lm, prog, ipe1, prog, si);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", lm, bbdd, digt, prog, ed);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", bbdd, bbdd, prog, prog, ed);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", bbdd, sost, prog, lm, ed);
    }
}
