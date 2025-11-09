package tema_5;

public class ejercicio_05_41 {
    public static void main(String[] args) {
        try {
            long num = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            long aux = num;
            int pares = 0;
            int impares = 0;
            while (aux>0) {
                long ultDig=aux%10;
                if (ultDig%2==0) pares++;
                else impares++;
                aux/=10;
            }
            System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", num, pares, impares);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
