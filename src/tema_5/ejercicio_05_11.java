package tema_5;

public class ejercicio_05_11 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
            System.out.println("  n  |  n2  |  n3  ");
            System.out.println("-------------------");
            for (int i=0; i<5; i++){
                int aux = num;
                int num2 = (int)Math.pow(aux, 2);
                int num3 = (int)Math.pow(aux, 3);
                System.out.printf("%3d  |%4d  |%5d%n", aux, num2, num3);
                num++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número entero.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }        
    }
}
