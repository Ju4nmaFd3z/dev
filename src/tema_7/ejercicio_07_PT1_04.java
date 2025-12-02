package tema_7;

public class ejercicio_07_PT1_04 {
    public static void main(String[] args) {
        final int LONGITUD = 12;
        int[] numero = new int[LONGITUD];
        int[] cuadrado = new int[LONGITUD];
        int[] cubo = new int[LONGITUD];
        for (int i=0; i<LONGITUD; i++){
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=numero[i]*numero[i];
            cubo[i]=numero[i]*numero[i]*numero[i];
        }
        System.out.println("   n  |   n²  |   n³");
        System.out.println("----------------------");
        for (int i=0; i<LONGITUD; i++){
            System.out.printf("%4d  |%5d  |%7d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
