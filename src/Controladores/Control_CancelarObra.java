/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelo.Funcion;
import Modelo.Teatro;
import Vista.CancelarObra;
import Vista.SeleccionarObra;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;



public class Control_CancelarObra implements ActionListener, WindowListener{
    protected CancelarObra ventana;
    protected Teatro teatro;
    
    public Control_CancelarObra(CancelarObra v, Teatro t){
        teatro = t;
        ventana = v;

        Iterator<Funcion> it = t.getListaFunciones().iterator();
        ventana.getjComboBox().removeAllItems();
        while(it.hasNext()){
            String nombreFuncion = it.next().getNombreFuncion();
            ventana.getjComboBox().addItem(nombreFuncion);
        }
       ventana.getjButton().addActionListener(this);
       ventana.setVisible(true);
       ventana.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           int seleccion = ventana.getjComboBox().getSelectedIndex();
           teatro.getListaFunciones().remove(seleccion);
           ventana.dispose();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
         Control_Menu.ventanaAbierta = false;
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
       Control_Menu.ventanaAbierta = false;
        
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

    
