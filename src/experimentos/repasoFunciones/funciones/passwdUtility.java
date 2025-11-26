package experimentos.repasoFunciones.funciones;

public interface passwdUtility {

    //Análisis de Caracteres Individuales
    public static boolean esEspacio(char caracter){
        return caracter==' ';
    }

    public static boolean estaEntre(char caracter, char inicio, char fin){
        return true;
    }

    public static boolean esDigito(char caracter){
        return true;
    }

    public static boolean esMinuscula(char caracter){
        return true;
    }

    public static boolean esMayuscula(char caracter){
        return true;
    }

    public static boolean esLetra(char caracter){
        return true;
    }

    public static boolean esSimbolo(char caracter){
        return true;
    }

    //Funciones de Análisis de Cadenas

    //Funciones de Análisis General

    //Funciones de Sanitización

    //Clasificación de Contraseñas
}
