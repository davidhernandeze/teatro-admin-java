/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelo.Funcion;
import Modelo.Teatro;
import Vista.SeleccionarObra;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;



public abstract class Control_SeleccionarObra implements ActionListener, WindowListener{
    protected SeleccionarObra ventana;
    protected Teatro teatro;
    
    public Control_SeleccionarObra(SeleccionarObra v, Teatro t){
        teatro = t;
        ventana = v;

        Iterator<Funcion> it = t.getListaFunciones().iterator();
        ventana.getjComboBox().removeAllItems();
        while (it.hasNext()) {
            Funcion funcion = it.next();
            if (funcion.isDisponibilidad()) {
                String nombreFuncion = funcion.getNombreFuncion();
                ventana.getjComboBox().addItem(nombreFuncion);
            }
        }
       ventana.getjButton().addActionListener(this);
       ventana.setVisible(true);
       ventana.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            siguienteVentana();
    }

    public abstract void siguienteVentana();
    
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
         Control_Menu.ventanaAbierta = false;
         
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
       Control_Menu.ventanaAbierta = true;
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
