package tema_8.funciones;

public interface funciones {

    /**
     * Comprueba si un número es capicúa (se lee igual de izquierda a derecha que de derecha a izquierda).
     * 
     * @param num el número a comprobar
     * @return true si el número es capicúa, false en caso contrario
     */
    public static boolean esCapicua(int num) {
        return num == voltea(num);
    }

    /**
     * Comprueba si un número es primo.
     * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
     * 
     * @param num el número a comprobar
     * @return true si el número es primo, false en caso contrario
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    /**
     * Devuelve el siguiente número primo al número dado.
     * 
     * @param num el número a partir del cual buscar el siguiente primo
     * @return el siguiente número primo después de num
     */
    public static int siguientePrimo(int num) {
        num+=1;
        while (!esPrimo(num)) {
            num++;
        }
        return num;
    }

    /**
     * Quita una cantidad de dígitos por la derecha de un número.
     * 
     * @param num el número al que quitar dígitos
     * @param digitos la cantidad de dígitos a eliminar por la derecha
     * @return el número resultante sin los dígitos de la derecha
     */
    public static int quitaPorDetras(int num, int digitos) {
        return (int)quitaPorDetras((long)num, digitos);
    }

    public static long quitaPorDetras(long num, int digitos) {
        num = num/(long)potencia(10, digitos);
        return num;
    }

    /**
     * Quita una cantidad de dígitos por la izquierda de un número.
     * 
     * @param num el número al que quitar dígitos
     * @param digitos la cantidad de dígitos a eliminar por la izquierda
     * @return el número resultante sin los dígitos de la izquierda
     */
    public static int quitaPorDelante(int num, int digitos) {
        return (int)quitaPorDelante((long)num, digitos);
    }

    public static long quitaPorDelante(long num, int digitos) {
        num = num%(long)potencia(10, digitos(num)-digitos);
        return num;
    }

    /**
     * Calcula la potencia de un número (base elevada a exponente).
     * Soporta exponentes negativos devolviendo un valor decimal.
     * 
     * @param base la base de la potencia
     * @param exponente el exponente de la potencia
     * @return el resultado de elevar base a exponente
     */
    public static int potencia(int base, int exponente) {
        return (int)potencia((long)base, exponente);
    }

    public static long potencia(long base, int exponente) {
        return (long)potencia((double)base, exponente);
    }

    public static double potencia(double base, int exponente) {
        return (exponente<0)?1.0/_potencia(base, -exponente):(exponente==0)?1:_potencia(base, exponente);
    }

    /**
     * Método auxiliar privado para calcular potencias con exponentes positivos.
     * 
     * @param base la base de la potencia
     * @param exponente el exponente de la potencia (se usa su valor absoluto)
     * @return el resultado de elevar base a exponente
     */
    private static double _potencia(double base, int exponente) {
        int res = 1;
        for (int i=1; i<=Math.abs(exponente); i++) {
            res*=base;
        }
        return res;
    }

    /**
     * Devuelve la posición de la primera aparición de un dígito en un número.
     * Las posiciones se cuentan de izquierda a derecha empezando por 0.
     * 
     * @param num el número en el que buscar
     * @param dig el dígito a buscar (debe estar entre 0 y 9)
     * @return la posición del dígito, o -1 si no se encuentra o el dígito no es válido
     */
    public static int posicionDeDigito(int num, int dig) {
        if (dig < 0 || dig > 9) return -1;
        for (int i=0; i<digitos(num); i++){
            if (digitoN(num, i)==dig) return i;
        }
        return -1;
    }

    /**
     * Devuelve el dígito que está en una posición determinada de un número.
     * Las posiciones se cuentan de izquierda a derecha empezando por 0.
     * 
     * @param num el número del que extraer el dígito
     * @param pos la posición del dígito a obtener
     * @return el dígito en la posición indicada
     */
    public static int digitoN(int num, int pos) {
        return (int)digitoN((long)num, pos);
    }

    public static long digitoN(long num, int pos) {
        num = Math.abs(num);
        return trozoDeNumero(num, pos, pos);
    }

    /**
     * Extrae un trozo de un número desde una posición inicial hasta una posición final.
     * Las posiciones se cuentan de izquierda a derecha empezando por 0.
     * 
     * @param num el número del que extraer el trozo
     * @param posIni la posición inicial (inclusiva)
     * @param posFin la posición final (inclusiva)
     * @return el trozo del número, o el número completo si posIni > posFin
     */
    public static int trozoDeNumero(int num, int posIni, int posFin) {
        return (int)trozoDeNumero((long)num, posIni, posFin);
    }

    public static long trozoDeNumero(long num, int posIni, int posFin) {
        if (posIni<=posFin) {
            num = quitaPorDetras(num, digitos(num)-posFin-1);
            num = quitaPorDelante(num, posIni);
            return num;
        }
        return num;
    }

    /**
     * Junta dos números concatenándolos (el segundo número se añade al final del primero).
     * 
     * @param num1 el primer número
     * @param num2 el segundo número que se añadirá al final del primero
     * @return el número resultante de juntar num1 y num2
     */
    public static int juntaNumeros(int num1, int num2) {
        int digitosSegundo = digitos(num2);
        for (int i=0; i<digitosSegundo; i++) {
            num1 = pegaPorDetras(num1, digitoN(num2, i));
        }
        return num1;
    }

    /**
     * Voltea un número (invierte el orden de sus dígitos).
     * Conserva el signo si el número es negativo.
     * 
     * @param num el número a voltear
     * @return el número con sus dígitos en orden inverso
     */
    public static int voltea(int num) {
        boolean negativo = num<0;
        num = Math.abs(num);
        int volteado = 0;
        while (num > 0) {
            volteado = volteado * 10 + num % 10;
            num /= 10;
        }
        return (negativo)?-volteado:volteado;
    }

    /**
     * Cuenta la cantidad de dígitos que tiene un número.
     * 
     * @param num el número del que contar los dígitos
     * @return la cantidad de dígitos del número
     */
    public static int digitos(int num) {
        return (int)digitos((long)num);
    }

    public static int digitos(long num) {
        num = Math.abs(num);
        int digitos = 0;
        do {
            digitos++;
            num/=10;
        } while (num>0);
        return digitos;
    }

    /**
     * Añade un dígito al final (por la derecha) de un número.
     * 
     * @param num el número al que añadir el dígito
     * @param dig el dígito a añadir
     * @return el número resultante con el dígito añadido al final
     */
    public static int pegaPorDetras(int num, int dig) {
        num = num*10+dig;
        return num;
    }

    /**
     * Añade un dígito al principio (por la izquierda) de un número.
     * 
     * @param num el número al que añadir el dígito
     * @param dig el dígito a añadir
     * @return el número resultante con el dígito añadido al principio
     */
    public static int pegaPorDelante(int num, int dig) {
        return juntaNumeros(dig, num);
    }
}