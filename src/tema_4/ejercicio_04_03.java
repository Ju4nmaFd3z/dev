package tema_4;

public class ejercicio_04_03 {
    public static void main(String[] args) {
        String diaSemana;
        System.out.print("Introduzca un número del 1 al 7: ");
        int numDia = Integer.parseInt(System.console().readLine());
        switch (numDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Introduce un número del 1 al 7";
        }
        System.out.println(diaSemana);
    }
}
