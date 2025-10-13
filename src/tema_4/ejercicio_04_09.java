package tema_4;

public class ejercicio_04_09 {
    public static void main(String[] args) {
        try {
            System.out.println("Este programa resuelve ecuaciones de segundo grado.");
            System.out.println("ax^2 + bx + c = 0");
            System.out.println("Por favor, introduzca los valores.");
            System.out.print("a = ");
            double a = Double.parseDouble(System.console().readLine());
            if (a == 0) {
                System.out.println("El valor 'a' no puede ser 0");
                return;
            }
            System.out.print("b = ");
            double b = Double.parseDouble(System.console().readLine());
            System.out.print("c = ");
            double c = Double.parseDouble(System.console().readLine());
            double discriminante = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a) ;
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a) ;
            if (discriminante > 0) {
                System.out.printf("x1 = %f%n", x1);
                System.out.printf("x2 = %f%n", x2);
            } else if (discriminante == 0) {
                System.out.printf("x1 = x2 = %f%n", x1);
            } else if (discriminante < 0) {
                System.out.println("La ecuación no tienen ninguna solución real");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}

//DUDA GENERAL, DISTINTO AL LIBRO