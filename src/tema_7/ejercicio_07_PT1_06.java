package tema_7;

public class ejercicio_07_PT1_06 {
    public static void main(String[] args) {
        final int LONGITUD = 12;
        int[] numeros = new int[LONGITUD];
        System.out.println("Vaya introduciendo números enteros y pulsando la tecla INTRO.");
        for (int i=0; i<LONGITUD; i++){
            try {
                numeros[i] = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ha introducido un valor incorrecto.");
                i--;
                continue;
            }
        }
        System.out.println();
        System.out.println("Array Original:");
        for (int i=0; i<LONGITUD; i++){
            System.out.print(numeros[i]+" ");
        }
        int aux = numeros[LONGITUD-1];
        for (int i=LONGITUD-1; i>0; i--){
            numeros[i]=numeros[i-1];
        }
        numeros[0] = aux;
        System.out.println();
        System.out.println("Array Rotado:");
        for (int i=0; i<LONGITUD; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}
