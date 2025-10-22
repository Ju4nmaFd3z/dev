package experimentos;

public class ejercicio_05_11_exp {
    public static void main(String[] args) {
        boolean correcto = false;
        int numero = 0;
        do{
            try {
                System.out.print("Introduzca un número entero (Máx: "+ ((int)Math.pow(Integer.MAX_VALUE, 1.0/3.0)-4) +"): ");    
                numero = Integer.parseInt(System.console().readLine());
                if(Math.pow(numero+4,3)<=Integer.MAX_VALUE)
                    correcto = true;
                else
                    System.out.println("El número es demasiado grande. Intenta con uno más pequeño");

            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número entero");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }            
        }while(!correcto);
        int digitosn = 0;        
        int aux = numero+4;
        do{            
            aux = aux / 10;            
            digitosn++;
        }while(aux != 0);
        

        int digitosn2 = 0;        
        aux = (int)Math.pow(numero+4,2);
        do{            
            aux = aux / 10;            
            digitosn2++;
        }while(aux != 0);
        

        int digitosn3 = 0;        
        aux = (int)Math.pow(numero+4,3);
        do{            
            aux = aux / 10;            
            digitosn3++;
        }while(aux != 0);        
        String format = 
        "%"+ (int)Math.ceil((digitosn+1)/2.0)+"s"+
        "n"+
        "%"+ (int)Math.floor((digitosn+1)/2.0)+"s"+
        "|"+ 
        "%"+ (int)Math.ceil((digitosn2)/2.0)+"s"+
        "n2"+
        "%"+ (int)Math.floor((digitosn2)/2.0)+ "s" +
        "|"+ 
        "%"+ (int)Math.ceil((digitosn3)/2.0)+"s"+
        "n3"+
        "%"+ (int)Math.floor((digitosn3)/2.0)+ "s|%n";

        System.out.printf(format
            ,"", "", "", "", "", "");        
        for(int i = 1; i<= digitosn+digitosn2+digitosn3+9;i++)          
            System.out.print("-");
        System.out.println();
        for(int i = 0; i<5;i++){
            format = " %"+ (-digitosn)+"s |"+            
            " %"+ (-digitosn2)+"s |"+
            " %"+ (-digitosn3)+"s |%n";

            System.out.printf(format,
            (int)Math.pow(numero+i,1), 
            (int)Math.pow(numero+i,2), 
            (int)Math.pow(numero+i,3));     
        }
    }
    
}
