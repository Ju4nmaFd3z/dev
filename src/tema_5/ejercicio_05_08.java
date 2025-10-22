package tema_5;

public class ejercicio_05_08 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número y le mostraré su tabla de multiplicar: "));
            for (int i=0; i<=10; i++){
            System.out.printf("%d x %2d = %2d%n", num, i, num*i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}