package tema_7;

public class ejercicio_07_PT1_15 {
    public static void main(String[] args) {
        try {
            final int MESAS = 10;
            final int MAX_MESA = 4;
            int[] mesa = new int[MESAS];
            for (int i=0; i<MESAS; i++){
                mesa[i] = (int)(Math.random()*(MAX_MESA+1));
            }
            int numIntroducido = 0;
            do {
                System.out.print("╔═══════════");
                for (int i=0; i<MESAS; i++){
                    System.out.print("╦════");
                }
                System.out.println("╗");
                System.out.printf("║ %-10s", "Mesa Nº:");
                for (int i=0; i<MESAS; i++){
                    System.out.printf("║%3d ", i+1);
                }
                System.out.print("║");
                System.out.println();
                System.out.print("╠═══════════");
                for (int i=0; i<MESAS; i++){
                    System.out.print("╬════");
                }
                System.out.println("╣");
                System.out.printf("║ %-10s", "Ocupación:");
                for (int i=0; i<MESAS; i++){
                    System.out.printf("║%3d ", mesa[i]);
                }
                System.out.print("║");
                System.out.println();
                System.out.print("╚═══════════");
                for (int i=0; i<MESAS; i++){
                    System.out.print("╩════");
                }
                System.out.println("╝");
                numIntroducido = Integer.parseInt(System.console().readLine("¿Cuántos son? [Introduzca -1 para salir del programa]: "));
                boolean mesaVacia = false;
                int numMesaVacia = 0;
                boolean mesaConHueco = false;
                int numMesaConHueco = 0;
                for (int i=0; i<MESAS; i++){
                    if (mesa[i]==0) {
                        mesaVacia = true;
                        numMesaVacia = i;
                        break;
                    } else if ((mesa[i]+numIntroducido)<=MAX_MESA) {
                        mesaConHueco = true;
                        numMesaConHueco = i;
                        break;
                    }
                }
                if (numIntroducido<=MAX_MESA&&numIntroducido>0) {
                    if (mesaVacia) {
                        mesa[numMesaVacia] = numIntroducido;
                        System.out.println("Por favor, siéntese en la mesa número "+(numMesaVacia+1)+".");
                    } else if (mesaConHueco) {
                        mesa[numMesaConHueco] += numIntroducido;
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa número "+(numMesaConHueco+1)+".");
                    } else System.out.println("Lo sentimos, en estos momentos no queda sitio.");
                } else if (numIntroducido>MAX_MESA){
                    System.out.println("Lo sentimos, no admitimos grupos de "+numIntroducido+", haga grupos de "+MAX_MESA+" personas como máximo e intente de nuevo.");
                } else if (numIntroducido!=-1) System.out.println("Debe introducir una opción correcta");
            } while (numIntroducido!=-1);
            System.out.println("Gracias. Hasta pronto!");
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}