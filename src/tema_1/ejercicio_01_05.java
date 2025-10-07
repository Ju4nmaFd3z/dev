package tema_1;

public class ejercicio_01_05 {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Regular Colors
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String LIGHT_PURPLE = "\033[0;1;35m";    // LIGHT PURPLE
    public static final String LIGHT_GREEN = "\033[0;1;32m";    // LIGHT GREEN
    public static void main(String[] args) {
        String prog = RED+"PROG"+RESET;
        String si = GREEN+"SI"+RESET;
        String bbdd = YELLOW+"BBDD"+RESET;
        String ipe1 = BLUE+"IPE1"+RESET;
        String digt = PURPLE+"DIGT"+RESET;
        String ed = CYAN+"ED"+RESET;
        String lm = LIGHT_PURPLE+"LM"+RESET;
        String sost = LIGHT_GREEN+"SOST"+RESET;
        System.out.println("╔══════════╦═══════════╦═════════════╦══════════╦════════════╗");
        System.out.printf("║ %-9s║ %-10s║ %-12s║ %-9s║ %-11s║%n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.println("╠══════════╬═══════════╬═════════════╬══════════╬════════════╣");
        System.out.printf("║ %-9s       ║ %-10s      ║ %-12s          ║ %-9s     ║ %-11s       ║%n", si, prog, si, ipe1, bbdd);
        System.out.printf("║ %-9s       ║ %-10s      ║ %-12s          ║ %-9s     ║ %-11s       ║%n", si, prog, si, ipe1, bbdd);
        System.out.printf("║ %-9s       ║ %-10s      ║ %-12s        ║ %-9s     ║ %-11s         ║%n", lm, prog, ipe1, prog, si);
        System.out.printf("║ %-9s       ║ %-10s      ║ %-12s        ║ %-9s     ║ %-11s         ║%n", lm, bbdd, digt, prog, ed);
        System.out.printf("║ %-9s     ║ %-10s      ║ %-12s        ║ %-9s     ║ %-11s         ║%n", bbdd, bbdd, prog, prog, ed);
        System.out.printf("║ %-9s     ║ %-10s      ║ %-12s        ║ %-9s       ║ %-11s         ║%n", bbdd, sost, prog, lm, ed);
        System.out.println("╚══════════╩═══════════╩═════════════╩══════════╩════════════╝");
    }
}
