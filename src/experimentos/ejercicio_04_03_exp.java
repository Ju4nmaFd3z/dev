package experimentos;

public class ejercicio_04_03_exp {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número del 1 al 7: ");
        int diaSemana = Integer.parseInt(System.console().readLine());
        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Debe introducir un número del 1 al 7");
        }
    }
}
