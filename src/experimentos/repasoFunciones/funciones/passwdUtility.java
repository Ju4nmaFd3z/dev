package experimentos.repasoFunciones.funciones;

public interface passwdUtility {
    
    // Clasificación de Contraseñas

    public static String clasificarPassword(String password) {
        password = sanitizarPassword(password);
        if (password.equals(""))
            return "INVALIDA";
        if (esSoloLetras(password))
            return "DEBIL";
        if (contarTiposCaracteres(password) == 2)
            return "MEDIA";
        if (contarTiposCaracteres(password) >= 3)
            return "FUERTE";
        return "DEBIL";
    }

    public static String clasificarPassword(String password, int longitudMinima) {
        if (password.equals(""))
            return "INVALIDA";
        if (password.length() < longitudMinima || esSoloLetras(password))
            return "DEBIL";
        if (contarTiposCaracteres(password) == 2)
            return "MEDIA";
        if (contarTiposCaracteres(password) >= 3)
            return "FUERTE";
        return "DEBIL";
    }

    // Funciones de Análisis General

    public static boolean tieneLongitudMinima(String password, int minimo) {
        return password.length() >= minimo;
    }

    public static int contarTiposCaracteres(String password) {
        int tipoCaracteres = 0;
        if (contieneDigito(password))
            tipoCaracteres++;
        if (contieneMinuscula(password))
            tipoCaracteres++;
        if (contieneMayuscula(password))
            tipoCaracteres++;
        if (contieneSimbolo(password))
            tipoCaracteres++;
        return tipoCaracteres;
    }

    // Funciones de Análisis de Cadenas

    public static boolean contieneDigito(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esDigito(cadena.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneMinuscula(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esMinuscula(cadena.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneMayuscula(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esMayuscula(cadena.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneSimbolo(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esSimbolo(cadena.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean esSoloLetras(String cadena) {
        if (cadena.equals(""))
            return false;
        for (int i = 0; i < cadena.length(); i++) {
            if (!esLetra(cadena.charAt(i)))
                return false;
        }
        return true;
    }

    // Funciones de Sanitización

    private static int primerNoEspacio(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!esEspacio(password.charAt(i)))
                return i;
        }
        return -1;
    }

    private static int ultimoNoEspacio(String password) {
        for (int i = password.length() - 1; i >= 0; i--) {
            if (!esEspacio(password.charAt(i)))
                return i;
        }
        return -1;
    }

    public static String eliminarEspaciosExtremos(String password) {
        if (primerNoEspacio(password) == -1)
            return "";
        String res = "";
        for (int i = 0; i < password.length(); i++) {
            if (i >= primerNoEspacio(password) && i <= ultimoNoEspacio(password))
                res = res + password.charAt(i);
        }
        return res;
    }

    public static String reducirEspacios(String password, int minimoEspacios) {
        String res = "";
        password = eliminarEspaciosExtremos(password);
        int espacios = 0;
        for (int i = 0; i < password.length(); i++) {
            if (esEspacio(password.charAt(i))) {
                espacios++;
                if (espacios <= minimoEspacios) {
                    res = res + password.charAt(i);
                }
            } else {
                espacios = 0;
                res = res + password.charAt(i);
            }
        }
        return res;
    }

    public static String eliminarEspaciosInternos(String password) {
        return reducirEspacios(password, 0);
    }

    public static String sanitizarPassword(String password) {
        return eliminarEspaciosInternos(eliminarEspaciosExtremos(password));
    }

    // Análisis de Caracteres Individuales

    public static boolean esSimbolo(char caracter) {
        return !esEspacio(caracter) && !esDigito(caracter) && !esLetra(caracter);
    }

    public static boolean esLetra(char caracter) {
        return esMinuscula(caracter) || esMayuscula(caracter);
    }

    public static boolean esMinuscula(char caracter) {
        return estaEntre(caracter, 'a', 'z');
    }

    public static boolean esMayuscula(char caracter) {
        return estaEntre(caracter, 'A', 'Z');
    }

    public static boolean esDigito(char caracter) {
        return estaEntre(caracter, '0', '9');
    }

    public static boolean esEspacio(char caracter) {
        return caracter == ' ';
    }

    public static boolean estaEntre(char caracter, int inicio, int fin) {
        return caracter >= inicio && caracter <= fin;
    }
    
}
