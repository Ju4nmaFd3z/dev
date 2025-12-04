package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_16 {
    public static void main(String[] args) {
        try {
            int[] numeros = arrays.rellenaAleatorios(20, 0, 400);
            boolean multiplo5 = false;
            boolean multiplo7 = false;
            for (int i=0; i<numeros.length; i++){
                System.out.print(numeros[i]+" ");
            }
            System.out.println("\n¿Qué números desea resaltar?");
            System.out.println("1) Los múltiplos de 5");
            System.out.println("2) Los múltiplos de 7");
            int opcion = Integer.parseInt(System.console().readLine("Elija una opción: "));
            switch (opcion) {
                case 1:
                    for (int i=0; i<numeros.length; i++){
                        if (numeros[i]%5==0)multiplo5=true;
                        else multiplo5 = false;
                        System.out.print(((multiplo5)?"["+numeros[i]+"]":numeros[i])+" ");
                    }
                    break;
                case 2:
                    for (int i=0; i<numeros.length; i++){
                        if (numeros[i]%7==0)multiplo7=true;
                        else multiplo7 = false;
                        System.out.print(((multiplo7)?"["+numeros[i]+"]":numeros[i])+" ");
                    }
                    break;
                default:
                    System.out.println("Debe introducir una opción válida.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}