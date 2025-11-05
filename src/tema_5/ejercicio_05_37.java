package tema_5;

public class ejercicio_05_37 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            System.out.printf("El %d en decimal es el ",num);
            int aux1 = num;
            int invertido = 0;
            while (aux1>0) {
                int ultDig = aux1%10;
                invertido = invertido*10+ultDig;
                aux1/=10;
            }
            int aux2= invertido;
            while (aux2>0) {
                int ultDig = aux2%10;
                for (int i=1; i<=ultDig; i++) {
                    System.out.print("|");
                }
                aux2/=10;
                if (aux2>0) {
                    System.out.print("-");
                }
            }
            System.out.println(" en el sistema de palotes.");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
