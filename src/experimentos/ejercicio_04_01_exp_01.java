package experimentos;

public class ejercicio_04_01_exp_01 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String diaSemana = System.console().readLine();
        System.out.printf("Los %s a primera hora tienes %s", diaSemana, switch(diaSemana.toLowerCase()){
            case "lunes"->"Sistemas Informáticos";
            case "martes"->"Programación";
            case "miercoles", "miércoles"->"Sistemas Informáticos";
            case "jueves"->"IPE 1";
            case "viernes"->"Bases de Datos";
            default->"error... Introduce un día válido";
        });
    }
}
