/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelo.Funcion;
import Modelo.Teatro;
import Vista.AsientosDisponibles;
import Vista.CancelarBoletos;
import Vista.SeleccionarObra;

public class SF_AsientosDisponibles extends Control_SeleccionarObra{

    public SF_AsientosDisponibles(SeleccionarObra v, Teatro t) {
        super(v, t);
    }

    

    @Override
    public void siguienteVentana() {
        Funcion funcion = null;
        int c = 0;
           while(c<teatro.getListaFunciones().size()){
               if(teatro.obtenerFuncion(c).getNombreFuncion().equals(ventana.getjComboBox().getSelectedItem().toString())){
                   funcion = teatro.obtenerFuncion(c);
               }
               c++;
           } 
        
        AsientosDisponibles ventana1 = new AsientosDisponibles(funcion);
        Control_AsientosDisponibles control = new Control_AsientosDisponibles(ventana1, funcion);
        ventana.dispose();
    }
    
}