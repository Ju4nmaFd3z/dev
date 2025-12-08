package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_12 {
    public static void main(String[] args) {
        try {
            int[] numeros = arrays.dameArray(10);
            System.out.println("Introduzca 10 números separados por intro:");
            for (int i=0; i<numeros.length; i++){
                numeros[i] = Integer.parseInt(System.console().readLine());
            }
            arrays.imprimirTabla(numeros);
            int posIni = Integer.parseInt(System.console().readLine("Introduzca la posición inicial (0-9): "));
            int posFin = Integer.parseInt(System.console().readLine("Introduzca la posición final (0-9): "));
            if (posIni < posFin && posIni>=0 && posIni<=9 && posFin>=0 && posFin<=9) {
                System.out.println("\nArray original:");
                arrays.imprimirTabla(numeros);
                int numAMover = numeros[posIni];
                numeros = arrays.desplazaArrayDerecha(numeros, 0, posIni);
                numeros = arrays.desplazaArrayDerecha(numeros, posFin, 9);
                numeros[posFin] = numAMover;
                System.out.println("\nArray modificado:");
                arrays.imprimirTabla(numeros);
            } else {
                System.out.println("Error en la entrada de datos.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}