package experimentos;

public class examen_bucles2 {
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        try {
            boolean salir=false;
            while (!salir) {
                System.out.println("""
                *****************************************
                *                                       *
                *       NÚMEROS DIGITALES v1.0          *
                *                                       *
                *****************************************
                *                                       *
                *   [1] Mostrar secuencia (0 a N)       *
                *   [2] Número específico               *
                *   [0] Salir                           *
                *                                       *
                *****************************************
                """);
                int opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        int num = Integer.parseInt(System.console().readLine("Introduce un número del 0 al 9: "));
                        for (int i=1; i<= 7; i++) {
                            for (int digito=0; digito<=num; digito++) {
                                boolean superior = false; // Barra superior
                                boolean superiorDerecha = false; // Barra superior derecha
                                boolean superiorIzquierda = false; // Barra superior derecha
                                boolean central = false; // Barra central
                                boolean inferiorIzquierda = false; // Barra inferior izquierda
                                boolean inferiorDerecha = false; // Barra inferior derecha
                                boolean inferior = false; // Barra inferior
                                switch (digito) {
                                    case 0:
                                        superior=true;
                                        superiorDerecha = true;
                                        superiorIzquierda = true;
                                        inferiorIzquierda = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    case 1:
                                        superiorDerecha = true;
                                        inferiorDerecha = true;
                                        break;
                                    case 2:
                                        superior=true;
                                        superiorDerecha = true;
                                        central = true;
                                        inferiorIzquierda = true;
                                        inferior = true;
                                        break;
                                    case 3:
                                        superior=true;
                                        superiorDerecha = true;
                                        central = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    case 4:
                                        superiorIzquierda = true;
                                        superiorDerecha = true;
                                        central = true;
                                        inferiorDerecha = true;
                                        break;
                                    case 5:
                                        superior=true;
                                        superiorIzquierda = true;
                                        central = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    case 6:
                                        superior=true;
                                        superiorIzquierda = true;
                                        central = true;
                                        inferiorIzquierda = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    case 7:
                                        superior=true;
                                        superiorDerecha = true;
                                        inferiorDerecha = true;
                                        break;
                                    case 8:
                                        superior=true;
                                        superiorDerecha = true;
                                        superiorIzquierda = true;
                                        central = true;
                                        inferiorIzquierda = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    case 9:
                                        superior=true;
                                        superiorDerecha = true;
                                        superiorIzquierda = true;
                                        central = true;
                                        inferiorDerecha = true;
                                        inferior = true;
                                        break;
                                    default:
                                        System.out.println("Introduce una opción correcta.");
                                        break;
                                }
                                if (i==1&&superior) System.out.print(" *** ");
                                else if ((i==2||i==3)&&superiorDerecha&&superiorIzquierda) System.out.print("*   *");
                                else if ((i==2||i==3)&&superiorDerecha) System.out.print("    *");
                                else if ((i==2||i==3)&&superiorIzquierda) System.out.print("*    ");
                                else if (i==4&&central) System.out.print(" *** ");
                                else if ((i==5||i==6)&&inferiorDerecha&&inferiorIzquierda) System.out.print("*   *");
                                else if ((i==5||i==6)&&inferiorDerecha) System.out.print("    *");
                                else if ((i==5||i==6)&&inferiorIzquierda) System.out.print("*    ");
                                else if (i==7&&inferior) System.out.print(" *** ");
                                else if ((i==1&&!superior)||(i==4&&!central)||(i==7&&!inferior)) System.out.print("     ");
                                System.out.print("  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        num = Integer.parseInt(System.console().readLine("Introduce un número del 0 al 9: "));
                        for (int i=1; i<= 7; i++) {
                            boolean superior = false; // Barra superior
                            boolean superiorDerecha = false; // Barra superior derecha
                            boolean superiorIzquierda = false; // Barra superior derecha
                            boolean central = false; // Barra central
                            boolean inferiorIzquierda = false; // Barra inferior izquierda
                            boolean inferiorDerecha = false; // Barra inferior derecha
                            boolean inferior = false; // Barra inferior
                            switch (num) {
                                case 0:
                                    superior=true;
                                    superiorDerecha = true;
                                    superiorIzquierda = true;
                                    inferiorIzquierda = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                case 1:
                                    superiorDerecha = true;
                                    inferiorDerecha = true;
                                    break;
                                case 2:
                                    superior=true;
                                    superiorDerecha = true;
                                    central = true;
                                    inferiorIzquierda = true;
                                    inferior = true;
                                    break;
                                case 3:
                                    superior=true;
                                    superiorDerecha = true;
                                    central = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                case 4:
                                    superiorIzquierda = true;
                                    superiorDerecha = true;
                                    central = true;
                                    inferiorDerecha = true;
                                    break;
                                case 5:
                                    superior=true;
                                    superiorIzquierda = true;
                                    central = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                case 6:
                                    superior=true;
                                    superiorIzquierda = true;
                                    central = true;
                                    inferiorIzquierda = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                case 7:
                                    superior=true;
                                    superiorDerecha = true;
                                    inferiorDerecha = true;
                                    break;
                                case 8:
                                    superior=true;
                                    superiorDerecha = true;
                                    superiorIzquierda = true;
                                    central = true;
                                    inferiorIzquierda = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                case 9:
                                    superior=true;
                                    superiorDerecha = true;
                                    superiorIzquierda = true;
                                    central = true;
                                    inferiorDerecha = true;
                                    inferior = true;
                                    break;
                                default:
                                    System.out.println("Introduce una opción correcta.");
                                    break;
                            }
                            if (i==1&&superior) System.out.print(" *** ");
                            else if ((i==2||i==3)&&superiorDerecha&&superiorIzquierda) System.out.print("*   *");
                            else if ((i==2||i==3)&&superiorDerecha) System.out.print("    *");
                            else if ((i==2||i==3)&&superiorIzquierda) System.out.print("*    ");
                            else if (i==4&&central) System.out.print(" *** ");
                            else if ((i==5||i==6)&&inferiorDerecha&&inferiorIzquierda) System.out.print("*   *");
                            else if ((i==5||i==6)&&inferiorDerecha) System.out.print("    *");
                            else if ((i==5||i==6)&&inferiorIzquierda) System.out.print("*    ");
                            else if (i==7&&inferior) System.out.print(" *** ");
                            else if ((i==1&&!superior)||(i==4&&!central)||(i==7&&!inferior)) System.out.print("     ");
                            System.out.println();
                        }
                        break;
                    case 0:
                        System.out.println("Hasta pronto!");
                        salir = true;
                        break;
                    default:
                        limpiarPantalla();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
