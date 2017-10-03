
package Modelo;

import Modelo.Asiento;
import java.util.ArrayList;

public class Funcion {
    
    
    private String nombreFuncion, mes;
    private int dia, año, duracion;
    private Asiento[][] listaAsientos = new Asiento [9][21];
    private boolean[][] lugaresOcupados = new boolean[9][21];
    private float costoLata=0, costoCobre=0, costoPlata=0, costoOro=0, costoDiamante=0;
    private boolean disponibilidad;
    
    public Funcion(String nombreFuncion, int dia, String mes, int año, int duracion){
        this.nombreFuncion = nombreFuncion;
        this.dia = dia;
        this.mes = mes;
        this.duracion = duracion;
        disponibilidad = true;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public String getNombreFuncion(){
        return nombreFuncion;
    }
    
    public boolean verificarLugar(int fila, int columna){
        return lugaresOcupados[fila][columna];
    }
     public int getDia(){
        return dia;
    }
    
    public String getMes(){
        return mes;
    }
    
    public void ocuparAsiento(int fila, int columna){
        listaAsientos[fila][columna] = new Asiento(fila, columna, this);
        lugaresOcupados[fila][columna] = true;
    }
    

    public float getCostoLata() {
        return costoLata;
    }

    public void setCostoLata(float costoLata) {
        this.costoLata = costoLata;
    }

    public float getCostoCobre() {
        return costoCobre;
    }

    public void setCostoCobre(float costoCobre) {
        this.costoCobre = costoCobre;
    }

    public float getCostoPlata() {
        return costoPlata;
    }

    public void setCostoPlata(float costoPlata) {
        this.costoPlata = costoPlata;
    }

    public float getCostoOro() {
        return costoOro;
    }

    public void setCostoOro(float costoOro) {
        this.costoOro = costoOro;
    }

    public float getCostoDiamante() {
        return costoDiamante;
    }

    public void setCostoDiamante(float costoDiamante) {
        this.costoDiamante = costoDiamante;
    }

    public Asiento[][] getListaAsientos() {
        return listaAsientos;
    }

    public int getAño() {
        return año;
    }

    public boolean[][] getLugaresOcupados() {
        return lugaresOcupados;
    }

    public int getDuracion() {
        return duracion;
    }
    public void cancelarBoleto(int fila, int columna){
        listaAsientos[fila][columna] = null;
        lugaresOcupados[fila][columna] = false;
                
    }
}
