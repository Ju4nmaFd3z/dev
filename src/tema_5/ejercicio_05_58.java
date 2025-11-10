package tema_5;

public class ejercicio_05_58 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int aux = num;
            int digitos = 0;
            int suma = 0;
            while (aux > 0) {
                int ultDig = aux % 10;
                suma = suma + ultDig;
                digitos++;
                aux /= 10;
            }
            double media = (double) suma / digitos;
            if (media * 10 % 1 == 0) {
                System.out.printf("La media de sus dígitos es %.1f.%n", media);
            } else {
                System.out.printf("La media de sus dígitos es %.2f.%n", media);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
