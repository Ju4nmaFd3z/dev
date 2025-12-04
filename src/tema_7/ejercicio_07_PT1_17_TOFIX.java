package tema_7;

import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_17_TOFIX {
    public static void main(String[] args) {
        try {
            final int LONGITUD = 10;
            int[] numeros = arrays.rellenaAleatorios(LONGITUD,0,100);
            boolean numCorrecto = true;
            int numIntroducido = 0;
            do {
                System.out.print("╔═══════════");
                for (int i=0; i<LONGITUD; i++){
                    System.out.print("╦════");
                }
                System.out.println("╗");
                System.out.printf("║ %-10s", "Índice:");
                for (int i=0; i<LONGITUD; i++){
                    System.out.printf("║%3d ", i+1);
                }
                System.out.print("║");
                System.out.println();
                System.out.print("╠═══════════");
                for (int i=0; i<LONGITUD; i++){
                    System.out.print("╬════");
                }
                System.out.println("╣");
                System.out.printf("║ %-10s", "Valor:");
                for (int i=0; i<LONGITUD; i++){
                    System.out.printf("║%3d ", numeros[i]);
                }
                System.out.print("║");
                System.out.println();
                System.out.print("╚═══════════");
                for (int i=0; i<LONGITUD; i++){
                    System.out.print("╩════");
                }
                System.out.println("╝");
                numIntroducido = Integer.parseInt(System.console().readLine("\nIntroduzca uno de los números del array: "));
                for(int i=0; i<LONGITUD; i++){
                    if (numIntroducido==numeros[i]){
                        numIntroducido = i;
                        numCorrecto = true;
                        break;
                    }
                }
                if (numCorrecto=false) System.out.println("Ese número no se encuentra en el array.");
            } while (!numCorrecto);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
