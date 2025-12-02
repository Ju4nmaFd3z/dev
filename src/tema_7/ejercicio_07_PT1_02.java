package tema_7;

public class ejercicio_07_PT1_02 {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        char[] simbolo = new char [LONGITUD];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for (int i=0; i<LONGITUD; i++){
            System.out.println(simbolo[i]);
        }
    }
}
