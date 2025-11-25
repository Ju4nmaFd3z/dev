package tema_8.funciones;

public class pruebas {
    public static void main(String[] args) {
        // Pruebas básicas
        System.out.println(funciones.esCapicua(12321)); // true
        System.out.println(funciones.esPrimo(17)); // true
        System.out.println(funciones.siguientePrimo(10)); // 11
        System.out.println(funciones.voltea(12345)); // 54321
        System.out.println(funciones.digitos(12345)); // 5
        System.out.println(funciones.digitoN(12345, 2)); // 3
        System.out.println(funciones.quitaPorDetras(12345, 2)); // 123
        System.out.println(funciones.quitaPorDelante(12345, 2)); // 345
        System.out.println(funciones.trozoDeNumero(12345, 1, 3)); // 234
        System.out.println(funciones.juntaNumeros(123, 456)); // 123456
        System.out.println(funciones.pegaPorDetras(123, 4)); // 1234
        System.out.println(funciones.pegaPorDelante(123, 4)); // 4123
        System.out.println(funciones.posicionDeDigito(12345, 3)); // 2
        System.out.println(funciones.potencia(2, 3)); // 8
    }
}
