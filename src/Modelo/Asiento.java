
package Modelo;


public class Asiento {
    
    
    private float costoLata, costoCobre, costoPlata, costoOro, costoDiamante, costoAsiento;
    private boolean disponibilidad;
    private int fila, columna;
    String area;
    
    public Asiento(int fila, int columna, Funcion f){
        costoLata = f.getCostoLata();
        costoCobre = f.getCostoCobre();
        costoPlata = f.getCostoPlata();
        costoOro = f.getCostoOro();
        costoDiamante = f.getCostoDiamante();
        this.columna = columna;
        this.fila = fila;
        disponibilidad = false;
        asignarArea();
        
        
        
    }
    
    public float getCostoAsiento(){
        return costoAsiento;
    }
    
    
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }

    private void asignarArea() {
        if((fila > 2 && columna < 7) || (fila > 2 && columna > 14)){
            area = "lata";
            costoAsiento = costoLata;
        }
        if((fila > 5 && columna > 6) && columna < 15){
            area = "cobre";
            costoAsiento = costoCobre;
        }
        if((fila < 3 && columna < 7) || (fila < 3 && columna > 14)){
            area = "plata";
            costoAsiento = costoPlata;
        }
        if((fila < 3 && columna > 6) && columna < 15){
            area = "oro";
            costoAsiento = costoOro;
        }
        if((fila > 2 && columna > 6) && (fila < 6 && columna <15)){
            area = "diamante";
            costoAsiento = costoDiamante;
        }
    }

    public String getArea() {
        return area;
    }


    
    
}
