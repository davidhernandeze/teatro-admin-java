package Vista;

import Modelo.Funcion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

    
    
    public class PanelAsientos extends JPanel {
 
        private Funcion funcion;
        public PanelAsientos(Funcion f){
            this.funcion = f;
        }
        
    private Image imagen;
 
    //...
 
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Asientos.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        int cFila= 1; 
        while(cFila < 9){
            int cColumna = 1;
            while(cColumna <21){
                if(funcion.getLugaresOcupados()[cFila][cColumna]){
                    int x, y;
                    x = 44*cFila+6;
                    y = 44*cColumna+6;
                    g.setColor(Color.red);
                    g.fillOval(y, x, 32, 32);
                }
                cColumna++;
            }
            cFila++;
        }
        
        setOpaque(false);
        super.paint(g);
    }
 
    //...
}



