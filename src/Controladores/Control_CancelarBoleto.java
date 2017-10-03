
package Controladores;

import Modelo.Funcion;
import Vista.CancelarBoletos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;


public class Control_CancelarBoleto implements ActionListener, WindowListener{
    private CancelarBoletos ventana;
    private Funcion funcion;
    private int fila, columna;

    public Control_CancelarBoleto(CancelarBoletos v, Funcion f){
        ventana = v;
        funcion = f;
        ventana.getBoton().addActionListener(this);
        ventana.addWindowListener(this);
        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        fila = ventana.getjComboBoxFila().getSelectedIndex()+1;
        columna = ventana.getjComboBoxColumna().getSelectedIndex()+1;
        if(funcion.getLugaresOcupados()[fila][columna]){
            funcion.cancelarBoleto(fila, columna);
            
            JOptionPane.showMessageDialog(ventana, "El boleto ha sido cancelado con éxito");
            ventana.dispose();
        }else{
            JOptionPane.showMessageDialog(ventana, "El lugar que seleccionó no ha sido comprado");
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
