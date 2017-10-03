
package Controladores;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Control_CierreFuncion implements ActionListener, WindowListener {
    
    Teatro t;
    CierreFuncion v;
    boolean activo = true;
    
    public Control_CierreFuncion(CierreFuncion v, Teatro t){
        this.v = v;
        this.t = t;
        
        v.getCerrarFuncion().addActionListener(this);
        v.setTitle("Cierre Funcion");
        
        Iterator<Funcion> it = t.getListaFunciones().iterator();
        v.getFunciones().removeAllItems();
        while(it.hasNext()){
            Funcion funcion = it.next();
            if (funcion.isDisponibilidad()) {
                String nombreFuncion = funcion.getNombreFuncion();
                v.getFunciones().addItem(nombreFuncion);
            }
        }
        v.setVisible(true);
        v.addWindowListener(this);
        v.addWindowListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object er = e.getSource();
       Funcion funcion = null;
       
       if(er == v.getCerrarFuncion()){
           
           int posicion = v.getFunciones().getSelectedIndex();
           
           int c = 0;
           while(c<t.getListaFunciones().size()){
               if(t.obtenerFuncion(c).getNombreFuncion().equals(v.getFunciones().getSelectedItem().toString())){
                   funcion = t.obtenerFuncion(c);
               }
               c++;
           }
          funcion.setDisponibilidad(false);
           
           
           JFrame frame = new JFrame();
           JOptionPane.showMessageDialog(frame,"La funcion "+funcion.getNombreFuncion()+" se ha cerrado");
           activo = false;
           v.dispose();
           
       }
      
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
