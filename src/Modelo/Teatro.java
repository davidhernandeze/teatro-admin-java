package Modelo;


import Modelo.Funcion;
import java.util.ArrayList;


public class Teatro {
    
    private ArrayList<Funcion> listaFunciones;
    private String nombreTeatro;
    
    
    public Teatro(String nombre){
        listaFunciones = new ArrayList<Funcion>();
        nombreTeatro = nombre;
    }
    
    
    public void agregarFuncion(Funcion f){
        listaFunciones.add(f);
    }
    
    public String getNombreTeatro(){
        return nombreTeatro;
    }

    public ArrayList<Funcion> getListaFunciones() {
        return listaFunciones;
    }
    public Funcion obtenerFuncion(int i){
        return listaFunciones.get(i);
    }
    
    public void crearFuncion(String nombFun, int dia, String mes, int año, int duracion, float precioLata, float precioCobre, float precioPlata, float precioOro, float precioDiamante){
        Funcion fun = new Funcion(nombFun, dia, mes, año, duracion);
        fun.setCostoCobre(precioCobre);
        fun.setCostoLata(precioLata);
        fun.setCostoPlata(precioPlata);
        fun.setCostoOro(precioOro);
        fun.setCostoDiamante(precioDiamante);
        
        agregarFuncion(fun);
    }
}
