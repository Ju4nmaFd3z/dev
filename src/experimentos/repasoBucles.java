package experimentos;

public class repasoBucles {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static final String RESET = "\033[0m";
    public static final String WHITE_BACKGROUND = "\033[47m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static void main(String[] args) {
        try {
            int ancho = Integer.parseInt(System.console().readLine("Introduce el ancho del canva: "));
            int alto = Integer.parseInt(System.console().readLine("Introduce el alto del canva: "));
            int x = (ancho+1) / 2;
            int y = (alto+1) / 2;
            int vx = 0;
            int vy = 0;
            boolean salir = false;
            boolean auto = false;
            while (!salir) {
                for (int i = 1; i <= alto; i++) {
                    for (int j = 1; j <= ancho; j++) {
                        if (i == 1) {
                            if (y<=2) {
                                System.out.print(GREEN_BACKGROUND+" "+RESET);
                            } else System.out.print(WHITE_BACKGROUND+" "+RESET);
                        } else if (i == alto) {
                            if (y>=alto-1) {
                                System.out.print(GREEN_BACKGROUND+" "+RESET);
                            } else System.out.print(WHITE_BACKGROUND+" "+RESET);
                        } else if (j == 1) {
                            if (x<=2) {
                                System.out.print(GREEN_BACKGROUND+" "+RESET);
                            } else System.out.print(WHITE_BACKGROUND+" "+RESET);
                        } else if (j == ancho) {
                            if (x>=ancho-1) {
                                System.out.print(GREEN_BACKGROUND+" "+RESET);
                            } else System.out.print(WHITE_BACKGROUND+" "+RESET);
                        } else if (i==y && j==x) {
                            System.out.print("o");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                if (!auto) {
                    System.out.println("W. Arriba");
                    System.out.println("A. Izquierda");
                    System.out.println("S. Abajo");
                    System.out.println("D. Derecha");
                    System.out.println("Q. Automático");
                    System.out.println("X. Salir");
                    Character opcion = System.console().readLine().toUpperCase().charAt(0);
                    switch (opcion) {
                        case 'W':
                            if (y-1<2) y=2;
                            else y-=1;
                            break;
                        case 'A':
                            if (x-1<2) x=2;
                            else x-=1;
                            break;
                        case 'S':
                            if (y+1>alto-1) y=alto-1;
                            else y+=1;
                            break;
                        case 'D':
                            if (x+1>ancho-1) x=ancho-1;
                            else x+=1;
                            break;
                        case 'Q':
                            do {
                                vx = ((int)(Math.random()*2+1))*((int)(Math.random()*3-1));
                                vy = ((int)(Math.random()*2+1))*((int)(Math.random()*3-1));
                            } while (vx==0||vy==0);
                            auto = true;
                            break;
                        case 'X':
                            salir = true;
                            break;
                        default:
                            break;
                    }
                } else {
                    x+=vx;
                    y+=vy;
                    if ((x<=1&&vx<0)||(x>=ancho&&vx>0)) {
                        x=vx<0?2:ancho-1;
                        vx*=-1;
                    }
                    if ((y<=1&&vy<0)||(y>=alto&&vy>0)) {
                        y=vy<0?2:alto-1;
                        vy*=-1;
                    }
                }
                Thread.sleep(100);
                System.out.print(CLEAN_SCREEN);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
