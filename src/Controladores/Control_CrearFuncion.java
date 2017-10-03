
package Controladores;

import Modelo.*;
import Pruebas.Main;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


    
    public class Control_CrearFuncion implements ActionListener, WindowListener {
    
    CrearFuncion cf;
    Teatro t;
    boolean activo = true;
    
    
    
    public Control_CrearFuncion(CrearFuncion cf, Teatro t){
        this.cf = cf;
        this.t = t;
       
        cf.getCrearFuncion().addActionListener(this);
        cf.setVisible(true);
        cf.addWindowListener(this);
        
    }
    
    public void iniciarVisita(){
         cf.setLocationRelativeTo(null);
         cf.setTitle("Examen");
     }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        Object er = e.getSource();
        DecimalFormat decimales = new DecimalFormat("0.00");
        
        try{
            if(er == cf.getCrearFuncion()){
                String nombreF = cf.getNomFuncion().getText();
                
                String pLata = cf.getpAreaLata().getText();
                float precioLata = Float.parseFloat(pLata);
                precioLata = decimales.parse(decimales.format(precioLata)).floatValue();
                if(precioLata < 0)throw new ExceptionMenorQue0("menor que 0");
                
                String pCobre = cf.getpAreaCobre().getText();
                float precioCobre = Float.parseFloat(pCobre);
                precioCobre = decimales.parse(decimales.format(precioCobre)).floatValue();
                if(precioCobre < 0)throw new ExceptionMenorQue0("menor que 0");
                
                String pPlata = cf.getpAreaPlata().getText();
                float precioPlata = Float.parseFloat(pPlata);
                precioPlata = decimales.parse(decimales.format(precioPlata)).floatValue();
                if(precioPlata < 0)throw new ExceptionMenorQue0("menor que 0");
                
                String pOro = cf.getpAreaOro().getText();
                float precioOro = Float.parseFloat(pOro);
                precioOro = decimales.parse(decimales.format(precioOro)).floatValue();
                if(precioOro < 0)throw new ExceptionMenorQue0("menor que 0");
                
                String pDiamante = cf.getpAreaDiamante().getText();
                float precioDiamante = Float.parseFloat(pDiamante);
                precioDiamante = decimales.parse(decimales.format(precioDiamante)).floatValue();
                if(precioDiamante < 0)throw new ExceptionMenorQue0("menor que 0");
                
                 Calendar fecha;
                fecha = (cf.getCalendario1()).getCalendar();
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int año = fecha.get(Calendar.YEAR);
                int mesp = fecha.get(Calendar.MONTH);

                int duracion = (int) cf.getDuracion().getValue();

                String mes;

                switch(mesp){
                    case 1:
                        mes = "Enero";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 2:
                        mes = "Febrero";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 3:
                        mes="Marzo";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 4:
                        mes ="Abril";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 5:
                        mes = "Mayo";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 6:
                        mes = "Junio";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 7:
                        mes = "Julio";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 8:
                        mes = "Agosto";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 9:
                        mes = "Septiembre";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 10:
                        mes = "Octubre";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 11:
                        mes = "Noviembre";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;
                    case 12:
                        mes = "Diciembre";
                        t.crearFuncion(nombreF, dia, mes, año, duracion, precioLata, precioCobre, precioPlata, precioOro, precioDiamante);
                        cf.dispose();
                        break;

                }
            }
        }
        
        catch(ExceptionMenorQue0 ex){
           JOptionPane.showMessageDialog(cf, "No se pueden poner precios negativos");
       }
        catch(Exception ex){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Error en la entrada de datos");
        }
        
        
        activo = false;
    }
    
    public boolean isActivo(){
        return activo;
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

    private static class ExceptionMenorQue0 extends Exception {

        public ExceptionMenorQue0(String mensaje) {
            super(mensaje);
        }
    }
    
    
}

