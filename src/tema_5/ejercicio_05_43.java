package tema_5;

public class ejercicio_05_43 {
    public static void main(String[] args) {
        try {
            long num = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            if (num < 2) {
                System.out.println("Debe introducir un número mayor que 2");
                return;
            }
            int partirEn = Integer.parseInt(System.console().readLine("Introduzca la posición a partir de la cual quiere partir el número: "));
            if (num < 2) {
                System.out.println("Debe introducir una posición dentro del número");
                return;
            }
            long parte1 = 0;
            long parte2 = 0;
            long aux1 = num;
            long invertido = 0;
            while (aux1>0) {
                long ultDig = aux1%10;
                invertido = invertido*10+ultDig;
                aux1/=10;
            }
            int actual = 1;
            long aux2 = invertido;
            while (aux2>0) {
                long ultDig = aux2%10;
                aux2/=10;
                if (actual<partirEn) parte1=parte1*10+ultDig;
                else parte2=parte2*10+ultDig;
                actual++;
            }
            System.out.printf("Los números partidos son el %d y el %d", parte1, parte2);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
