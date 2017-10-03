package Vista;

import Modelo.Funcion;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class VenderBoleto extends JFrame {

    private PanelAsientos panelAsientos;
    private JButton botonAceptar;
    private JLabel texto1, texto2, precio, asiento;
    private Funcion funcion;

    public VenderBoleto(Funcion f) {
        funcion = f;
        iniciarComponentes();
        this.setLayout(new FlowLayout());
    }

    private void iniciarComponentes() {
        panelAsientos = new PanelAsientos(funcion);
        panelAsientos.setPreferredSize(new Dimension(924, 500));
        texto1 = new JLabel("Seleccionó el asiento: ");
        texto2 = new JLabel("Precio: ");
        asiento = new JLabel("          ");
       
        precio = new JLabel("           ");
        botonAceptar = new JButton();
        botonAceptar.setText("Aceptar");
        this.setSize(980, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.add(panelAsientos, BorderLayout.PAGE_START);
        
        this.add(texto1);
        this.add(asiento);
        this.add(texto2);
        this.add(precio);
        this.add(botonAceptar);

    }

    public JLabel getPrecio() {
        return precio;
    }

    public JLabel getAsiento() {
        return asiento;
    }

    public PanelAsientos getPanelAsientos() {
        return panelAsientos;
    }

    public JButton getBotonAceptar() {
        return botonAceptar;
    }

}
