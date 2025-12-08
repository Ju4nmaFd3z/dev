package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_07 {
    public static void main(String[] args) {
        try {
            boolean escogidoCorrecto = false;
            int[] numeros = arrays.rellenaAleatorios(100, 0, 20);
            arrays.visualizaArray(numeros);
            int escogido;
            do {
                escogido = Integer.parseInt(System.console().readLine("\nIntroduzca un número de los que se han mostrado: "));
                escogidoCorrecto = false;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == escogido) {
                        escogidoCorrecto = true;
                        break;
                    }
                }
                if (!escogidoCorrecto) System.out.println("Debe introducir un número de los que se han mostrado!");
            } while (!escogidoCorrecto);
            int sustituto = Integer.parseInt(System.console().readLine("Introduzca el valor por el que quiere sustituirlo: "));
            for (int i = 0; i < numeros.length; i++) {
                System.out.print((numeros[i] == escogido)?"\""+sustituto+"\""+" ":numeros[i]+" ");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}
