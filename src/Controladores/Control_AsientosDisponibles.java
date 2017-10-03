package Controladores;

import Modelo.Funcion;
import Vista.AsientosDisponibles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;


public class Control_AsientosDisponibles implements ActionListener, WindowListener{
    private Funcion funcion;
    private AsientosDisponibles ventana;
   
    
    public Control_AsientosDisponibles(AsientosDisponibles v, Funcion f){
        this.funcion = f;   
        this.ventana = v;     
        ventana.setVisible(true);
        ventana.getAceptar().addActionListener(this);
        ventana.addWindowListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
