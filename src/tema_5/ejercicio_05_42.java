package tema_5;

public class ejercicio_05_42 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            int aux = num;
            for (int i=1; i<=5; i++) {
                boolean primo = true;
                int divisor = 2;
                while (primo && divisor<=Math.sqrt(aux)) {
                    if (aux%divisor==0) primo=false;
                    divisor++;
                }
                System.out.printf("%d %ses primo%n", aux, (primo)?"":"no ");
                aux++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
