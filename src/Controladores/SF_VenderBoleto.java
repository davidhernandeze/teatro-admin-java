/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelo.Funcion;
import Modelo.Teatro;
import Vista.SeleccionarObra;
import Vista.VenderBoleto;


public class SF_VenderBoleto extends Control_SeleccionarObra{

    public SF_VenderBoleto(SeleccionarObra v, Teatro t) {
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
        
        
        
        
        
        VenderBoleto ventana1 = new VenderBoleto(funcion);
        Control_VenderBoleto control = new Control_VenderBoleto(ventana1, funcion);
        ventana.dispose();
    }
    
}
