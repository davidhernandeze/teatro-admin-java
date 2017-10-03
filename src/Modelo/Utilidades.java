

package Modelo;


public class Utilidades {
    
    public static String deNumeroALetra(int a){
        switch(a){
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            case 6:
                return "F";
            case 7:
                return "G";
            case 8:
                return "H";
                
        }
        return "ERROR";
    }
    
    public static float calcularPrecio(int fila, int columna, Funcion f ) {
        if((fila > 2 && columna < 7) || (fila > 2 && columna > 14)){
            return f.getCostoLata();
        }
        if((fila > 5 && columna > 6) && columna < 15){
            return f.getCostoCobre();
        }
        if((fila < 3 && columna < 7) || (fila < 3 && columna > 14)){

            return f.getCostoPlata();
        }
        if((fila < 3 && columna > 6) && columna < 15){
            return f.getCostoOro();
        }
        if((fila > 2 && columna > 6) && (fila < 6 && columna <15)){
            return f.getCostoDiamante();
        }
        return 0;
    }
}
