
package Controladores;



/**
 * @author Raul
 * 
 */

import Modelo.Funcion;
import Modelo.Teatro;
import Vista.*;
import Vista.Menu;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Control_Menu implements ActionListener, WindowListener{
      /**
       * 
       */
    
    private Menu menu;
    private Teatro teatro;
    private int proceso;
    private Control_CrearFuncion control_1;
    public static boolean ventanaAbierta = false;
 
  /**
   * 
   * @param m1 objeto de tipo vista 
   * 
   */
    public Control_Menu(Menu m, Teatro t){
        this.menu=m;
        this.teatro =t;
        
        menu.getBotonCancelarBoletos().addActionListener(this);
        menu.getBotonCierreFuncion().addActionListener(this);
        menu.getBotonConsultaLugarDisponible().addActionListener(this);
        menu.getBotonCrearFuncion().addActionListener(this);
        menu.getBotonEliminarFuncion().addActionListener(this);
        menu.getBotonReporteVentas().addActionListener(this);
        menu.getBotonVentaBoletos().addActionListener(this);
        menu.getBotonSalir().addActionListener(this);
        iniciarVista();
    }
    
    /**
     * Metodo que sirve para iniciar la vista del menu
     */
     public void iniciarVista(){
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.addWindowListener(this);
        
        
    }
    
    /**
     * 
     * @param evento crea una instancia evento de tipo ActionEvent
     * Metodo que sirve para la creacion de lvas ventanas asi como la asignacion de imagenes a ella 
     */
    @Override
     public void actionPerformed(ActionEvent evento) {
        //Para la ventana de consultar
        //Para el boton salir
        if (evento.getSource() == menu.getBotonSalir()) {
            menu.dispose();

        } else {

            try {
                if (ventanaAbierta) {
                    throw new ExceptionVentanaAbierta("Ventana abierta actualmente");
                }
                ventanaAbierta = true;
                //Para el boton de crear funcion
                if (evento.getSource() == menu.getBotonCrearFuncion()) {
                    proceso = 1;
                    CrearFuncion crear_funcion = new CrearFuncion();
                    control_1 = new Control_CrearFuncion(crear_funcion, teatro);

                }

                //Para el boton venta de boletos
                if (evento.getSource() == menu.getBotonVentaBoletos()) {
                    boolean continuar = false;
                    proceso = 2;
                    //Creacion de la ventana con su respectiva imagen  
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {

                        Iterator<Funcion> it = teatro.getListaFunciones().iterator();

                        while (it.hasNext()) {
                            if (it.next().isDisponibilidad()) {
                                continuar = true;
                            }
                        }
                        if (continuar) {
                            SeleccionarObra seleccionarObra = new SeleccionarObra();
                            SF_VenderBoleto control_2 = new SF_VenderBoleto(seleccionarObra, teatro);
                        } else {
                            JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                            ventanaAbierta = false;
                        }

                    }

                }

                //Para el boton eliminar funcion
                if (evento.getSource() == menu.getBotonEliminarFuncion()) {
                    //Creacion de la ventana con su respectiva imagen  
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {

                        CancelarObra borrar_funcion = new CancelarObra();
                        Control_CancelarObra control_3 = new Control_CancelarObra(borrar_funcion, teatro);
                    }

                }

                //Para el boton de cancelar boletos
                if (evento.getSource() == menu.getBotonCancelarBoletos()) {
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {
                        SeleccionarObra cancelar_boletos = new SeleccionarObra();
                        SF_CancelarBoletos control_4 = new SF_CancelarBoletos(cancelar_boletos, teatro);
                    }

                }

//        Para el boton cierre de funcion
                if (evento.getSource() == menu.getBotonCierreFuncion()) {
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {
                        boolean continuar = false;
                        Iterator<Funcion> it = teatro.getListaFunciones().iterator();

                        while (it.hasNext()) {
                            if (it.next().isDisponibilidad()) {
                                continuar = true;
                            }
                        }
                        if (continuar) {
                            CierreFuncion cierre_funcion = new CierreFuncion();
                            Control_CierreFuncion control_5 = new Control_CierreFuncion(cierre_funcion, teatro);
                        } else {
                            JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                            ventanaAbierta = false;
                        }

                    }
                }

                //Para el boton consultar lugares disponibles
                if (evento.getSource() == menu.getBotonConsultaLugarDisponible()) {
                    //Creacion de la ventana con su respectiva imagen  
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {
                        boolean continuar = false;
                        Iterator<Funcion> it = teatro.getListaFunciones().iterator();

                        while (it.hasNext()) {
                            if (it.next().isDisponibilidad()) {
                                continuar = true;
                            }
                        }
                        if (continuar) {
                            SeleccionarObra lugaresDisponibles = new SeleccionarObra();
                            SF_AsientosDisponibles control_6 = new SF_AsientosDisponibles(lugaresDisponibles, teatro);
                        } else {
                            JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                            ventanaAbierta = false;
                        }

                    }

                }

                if (evento.getSource() == menu.getBotonReporteVentas()) {
                    if (teatro.getListaFunciones().isEmpty()) {
                        JOptionPane.showMessageDialog(menu, "No hay funciones disponibles");
                        ventanaAbierta = false;
                    } else {
                        ReporteDia reporte = new ReporteDia();
                        ReporteV reporteV = new ReporteV();
                        Control_ReporteDia contro_7 = new Control_ReporteDia(reporte, teatro, reporteV);
                    }
                }
            } catch (ExceptionVentanaAbierta e) {
                JOptionPane.showMessageDialog(menu, "Ya existe una ventana abierta, ciérrela y vuelva a intentarlo");

            }

        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
        System.exit(0);
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

    private static class ExceptionVentanaAbierta extends Exception {

        public ExceptionVentanaAbierta(String ventana_actual) {
        }
    }

}
