package experimentos.passwd;
import experimentos.passwd.funciones.passwdUtility;

public class passwd {
    // =========================
    //   Pequeño main de prueba
    // =========================
    public static void main(String[] args) {
        test("Hola123");
        test("Hola123!");
        test("holaholahola");
        test("  A1!bcD  ");
        test("12345678");
        test("!!!!AAAA");
    }
    private static void test(String password) {
        System.out.println("Password original: \"" + password + "\"");
        System.out.println("Sanitizada:       \"" +  passwdUtility.sanitizarPassword(password) + "\"");
        System.out.println("Tipos de chars:   " +  passwdUtility.contarTiposCaracteres( passwdUtility.sanitizarPassword(password)));
        System.out.println("Clasificación:    " +  passwdUtility.clasificarPassword(password));
        System.out.println("-------------------------------------");
    }
}
