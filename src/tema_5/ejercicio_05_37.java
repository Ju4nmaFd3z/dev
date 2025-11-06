package tema_5;

public class ejercicio_05_37 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            int aux = num*10+1;
            int inv = 0;
            int digitos = 0;
            while (aux>0) {
                int ultDig = aux%10;
                inv = inv*10+ultDig;
                aux /= 10;
                digitos++;
            }
            int aux2 = inv;
            while (aux2!=1) {
                int numPalote = aux2%10;
                for (int i=1; i<=numPalote; i++) {
                    System.out.print("|");
                }
                if (numPalote<digitos-1) System.out.print("-");
                aux2/=10;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
