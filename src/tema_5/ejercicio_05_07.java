package tema_5;

public class ejercicio_05_07 {
    public static void main(String[] args) {
        //La clave no puede empezar por 0 ¿?
        final int PASSWD = 2025;
        int intentos = 0;
        int clave = 0;
        do {
            try {
                clave = Integer.parseInt(System.console().readLine("Introduzca la clave de la caja fuerte: "));
                if (clave!=PASSWD)
                    System.out.println("Ha introducido una clave incorrecta!");
                intentos++;
            } catch (NumberFormatException e) {
                System.out.println("Ha introducido un valor incorrecto.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado.");
            }
        } while (clave!=PASSWD && intentos < 4);
        if (clave!=PASSWD && intentos > 4)
            System.out.println("Has agotado todos los intentos!");
        else
            System.out.println("Has abierto la caja fuerte");
    }
}
