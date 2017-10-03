
package Controladores;

import Modelo.Funcion;
import Modelo.Utilidades;
import Vista.AsientosDisponibles;
import Vista.VenderBoleto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;


public class Control_VenderBoleto implements MouseListener, ActionListener, WindowListener{
    private int fila, columna;
    private VenderBoleto ventana;
    private Funcion funcion;
    
    
    public Control_VenderBoleto(VenderBoleto v, Funcion f){
        this.funcion = f;
        this.ventana = v;
        ventana.getPanelAsientos().addMouseListener(this);
        ventana.getBotonAceptar().addActionListener(this);
        ventana.setVisible(true);
        ventana.addWindowListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        float x = e.getX();
        float y = e.getY();
        float divisionX, divisionY, decimalX, decimalY;
        
        if((x>44 && y >44) && (x<924 && y<396)){ //delimita el listener a los clics que esten dentro de los recuadros
            divisionX = x/44;
            divisionY = y/44;
            int enteroX = (int) divisionX;
            int enteroY = (int) divisionY;
            decimalX = divisionX - enteroX;
            decimalY = divisionY - enteroY;
            
            if((decimalX < 0.88 && decimalX > 0.13) && (decimalY < 0.88 && decimalY > 0.13)){
                
                columna = enteroX;
                fila = enteroY;
                String letra = Utilidades.deNumeroALetra(fila);
                ventana.getAsiento().setText(letra+columna);
                float precio = Utilidades.calcularPrecio(fila, columna, funcion);
                ventana.getPrecio().setText(Float.toString(precio));
                
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fila == 0 || columna == 0) {
            JOptionPane.showMessageDialog(ventana, "No se ha seleccionado ningún lugar");
        } else {
            if (funcion.getLugaresOcupados()[fila][columna] == false) {
                funcion.ocuparAsiento(fila, columna);
                ventana.dispose();

            } else {
                JOptionPane.showMessageDialog(ventana, "El asiento ya ha sido ocupado");
            }
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
