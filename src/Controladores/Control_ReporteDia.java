
package Controladores;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;


public class Control_ReporteDia implements ActionListener, WindowListener{
    
    Teatro t;
    ReporteDia v;
    ReporteV rv;
    boolean activo = true;
    
    
    public Control_ReporteDia(ReporteDia v, Teatro t, ReporteV rv){
        this.t = t;
        this.v = v;
        this.rv = rv;
        v.addWindowListener(this);
        rv.addWindowListener(this);
        v.getReporte().addActionListener(this);
        v.setVisible(true);
        Iterator<Funcion> it = t.getListaFunciones().iterator();
        v.getFunciones().removeAllItems();
        while(it.hasNext()){
           
            String nombreFuncion = it.next().getNombreFuncion();
            v.getFunciones().addItem(nombreFuncion);
            
        }
         float totalDia = 0;
             Iterator<Funcion> totalFunciones = t.getListaFunciones().iterator();
             while(totalFunciones.hasNext()){
                 totalDia = totalDia + calcularTotal(totalFunciones.next());
             }
             
             v.getTotal().setText(Float.toString(totalDia));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object er = e.getSource();
        
        if(er == v.getReporte()){
            
            
            
            int posicion = v.getFunciones().getSelectedIndex();
            String nombre = t.obtenerFuncion(posicion).getNombreFuncion();
            float cobre = t.obtenerFuncion(posicion).getCostoCobre();
            float lata = t.obtenerFuncion(posicion).getCostoLata();
            float plata = t.obtenerFuncion(posicion).getCostoPlata();
            float oro = t.obtenerFuncion(posicion).getCostoOro();
            float diamante = t.obtenerFuncion(posicion).getCostoDiamante();
            int duracion = t.obtenerFuncion(posicion).getDuracion();
            
            
            rv.getNombre().setText(nombre);
            
            rv.getDuracion().setText(Integer.toString(duracion));
            rv.getPrecioLata().setText(Float.toString(lata));
            rv.getPrecioCobre().setText(Float.toString(cobre));
            rv.getPrecioPlata().setText(Float.toString(plata));
            rv.getPrecioOro().setText(Float.toString(oro));
            rv.getNumAsientos().setText(Float.toString(diamante));
            
            
            int contPlata=0;
            for(int i=1; i<3;i++){
                for(int j=1; j<7;j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contPlata = contPlata +1;
                    }
                }
            }
            
            for(int i=1; i<3;i++){
                for(int j=15; j<21; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contPlata = contPlata +1;
                    }
                }
            }
            
            int contLata =0;
            for(int i=3; i<9; i++ ){
                for(int j=1; j<7; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contLata = contLata +1;
                    }
                }
            }
            
            for(int i=3; i<9; i++){
                for(int j=15; j<21; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contLata = contLata + 1;
                    }
                }
            }
            
            int contCobre=0;
            for(int i=6; i<9; i++ ){
                for(int j=7; j<15; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contCobre = contCobre + 1;
                    }
                }
            }
            
            int contOro=0;
            for(int i=1; i<3; i++){
                for(int j=7; j<15; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contOro = contOro + 1;
                    }
                }
            }
            
            int contDiamt=0;
            for(int i=3; i<6; i++){
                for(int j=7; j<15; j++){
                    if(t.obtenerFuncion(posicion).verificarLugar(i, j)){
                        contDiamt = contDiamt + 1;
                    }
                }
            }
            
            rv.getNumLata().setText(Integer.toString(contLata));
            rv.getNumCobre().setText(Integer.toString(contCobre));
            rv.getNumPlata().setText(Integer.toString(contPlata));
            rv.getNumOro().setText(Integer.toString(contOro));
            rv.getDiamante().setText(Integer.toString(contDiamt));
            
            
            rv.getTotalLata().setText(Float.toString(lata*contLata));
            rv.getTotalCobre().setText(Float.toString(contCobre*cobre));
            rv.getTotalPlata().setText(Float.toString(contPlata*plata));
            rv.getTotalOro().setText(Float.toString(contOro*oro));
            rv.getTotalDiamante().setText(Float.toString(contDiamt*diamante));
            
            float total = (contLata*lata) + (contCobre*cobre) + (contPlata*plata) + (contOro*oro) + (contDiamt*diamante);
            rv.getTotal().setText(Float.toString(total));
            rv.setTitle(t.obtenerFuncion(posicion).getNombreFuncion());
            rv.setVisible(true);
            
        }
         
         
         
         
         activo = false;
         v.dispose();
    }

    public boolean isActivo() {
        return activo;
    }
    
    public float calcularTotal(Funcion f){
        float total=0;
        for(int i=1; i<9; i++){
            for(int j=1; j<21; j++){
                if(f.verificarLugar(i, j)){
                    total = total + Utilidades.calcularPrecio(i, j, f);
                }
            }
        }
        return total;
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
