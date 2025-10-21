package tema_5;

public class ejercicio_05_10 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");
        int i = 0;
        int sumaNumeros = 0;
        int numeros = 0;
        while (i >= 0) {
            try {
                i = Integer.parseInt(System.console().readLine());
                
                if (i >= 0) {
                    sumaNumeros += i;
                    numeros++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ha introducido un número incorrecto.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado.");
            }
        }
        if (numeros > 0) {
            System.out.println("La media de los números positivos introducidos es " + (sumaNumeros / numeros));
        } else {
            System.out.println("No se ha introducido ningún número positivo.");
        }
    }
}
