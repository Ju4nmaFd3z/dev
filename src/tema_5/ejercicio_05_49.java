package tema_5;

public class ejercicio_05_49 {
    public static void main(String[] args) {
        try {
            System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo");
            boolean primo = false;
            int noPrimos = 0;
            int max = 0;
            int min = 0;
            int suma = 0;
            boolean primerNoPrimo = true;
            while (!primo) {
                int num = Integer.parseInt(System.console().readLine());
                if (num <= 1) {
                    primo = false;
                    if (primerNoPrimo) {
                        max = num;
                        min = num;
                        primerNoPrimo = false;
                    } else {
                        max = Math.max(max, num);
                        min = Math.min(min, num);
                    }
                    suma += num;
                    noPrimos++;
                } else if (num == 2) {
                    primo = true;
                } else {
                    primo = true;
                    for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                        if (num % divisor == 0) {
                            primo = false;
                            break;
                        }
                    }
                    if (!primo) {
                        if (primerNoPrimo) {
                            max = num;
                            min = num;
                            primerNoPrimo = false;
                        } else {
                            max = Math.max(max, num);
                            min = Math.min(min, num);
                        }
                        suma += num;
                        noPrimos++;
                    }
                }
            }
            System.out.println("Ha introducido " + noPrimos + " números no primos.");
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            System.out.println("Media: " + (double)suma / noPrimos);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}