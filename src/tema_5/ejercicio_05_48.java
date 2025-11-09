package tema_5;

public class ejercicio_05_48 {
    public static void main(String[] args) {
        try {
            long num = Long.parseLong(System.console().readLine("Introduzca un número entero: "));
            long aux = num;
            long invertido = 0;
            while (aux>0) {
                long ultDig = aux%10;
                invertido = invertido*10+ultDig;
                aux/=10;
            }
            boolean esta = false;
            System.out.print("Dígitos que aparecen en el número:");
            for (int i=0; i<=9; i++) {
                aux=invertido;
                esta=false;
                while (aux>0) {
                    int ultDig = (int)aux%10;
                    if (ultDig==i) esta=true;
                    aux/=10;
                }
                if (esta) System.out.print(" "+i);
            }
            System.out.println();
            System.out.print("Dígitos que no aparecen en el número:");
            for (int i=0; i<=9; i++) {
                aux=invertido;
                esta=false;
                while (aux>0) {
                    int ultDig = (int)aux%10;
                    if (ultDig==i) esta=true;
                    aux/=10;
                }
                if (!esta) System.out.print(" "+i);
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
