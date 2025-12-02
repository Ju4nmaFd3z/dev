package tema_7;

public class ejercicio_07_PT1_05 {
    public static void main(String[] args) {
        final int LONGITUD = 8;
        int[] numeros = new int[LONGITUD];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Vaya introduciendo números enteros y pulsando la tecla INTRO.");
        for (int i=0; i<LONGITUD; i++){
            try {
                numeros[i] = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ha introducido un valor incorrecto.");
                i--;
                continue;
            }
            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        }
        System.out.println("------------");
        for (int i=0; i<LONGITUD; i++){
            System.out.printf("%d %s%n", numeros[i], (numeros[i]==maximo)?" -> máximo":(numeros[i]==minimo)?" -> mínimo":"");
        }
    }
}
