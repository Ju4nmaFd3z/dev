package tema_5;

public class ejercicio_05_26 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
            int dig = Integer.parseInt(System.console().readLine("Introduzca un dígito: "));
            int invertido = 0;
            int aux = num;
            while (num > 0) {
                int ultimaCifra = num % 10;
                invertido = invertido * 10 + ultimaCifra;
                num /= 10;
            }
            int posicion = 1;
            String posiciones = "";
            while (invertido > 0) {
                int digActual = invertido % 10;
                invertido /= 10;
                if (digActual == dig) {
                    posiciones += posicion + " ";
                }
                posicion++;
            }
            if (posiciones.equals("")) {
                System.out.printf("El dígito %d no aparece dentro de %d.%n", dig, aux);
            } else {
                System.out.printf(
                        "Contando de izquierda a derecha, el %d aparece dentro de %d en las siguientes posiciones: %s%n",
                        dig, aux, posiciones);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}