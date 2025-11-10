package tema_5;

public class ejercicio_05_52 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            int numFinal = 0;
            int aux = num;
            int digRotar = 0;
            int digitos = 0;
            if (num<0) {
                System.out.println("Debe introducir un número positivo.");
                return;
            }
            while (aux>0) {
                digitos++;
                aux/=10;
            }
            int numSinPrimero = (int)(num%Math.pow(10, digitos-1));
            digRotar = (int)(num/Math.pow(10, digitos-1));
            numFinal = numSinPrimero*10+digRotar;
            System.out.printf("El número resultado es %d.%n",numFinal);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
