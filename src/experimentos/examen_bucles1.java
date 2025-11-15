package experimentos;

public class examen_bucles1 {
    public static void main(String[] args) {
        try {
            int valMin = Integer.parseInt(System.console().readLine("Introduce el valor mínimo del rango: "));
            int valMax = Integer.parseInt(System.console().readLine("Introduce el valor máximo del rango: "));
            if (valMin < 0 || valMin < 0) {
                System.out.println("ERROR: Los valores del rango deben ser mayores o iguales a cero.");
            }
            int valRandom = (int) (Math.random() * (valMax - valMin + 1) + valMin);
            boolean bn = System.console().readLine("Dibujo la gráfica en blanco y negro o en color (B|C): ")
                    .toLowerCase().charAt(0) == 'b';
            int aux = valRandom * 10 + 1;
            int invertido = 0;
            int digitos = 0;
            int digitoMayor = 0;
            while (aux > 0) {
                int ultDig = aux % 10;
                invertido = invertido * 10 + ultDig;
                aux /= 10;
                digitos++;
                if (ultDig > digitoMayor)
                    digitoMayor = ultDig;
            }
            aux = invertido;
            invertido = 0;
            while (aux > aux % digitos) {
                int ultDig = aux % 10;
                invertido = invertido * 10 + ultDig;
                aux /= 10;
                if (bn) {
                    for (int i = 1; i <= digitoMayor + 1; i++) {
                        System.out.print(" ---");
                    }
                    System.out.println("");
                    for (int i = 1; i <= digitoMayor + 1; i++) {
                        System.out.printf("| %s ", (i == 1) ? ultDig : (i <= ultDig + 1) ? "*" : " ");
                    }
                    System.out.println("|");
                }
            }
            if (bn) {
                for (int i = 1; i <= digitoMayor + 1; i++) {
                    System.out.print(" ---");
                }
                System.out.println("");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
