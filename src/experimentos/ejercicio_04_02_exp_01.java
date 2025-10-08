package experimentos;

public class ejercicio_04_02_exp_01 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca una hora del día (0-23): ");
        int hora = Integer.parseInt(System.console().readLine());
        switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Buenos días");
            case 13, 14, 15, 16, 17, 18, 19, 20 -> System.out.println("Buenas tardes");
            case 21, 22, 23, 24, 0, 1, 2, 3, 4, 5 -> System.out.println("Buenas noches");
            default -> System.out.println("Ha introducido una hora incorrecta");
        }
    }
}
