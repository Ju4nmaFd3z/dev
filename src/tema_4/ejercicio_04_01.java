package tema_4;

public class ejercicio_04_01 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String diaSemana = System.console().readLine();
        diaSemana = diaSemana.toLowerCase();
        switch (diaSemana) {
            case "lunes":
            case "miercoles":
            case "miércoles":
                System.out.print("Sistemas Informáticos");
                break;
            case "martes":
                System.out.print("Programación");
                break;
            case "jueves":
                System.out.print("IPE 1");
                break;
            case "viernes":
                System.out.print("Bases de Datos");
                break;
            case "sabado":
            case "sábado":
            case "domingo":
                System.out.print("Ese día no tienes clases!!!");
                break;
            default:
                System.out.print("Has introducido un día incorrecto");
                break;
        }
    }
}
