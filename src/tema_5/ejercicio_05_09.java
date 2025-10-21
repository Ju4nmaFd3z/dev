package tema_5;

public class ejercicio_05_09 {
    public static void main(String[] args) {
        System.out.println("Este programa cuenta los dígitos de un número.");
        try {
            long num = Long.parseLong(System.console().readLine("Introduzca un número entero: "));
            long n = num;
            long digitos = 1;
            while (n >= 10) {
                digitos++;
                n/=10;
            }
            System.out.println(num+" tiene "+digitos+" dígito/s.");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un número incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
