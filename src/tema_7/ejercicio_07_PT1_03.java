package tema_7;

public class ejercicio_07_PT1_03 {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        int[] numeros = new int[LONGITUD];
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        for (int i=0; i<LONGITUD; i++){
            try {
                numeros[i] = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ha introducido un valor incorrecto.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado.");
            }
        }
        System.out.println();
        System.out.println("Los número introducidos, al revés, son los siguientes:");
        for (int i=LONGITUD-1; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
