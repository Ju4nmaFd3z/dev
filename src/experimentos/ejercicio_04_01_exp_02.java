package experimentos;

public class ejercicio_04_01_exp_02 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String diaSemana = System.console().readLine();
        diaSemana = diaSemana.toLowerCase();
        if (diaSemana.equals("lunes")||diaSemana.equals("miercoles")||diaSemana.equals("miércoles")) {
            System.out.println("Sistemas Informáticos");
        } else if (diaSemana.equals("martes")) {
            System.out.println("Programación");
        } else if (diaSemana.equals("jueves")) {
            System.out.println("IPE 1");
        } else if (diaSemana.equals("viernes")) {
            System.out.println("Bases de Datos");
        } else if (diaSemana.equals("sabado")||diaSemana.equals("sábado")||diaSemana.equals("domingo")) {
            System.out.println("Ese día no tienes clases!!!");
        } else {
            System.out.println("Has introducido un día incorrecto");
        }
    }
}
