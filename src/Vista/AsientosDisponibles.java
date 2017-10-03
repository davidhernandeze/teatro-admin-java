
package Vista;

import Modelo.Funcion;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AsientosDisponibles extends JFrame {

    private PanelAsientos panelAsientos;
    private JButton aceptar;
    private Funcion funcion;
    
    public AsientosDisponibles(Funcion f) {
        funcion = f;
        iniciarComponentes();
        this.setLayout(new FlowLayout());
    }
    
    private void iniciarComponentes() {
        panelAsientos = new PanelAsientos(funcion);
        
        panelAsientos.setPreferredSize(new Dimension(924, 500));
        aceptar = new JButton();
        aceptar.setText("Aceptar");
        this.setSize(980, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.add(panelAsientos, BorderLayout.PAGE_START);
        this.add(aceptar);
        
    }
    
    public PanelAsientos getPanelAsientos() {
        return panelAsientos;
    }

    public JButton getAceptar() {
        return aceptar;
    }
    
}
