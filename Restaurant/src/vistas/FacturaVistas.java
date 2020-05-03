/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class FacturaVistas extends javax.swing.JFrame {
    
    private Presentador presentador;

    /**
     * Creates new form FacturaVistas
     */
    public FacturaVistas() {
        initComponents();
        setLocationRelativeTo(this);
        this.presentador = new Presentador(this);
        
       // this.presentador.llenarComboMesasOcupadas_Factura();
        
       
    }

    

    public JTextField getjTextField2total_factura() {
        return jTextField2total_factura;
    }
    
    

    

   

 

   

    public JTable getjTable1pedido_factura() {
        return jTable1pedido_factura;
    }

    public JComboBox<Object> getjComboBox1mesasOcupadasFactura() {
        return jComboBox1mesasOcupadasFactura;
    }

    public JTextField getjTextField1costoAgregado() {
        return jTextField1costoAgregado;
    }
    
    
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1salir = new javax.swing.JButton();
        jTextField2total_factura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1pedido_factura = new javax.swing.JTable();
        jComboBox1mesasOcupadasFactura = new javax.swing.JComboBox<>();
        jButton1botonAgregarPedidosFactura = new javax.swing.JButton();
        jButton1guardarFactura = new javax.swing.JButton();
        jButton1VerFactura = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1LimpiarFacturaApretado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1costoAgregado = new javax.swing.JTextField();
        jButton1LLenarComboMesasOcupadas_factura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(778, 570));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FACTURA.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 110, 100);

        jButton1salir.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salir.setText("Salir");
        jButton1salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salir);
        jButton1salir.setBounds(660, 450, 90, 40);
        getContentPane().add(jTextField2total_factura);
        jTextField2total_factura.setBounds(30, 120, 80, 10);

        jTable1pedido_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "cliente", "mesa", "comestible", "fecha", "cantidad", "precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1pedido_factura);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 730, 240);

        getContentPane().add(jComboBox1mesasOcupadasFactura);
        jComboBox1mesasOcupadasFactura.setBounds(330, 20, 160, 30);

        jButton1botonAgregarPedidosFactura.setBackground(new java.awt.Color(0, 0, 0));
        jButton1botonAgregarPedidosFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1botonAgregarPedidosFactura.setForeground(new java.awt.Color(255, 255, 255));
        jButton1botonAgregarPedidosFactura.setText("agregar Pedidos");
        jButton1botonAgregarPedidosFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1botonAgregarPedidosFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1botonAgregarPedidosFactura);
        jButton1botonAgregarPedidosFactura.setBounds(530, 60, 140, 40);

        jButton1guardarFactura.setBackground(new java.awt.Color(0, 0, 0));
        jButton1guardarFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1guardarFactura.setForeground(new java.awt.Color(255, 255, 255));
        jButton1guardarFactura.setText("Guardar Factura");
        jButton1guardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1guardarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1guardarFactura);
        jButton1guardarFactura.setBounds(40, 450, 160, 40);

        jButton1VerFactura.setBackground(new java.awt.Color(0, 0, 0));
        jButton1VerFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1VerFactura.setForeground(new java.awt.Color(255, 255, 255));
        jButton1VerFactura.setText("Ver Factura");
        jButton1VerFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VerFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1VerFactura);
        jButton1VerFactura.setBounds(260, 450, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Costo agregado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 70, 140, 30);

        jButton1LimpiarFacturaApretado.setBackground(new java.awt.Color(0, 0, 0));
        jButton1LimpiarFacturaApretado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1LimpiarFacturaApretado.setForeground(new java.awt.Color(255, 255, 255));
        jButton1LimpiarFacturaApretado.setText("Limpiar Factura");
        jButton1LimpiarFacturaApretado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LimpiarFacturaApretadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1LimpiarFacturaApretado);
        jButton1LimpiarFacturaApretado.setBounds(460, 450, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mesas ocupadas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 20, 140, 30);
        getContentPane().add(jTextField1costoAgregado);
        jTextField1costoAgregado.setBounds(330, 70, 160, 30);

        jButton1LLenarComboMesasOcupadas_factura.setBackground(new java.awt.Color(0, 0, 0));
        jButton1LLenarComboMesasOcupadas_factura.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1LLenarComboMesasOcupadas_factura.setForeground(new java.awt.Color(255, 255, 255));
        jButton1LLenarComboMesasOcupadas_factura.setText("actualizar");
        jButton1LLenarComboMesasOcupadas_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LLenarComboMesasOcupadas_facturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1LLenarComboMesasOcupadas_factura);
        jButton1LLenarComboMesasOcupadas_factura.setBounds(530, 20, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo negro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 776, 536);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1salirActionPerformed

    private void jButton1botonAgregarPedidosFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1botonAgregarPedidosFacturaActionPerformed
      this.presentador.agregarPedidosDeMesaOcupadas();
    }//GEN-LAST:event_jButton1botonAgregarPedidosFacturaActionPerformed

    private void jButton1guardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1guardarFacturaActionPerformed
       this.presentador.guardarFacturaApretado();
    }//GEN-LAST:event_jButton1guardarFacturaActionPerformed

    private void jButton1VerFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1VerFacturaActionPerformed
       this.presentador.verFacturaApretado();
    }//GEN-LAST:event_jButton1VerFacturaActionPerformed

    private void jButton1LimpiarFacturaApretadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LimpiarFacturaApretadoActionPerformed
      this.presentador.limpiarFacturaApretado();
    }//GEN-LAST:event_jButton1LimpiarFacturaApretadoActionPerformed

    private void jButton1LLenarComboMesasOcupadas_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LLenarComboMesasOcupadas_facturaActionPerformed
        this.presentador.ComboMesasOcupadas_Factura();
    }//GEN-LAST:event_jButton1LLenarComboMesasOcupadas_facturaActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1LLenarComboMesasOcupadas_factura;
    private javax.swing.JButton jButton1LimpiarFacturaApretado;
    private javax.swing.JButton jButton1VerFactura;
    private javax.swing.JButton jButton1botonAgregarPedidosFactura;
    private javax.swing.JButton jButton1guardarFactura;
    private javax.swing.JButton jButton1salir;
    private javax.swing.JComboBox<Object> jComboBox1mesasOcupadasFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1pedido_factura;
    private javax.swing.JTextField jTextField1costoAgregado;
    private javax.swing.JTextField jTextField2total_factura;
    // End of variables declaration//GEN-END:variables
}
