package tema_5;

public class ejercicio_05_51 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(System.console().readLine("Introduzca un número entero (mayor que cero): "));
            if (num<=0) {
                System.out.println("Debe introducir un número entero mayor a cero.");
                return;
            }
            int comidos=0;
            int aux=num*10+1;
            int invertido=0;
            while (aux>0) {
                int ultDig = aux%10;
                if (ultDig==8||ultDig==0) {
                    comidos++;
                } else invertido=invertido*10+ultDig;
                aux/=10;
            }
            aux=invertido;
            invertido = 0;
            while (aux>0) {
                int ultDig = aux%10;
                invertido=invertido*10+ultDig;
                aux/=10;
            }
            if (comidos==0) {
                System.out.println("El gusano numérico no se ha comido ningún dígito.");
            } else System.out.println("Después de haber sido comido por el gusano numérico se queda en: "+invertido/10);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
