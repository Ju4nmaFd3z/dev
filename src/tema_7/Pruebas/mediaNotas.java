package tema_7.Pruebas;

public class mediaNotas {
    public static void main(String[] args) {
        double [] notasTrimestrales = new double[3];
        double media = 0;
        for (int i=0; i<3; i++){
            notasTrimestrales [i] = Double.parseDouble(System.console().readLine("Introduce tu nota del "+(i+1)+"º trimestre: "));
            media = media+notasTrimestrales[i];
        }
        System.out.printf("Tu media anual es de: %.2f%n", media/3);
    }
}
