package tema_1;

public class ejercicio_01_07 {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Negrita
    public static final String NEGRITA = "\u001B[1m";   // NEGRITA
    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String LIGHT_GREY = "\033[38;5;250m";   // LIGHT GREY
    // Background
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE BG
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW BG
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN BG
    public static void main(String[] args) {

        System.out.println(PURPLE_BACKGROUND+"                                            "+RESET);
        System.out.println(PURPLE_BACKGROUND+"                              "+LIGHT_GREY+"██"+PURPLE_BACKGROUND+"            "+RESET);
        System.out.println(PURPLE_BACKGROUND+"     "+YELLOW_BACKGROUND+"APRENDE JAVA"+RESET+PURPLE_BACKGROUND+"          "+LIGHT_GREY+"██"+PURPLE_BACKGROUND+"               "+RESET);
        System.out.println(PURPLE_BACKGROUND+"    "+YELLOW_BACKGROUND+"CON EJERCICIOS"+RESET+PURPLE_BACKGROUND+"            "+LIGHT_GREY+"██"+PURPLE_BACKGROUND+"            "+RESET);
        System.out.println(PURPLE_BACKGROUND+"                                            "+RESET);
        System.out.println(PURPLE_BACKGROUND+"   "+GREEN_BACKGROUND+NEGRITA+"Juanma Fernández"+RESET+PURPLE_BACKGROUND+"       "+BLACK+"████████████"+PURPLE_BACKGROUND+"      "+RESET);
        System.out.println(PURPLE_BACKGROUND+"                          "+BLACK+"████████"+PURPLE_BACKGROUND+"  "+BLACK+"██"+PURPLE_BACKGROUND+"      "+RESET);
        System.out.println(PURPLE_BACKGROUND+"                          "+BLACK+"████████████"+PURPLE_BACKGROUND+"      "+RESET);
        System.out.println(PURPLE_BACKGROUND+"░░░░░░░░░░░░░░░░░░░░░░░░░░"+BLACK+"████████"+RESET+PURPLE_BACKGROUND+"░░░░░░░░░░"+RESET);
        System.out.println(PURPLE_BACKGROUND+"░░░░░░░░░░░░░░░░░░░░░░░░░░"+BLACK+"████████"+RESET+PURPLE_BACKGROUND+"░░░░░░░░░░"+RESET);
        System.out.print(PURPLE_BACKGROUND+"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░"+RESET);
    }
}
