package tema_5;

public class ejercicio_05_55 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            if (num<0) {
                System.out.println("Debe introducir un número positivo.");
            }
            int digRotar = (int)(num%10);
            int numSinDig = (int)(num/10);
            System.out.printf("El número resultado es: %s.%n", ""+digRotar+numSinDig);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
