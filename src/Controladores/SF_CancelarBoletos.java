/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelo.Teatro;
import Vista.CancelarBoletos;
import Vista.SeleccionarObra;
import Vista.VenderBoleto;

public class SF_CancelarBoletos extends Control_SeleccionarObra{

    public SF_CancelarBoletos(SeleccionarObra v, Teatro t) {
        super(v, t);
    }

    @Override
    public void siguienteVentana() {
         int seleccion = ventana.getjComboBox().getSelectedIndex();
        CancelarBoletos ventana1 = new CancelarBoletos();
        Control_CancelarBoleto control = new Control_CancelarBoleto(ventana1, teatro.getListaFunciones().get(seleccion));
        ventana.dispose();
    }
    
}
