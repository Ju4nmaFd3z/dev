package tema_7;

public class ejercicio_07_PT2_01 {
    public static void main(String[] args) {
        int[][] tablaNumeros = new int[3][6];
        tablaNumeros[0][0] = 0;
        tablaNumeros[1][0] = 75;
        tablaNumeros[0][1] = 30;
        tablaNumeros[0][2] = 2;
        tablaNumeros[2][2] = -2;
        tablaNumeros[2][3] = 9;
        tablaNumeros[1][4] = 0;
        tablaNumeros[0][5] = 5;
        tablaNumeros[2][5] = 11;
        System.out.printf("%9s", "");
        for (int columna = 0; columna < tablaNumeros[0].length; columna++) {
            System.out.printf("%7s", "Col " + columna);
        }
        System.out.println();
        for (int fila = 0; fila < tablaNumeros.length; fila++) {
            System.out.printf("%7s", "Fila " + fila);
            for (int columna = 0; columna < tablaNumeros[fila].length; columna++) {
                System.out.printf("%7d", tablaNumeros[fila][columna]);
            }
            System.out.println();
        }
    }
}