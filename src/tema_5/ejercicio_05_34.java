package tema_5;

public class ejercicio_05_34 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(System.console().readLine("Por favor, introduzca un número: "));
            int num2 = Integer.parseInt(System.console().readLine("Introduzca otro número: "));
            String formadoPares = "";
            String formadoImpares = "";
            int invertido1 = 0;
            int invertido2 = 0;
            while (num1>0) {
                int primerDig = num1%10;
                invertido1 = invertido1 * 10 + primerDig;
                num1/=10; 
            }
            while (num2>0) {
                int primerDig = num2%10;
                invertido2 = invertido2 * 10 + primerDig;
                num2/=10; 
            }
            while (invertido1>0||invertido2>0) {
                if (invertido1>0) {
                    int primerNum = invertido1%10;
                    if (primerNum%2==0) {
                        formadoPares=formadoPares+primerNum+" ";
                    } else {
                        formadoImpares=formadoImpares+primerNum+" ";
                    }
                    invertido1 /= 10;
                }
                if (invertido2>0) {
                    int primerNum = invertido2%10;
                    if (primerNum%2==0) {
                        formadoPares=formadoPares+primerNum+" ";
                    } else {
                        formadoImpares=formadoImpares+primerNum+" ";
                    }
                    invertido2 /= 10;
                }
            }
            System.out.printf("El número formado por los dígitos pares es: %s%n", formadoPares);
            System.out.printf("El número formado por los dígitos impares es: %s%n", formadoImpares);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
