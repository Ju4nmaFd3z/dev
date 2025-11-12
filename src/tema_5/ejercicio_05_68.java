package tema_5;

public class ejercicio_05_68 {
    public static void main(String[] args) {
        try {
            long num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número: "));
            long aux = num*10+1;
            long invertido = 0;
            String resultado = "";
            while (aux>0) {
                int ultDig = (int)aux%10;
                if (ultDig%2==0) ultDig+=1;
                else ultDig-=1;
                invertido = invertido*10+ultDig;
                aux/=10;
            }
            aux = invertido;
            while (aux>0) {
                int ultDig = (int)aux%10;
                resultado = resultado+ultDig;
                aux/=10;
            }
            System.out.printf("Dislocando el %d sale el %s.%n", num, resultado);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
