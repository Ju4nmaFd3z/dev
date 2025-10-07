package experimentos;

public class ejercicio_01_04_exp {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Códigos ANSI para colores de texto
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String BLANCO = "\u001B[37m";
    // Códigos ANSI para colores de fondo
    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String FONDO_VERDE = "\u001B[42m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String FONDO_AZUL = "\u001B[44m";
    public static final String FONDO_PURPURA = "\u001B[45m";
    public static final String FONDO_CYAN = "\u001B[46m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static void main(String[] args) {
        String prog = "PROG";
        String si = "SI";
        String bbdd = "BBDD";
        String ipe1 = "IPE1";
        String digt = "DIGT";
        String ed = "ED";
        String lm = "LM";
        String sost = "SOST";
        System.out.printf(VERDE+"%-12s %-12s %-12s %-12s %-12s%n"+RESET, "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", si, prog, si, ipe1, bbdd);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", si, prog, si, ipe1, bbdd);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", lm, prog, ipe1, prog, si);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", lm, bbdd, digt, prog, ed);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", bbdd, bbdd, prog, prog, ed);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n", bbdd, sost, prog, lm, ed);
    }
}