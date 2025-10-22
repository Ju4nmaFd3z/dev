package tema_5;

public class ejercicio_05_12 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los n primeros números de la serie Fibonacci.");
        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca n: "));
            if (num > 0)
                switch (num) {
                    case 1:
                        System.out.print("0");
                        break;
                    case 2:
                        System.out.print("0 1");
                        break;
                    default:
                        System.out.print("0 1");
                        int numPrimero = 0;
                        int numSegundo = 1;
                        int aux;
                        while (num > 2) {
                            aux = numPrimero;
                            numPrimero = numSegundo;
                            numSegundo = aux + numSegundo;
                            System.out.print(" " + numSegundo);
                            num--;
                        }
                        break;
                }
            else
                System.out.print("Introduce un número entero mayor a 0.");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
