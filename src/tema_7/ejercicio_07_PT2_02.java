package tema_7;

public class ejercicio_07_PT2_02 {
    public static void main(String[] args) {
        try {
            int[][] tablaNumeros = new int[4][5];
            int sumaI=0;
            int sumaJ=0;
            int total=0;
            for (int i=0; i<tablaNumeros.length; i++){
                for (int j=0; j<tablaNumeros[0].length; j++){
                    tablaNumeros[i][j]=Integer.parseInt(System.console().readLine("Fila "+i+", columna "+j+": "));
                }
            }
            for (int i=0; i<tablaNumeros.length; i++){
                for (int j=0; j<tablaNumeros[0].length; j++){
                    System.out.printf("%7d   ", tablaNumeros[i][j]);
                    sumaI = sumaI+tablaNumeros[i][j];
                }
                System.out.printf("|%7d   %n", sumaI);
                sumaI=0;
            }
            for (int i=0; i<=tablaNumeros[0].length; i++){
                System.out.print("----------");
            }
            System.out.println();
            for (int i=0; i<tablaNumeros.length; i++){
                for (int j=0; j<tablaNumeros[0].length; j++){
                    sumaJ = sumaJ+tablaNumeros[j][i];
                    System.out.printf("%7d   ", sumaJ);
                    total = total+sumaJ;
                }
                System.out.printf("|%7d   %n", total);
                sumaJ=0;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
//TODO: Fix Suma J y Totales