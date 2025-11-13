package tema_5;

public class ejercicio_05_16 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número entero y le diré si es primo: "));
            boolean primo = true;
            int divisor = 2;
            if (num<=1) {
                System.out.println("El número introducido no es primo.");
                return;
            }
            if (num==2) {
                System.out.println("El número introducido es primo.");
                return;
            }
            while (divisor<=Math.sqrt(num)) {
                if (num%divisor==0) {
                    primo=false;
                    break;
                }
                divisor++;
            }
            System.out.printf("El número introducido %ses primo.%n",(primo)?"":"no ");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
