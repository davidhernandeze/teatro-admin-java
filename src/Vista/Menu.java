/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author JoseRaul
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       
        //Imagen
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagenes/ImagenMenu.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
        this.setLocationRelativeTo(null);
      
        //sin centrar
//        ((JPanel) getContentPane()).setOpaque(false);
//        ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Menu.jpg"));
//        JLabel fondo = new JLabel();
//        fondo.setIcon(imagen);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        
    }

    public JButton getBotonCancelarBoletos() {
        return BotonCancelarBoletos;
    }

    public JButton getBotonCierreFuncion() {
        return BotonCierreFuncion;
    }

    public JButton getBotonConsultaLugarDisponible() {
        return BotonConsultaLugarDisponible;
    }

    public JButton getBotonCrearFuncion() {
        return BotonCrearFuncion;
    }

    public JButton getBotonEliminarFuncion() {
        return BotonEliminarFuncion;
    }

    public JButton getBotonReporteVentas() {
        return BotonReporteVentas;
    }

    public JButton getBotonSalir() {
        return BotonSalir;
    }

    public JButton getBotonVentaBoletos() {
        return BotonVentaBoletos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCrearFuncion = new javax.swing.JButton();
        BotonConsultaLugarDisponible = new javax.swing.JButton();
        BotonEliminarFuncion = new javax.swing.JButton();
        BotonVentaBoletos = new javax.swing.JButton();
        BotonCancelarBoletos = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonCierreFuncion = new javax.swing.JButton();
        BotonReporteVentas = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu ");
        setResizable(false);

        BotonCrearFuncion.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonCrearFuncion.setText("Crear Funcion");
        BotonCrearFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearFuncionActionPerformed(evt);
            }
        });

        BotonConsultaLugarDisponible.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonConsultaLugarDisponible.setText("Consultar Lugares Disponibles");
        BotonConsultaLugarDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultaLugarDisponibleActionPerformed(evt);
            }
        });

        BotonEliminarFuncion.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonEliminarFuncion.setText("Eliminar Funcion");
        BotonEliminarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarFuncionActionPerformed(evt);
            }
        });

        BotonVentaBoletos.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonVentaBoletos.setText("Venta de Boletos");
        BotonVentaBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentaBoletosActionPerformed(evt);
            }
        });

        BotonCancelarBoletos.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonCancelarBoletos.setText("Cancelar Boletos");
        BotonCancelarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarBoletosActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonCierreFuncion.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonCierreFuncion.setText("Cierre De Funciones");
        BotonCierreFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCierreFuncionActionPerformed(evt);
            }
        });

        BotonReporteVentas.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        BotonReporteVentas.setText("Reporte de Ventas");

        LabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Teatro Patito Feo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonCrearFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(BotonVentaBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(BotonReporteVentas)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEliminarFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(BotonCierreFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonConsultaLugarDisponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonCancelarBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTitulo)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCrearFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVentaBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCancelarBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEliminarFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCierreFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonConsultaLugarDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearFuncionActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BotonCrearFuncionActionPerformed

    private void BotonConsultaLugarDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultaLugarDisponibleActionPerformed
     
       
    }//GEN-LAST:event_BotonConsultaLugarDisponibleActionPerformed

    private void BotonEliminarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarFuncionActionPerformed
        

        
    }//GEN-LAST:event_BotonEliminarFuncionActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
    
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonCancelarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarBoletosActionPerformed
       
        
    }//GEN-LAST:event_BotonCancelarBoletosActionPerformed

    private void BotonVentaBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaBoletosActionPerformed
     
    }//GEN-LAST:event_BotonVentaBoletosActionPerformed

    private void BotonCierreFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCierreFuncionActionPerformed
     
    }//GEN-LAST:event_BotonCierreFuncionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelarBoletos;
    private javax.swing.JButton BotonCierreFuncion;
    private javax.swing.JButton BotonConsultaLugarDisponible;
    private javax.swing.JButton BotonCrearFuncion;
    private javax.swing.JButton BotonEliminarFuncion;
    private javax.swing.JButton BotonReporteVentas;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVentaBoletos;
    private javax.swing.JLabel LabelTitulo;
    // End of variables declaration//GEN-END:variables
}