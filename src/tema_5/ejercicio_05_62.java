package tema_5;

public class ejercicio_05_62 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine());
            int aux = num;
            int afortunados = 0;
            int noAfortunados = 0;
            while (aux>0) {
                int ultDig = aux%10;
                if (ultDig==3||ultDig==7||ultDig==8||ultDig==9) afortunados++;
                else noAfortunados++;
                aux/=10;
            }
            System.out.printf("El %d %ses un número afortunado", num, (afortunados>noAfortunados)?"":"no ");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
