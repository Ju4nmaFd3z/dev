package tema_8.funciones;

public class funciones {
    /**
     * Esta función te devuelve la potencia de una base y un exponente introducidos por teclado.
     * @param
     * @return Potencia.
     */
    public static double potencia(int x, int y) {
        double resultado = 1;
            if (y>0) {
                while (y>0) {
                    resultado*=x;
                    y--;
                }
            } else if (y<0) {
                while (y<0) {
                    resultado/=x;
                    y++;
                }
            } else resultado = 1;
        return resultado;
    }

    /**
     * Esta función te devuelve un valor booleano indicando si el número introducido es o no capicúa.
     * @param x
     * @return True/False
     */
    public static boolean esCapicua(int x) {
        boolean esCapicua = false;
        if (x==voltea(x)) {
            esCapicua = true;
        }
        return esCapicua;
    }

    /**
     * Esta función te devuelve un número volteado.
     * @param x
     * @return Número Volteado.
     */
    public static int voltea(int x) {
        int aux = x;
        int invertido = 0;
        while (aux!=0) {
            int ultDig = aux%10;
            invertido = invertido*10+ultDig;
            aux /= 10;
        }
        return invertido;
    }

    /**
     * Esta función te devuelve la posición de la primera ocurrencia del número que le hayamos dicho.
     * @param x
     * @return Posición de la primera ocurrencia del número que le hayamos dicho.
     */
    public static int posicionDeDigito(int x, int y) {
        x = Math.abs(x);
        x = voltea(x);
        int digitoActual;
        int posicion = 0;
        while (x>0) {
            digitoActual = x%10;
            if (digitoActual==y) return posicion;
            x/=10;
            posicion++;
        }
        return -1;
    }

    /**
     * Esta función le quita a un número n dígitos por detrás.
     * @param x
     * @return Número recortado.
     */
    public static int quitaPorDetras(int x, int y) {
        x = Math.abs(x);
        for (int i=1; i<=y; i++) {
            x/=10;
        }
        return x*((x<0)?-1:1);
    }

    /**
     * Esta función le quita a un número n dígitos por delante.
     * @param x
     * @return Número recortado.
     */
    public static int quitaPorDelante(int x, int y) {
        x = Math.abs(x);
        x = voltea(x);
        for (int i=1; i<=y; i++) {
            x /= 10;
        }
        x = voltea(x);
        return x*((x<0)?-1:1);
    }

    /**
     * Esta función te devuelve el número que se encuentra en una posición específica.
     * @param x
     * @return Número que se encuentra en la posición deseada.
     */
    public static int digitoN(int x, int y) {
        if (y>digitos(x)-1) {
            return -1;
        }
        x = Math.abs(x);
        x = voltea(x);
        int digitoActual = 0;
        for (int i=0; i<=y; i++) {
            digitoActual = x%10;
            x/=10;
        }
        return digitoActual;
    }

    /**
     * Esta función cuenta el número de dígitos de un número.
     * @param
     * @return Dígitos del número introducido.
     */
    public static int digitos(int x) {
        if (x==0) return 1;
        x = Math.abs(x);
        int digitos = 0;
        while (x>0) {
            digitos++;
            x/=10;
        }
        return digitos;
    }

    /**
     * Esta función te devuelve el menor número primo mayor al número introducido.
     * @param x
     * @return Menor primo mayor al número introducido.
     */
    public static int siguientePrimo(int x) {
        x+=1;
        while (!esPrimo(x)) {
            x++;
        }
        return x;
    }

    /**
     * Esta función te devuelve un valor booleano indicando si el número introducido es o no primo.
     * @param x
     * @return True/False
     */
    public static boolean esPrimo(int x) {
        if (x <= 1) return false;
        int limite = (int) Math.sqrt(x);
        for (int i = 2; i <= limite; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
