package tema_7;

public class ejercicio_07_PT2_02 {
    public static void main(String[] args) {
        try {
            int[][] tablaNumeros = new int[4][5];
            for (int i=0; i<tablaNumeros.length; i++){
                for (int j=0; j<tablaNumeros[0].length; j++){
                    tablaNumeros[i][j]=Integer.parseInt(System.console().readLine("Fila "+i+", columna "+j+": "));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
//TODO: TERMINAR