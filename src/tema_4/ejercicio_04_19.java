package tema_4;

public class ejercicio_04_19 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número de hasta 5 cifras: ");
        int num = Integer.parseInt(System.console().readLine());
        int primera = 0;
        if (num < 10) {
            primera = num;
        } else if (num < 100) {
            primera = num / 10;
        } else if (num < 1000) {
            primera = num /100;
        } else if (num < 10000) {
            primera = num / 1000;
        } else if (num < 100000) {
            primera = num / 10000;
        } else if (num >= 100000) {
            System.out.println("El número introducido no es correcto, introduzca un número de 5 cifras");
        } else {
            System.out.printf("La primera cifra es %d", primera);
        }
    }
}
