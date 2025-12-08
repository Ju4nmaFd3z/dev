package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_13 {
    public static void main(String[] args) {
        try {
            int[] numeros = arrays.rellenaAleatorios(100, 0, 500);
            int minimo = arrays.minimo(numeros);
            int maximo = arrays.maximo(numeros);
            arrays.visualizaArray(numeros);
            int opcion = Integer.parseInt(System.console().readLine("\n¿Qué quiere destacer? (1-Mínimo, 2-Máximo): "));
            switch (opcion) {
                case 1:
                    for (int i=0; i<numeros.length; i++){
                        System.out.print((numeros[i]==minimo)?"**"+numeros[i]+"**"+" ":numeros[i]+" ");
                    }
                    break;
                case 2:
                    for (int i=0; i<numeros.length; i++){
                        System.out.print((numeros[i]==maximo)?"**"+numeros[i]+"**"+" ":numeros[i]+" ");
                    }
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}
