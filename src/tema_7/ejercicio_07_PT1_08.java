package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_08 {
    public static void main(String[] args) {
        try {
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            int[] temperaturas = arrays.dameArray(12);
            for (int i=0; i<meses.length; i++){
                temperaturas[i]=Integer.parseInt(System.console().readLine("Introduzca la temperatura media de "+meses[i]+": "));
            }
            for (int i=0; i<meses.length; i++){
                System.out.printf("%12s│", meses[i]);
                for (int j=0; j<temperaturas[i]; j++){
                    System.out.print("■");
                }
                System.out.print(" "+temperaturas[i]+"ºC");
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}