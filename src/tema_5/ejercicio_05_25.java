package tema_5;

public class ejercicio_05_25 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
            int aux = num;
            int invertido = 0;
            while (aux>0) {
                int ultimaCifra = aux%10;
                invertido = invertido * 10 + ultimaCifra;
                aux = aux/10;
            }
            System.out.printf("Si le damos la vuelta al %d tenemos el %d.", num, invertido);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
