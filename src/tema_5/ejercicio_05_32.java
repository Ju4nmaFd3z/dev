package tema_5;

public class ejercicio_05_32 {
    public static void main(String[] args) {
        try {
            long num = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));
            String digitosPares = "";
            long sumaPares = 0;
            do {
                long siguiente = num%10;
                num = num/10;
                if (siguiente%2==0) {
                    digitosPares = siguiente+" "+digitosPares;
                    sumaPares+=siguiente;
                }
            } while (num>0);
            System.out.printf("Dígitos pares:%s%n", digitosPares);
            System.out.printf("Suma de los dígitos pares: %d%n", sumaPares);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}