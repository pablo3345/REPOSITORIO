/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JComboBox;
import javax.swing.JTable;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class PropietarioVistas extends javax.swing.JFrame {
    
    private Presentador presentador;

    /**
     * Creates new form PropietarioVistas
     */
    public PropietarioVistas() {
        initComponents();
        this.presentador = new Presentador(this);
        setLocationRelativeTo(this);
    }

  
    public JTable getjTable1pedido_propietario() {
        return jTable1pedido_propietario;
    }
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1salirPropietario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1pedido_propietario = new javax.swing.JTable();
        jButton1MostrarTabla_pedidosPropietario = new javax.swing.JButton();
        jButton1cantidadDeCosto = new javax.swing.JButton();
        jButton1totalPrecioDeCosto_propietario = new javax.swing.JButton();
        jButton1gananciaTotal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(787, 570));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 110, 110);

        jButton1salirPropietario.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salirPropietario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salirPropietario.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salirPropietario.setText("Salir");
        jButton1salirPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirPropietarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salirPropietario);
        jButton1salirPropietario.setBounds(670, 480, 80, 40);

        jTable1pedido_propietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "cliente", "mesa", "comestible", "fecha del pedido", "cantidad", "precio de costo", "precio final"
            }
        ));
        jScrollPane1.setViewportView(jTable1pedido_propietario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 730, 240);

        jButton1MostrarTabla_pedidosPropietario.setBackground(new java.awt.Color(0, 0, 0));
        jButton1MostrarTabla_pedidosPropietario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1MostrarTabla_pedidosPropietario.setForeground(new java.awt.Color(255, 255, 255));
        jButton1MostrarTabla_pedidosPropietario.setText("Mostrar Tabla Pedidos");
        jButton1MostrarTabla_pedidosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarTabla_pedidosPropietarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1MostrarTabla_pedidosPropietario);
        jButton1MostrarTabla_pedidosPropietario.setBounds(20, 480, 200, 40);

        jButton1cantidadDeCosto.setBackground(new java.awt.Color(0, 0, 0));
        jButton1cantidadDeCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1cantidadDeCosto.setForeground(new java.awt.Color(255, 255, 255));
        jButton1cantidadDeCosto.setText("Total de ventas al precio final");
        jButton1cantidadDeCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1cantidadDeCostoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1cantidadDeCosto);
        jButton1cantidadDeCosto.setBounds(230, 30, 380, 40);

        jButton1totalPrecioDeCosto_propietario.setBackground(new java.awt.Color(0, 0, 0));
        jButton1totalPrecioDeCosto_propietario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1totalPrecioDeCosto_propietario.setForeground(new java.awt.Color(255, 255, 255));
        jButton1totalPrecioDeCosto_propietario.setText("Total de ventas al precio de costo");
        jButton1totalPrecioDeCosto_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1totalPrecioDeCosto_propietarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1totalPrecioDeCosto_propietario);
        jButton1totalPrecioDeCosto_propietario.setBounds(230, 80, 380, 40);

        jButton1gananciaTotal.setBackground(new java.awt.Color(0, 0, 0));
        jButton1gananciaTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1gananciaTotal.setForeground(new java.awt.Color(255, 255, 255));
        jButton1gananciaTotal.setText("Ganancias totales entre el costo y el precio final");
        jButton1gananciaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1gananciaTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1gananciaTotal);
        jButton1gananciaTotal.setBounds(230, 130, 380, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo negro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1salirPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirPropietarioActionPerformed
      dispose();
    }//GEN-LAST:event_jButton1salirPropietarioActionPerformed

    private void jButton1MostrarTabla_pedidosPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarTabla_pedidosPropietarioActionPerformed
       this.presentador.mostrarTablaPropietario_apretado();
    }//GEN-LAST:event_jButton1MostrarTabla_pedidosPropietarioActionPerformed

    private void jButton1cantidadDeCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1cantidadDeCostoActionPerformed
       this.presentador.calcularCostoApretadoPropietario();
    }//GEN-LAST:event_jButton1cantidadDeCostoActionPerformed

    private void jButton1totalPrecioDeCosto_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1totalPrecioDeCosto_propietarioActionPerformed
       this.presentador.totalPrecioDeCostoApretado();
    }//GEN-LAST:event_jButton1totalPrecioDeCosto_propietarioActionPerformed

    private void jButton1gananciaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1gananciaTotalActionPerformed
       this.presentador.gananciaTotalApretado();
    }//GEN-LAST:event_jButton1gananciaTotalActionPerformed

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
            java.util.logging.Logger.getLogger(PropietarioVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropietarioVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropietarioVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropietarioVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropietarioVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1MostrarTabla_pedidosPropietario;
    private javax.swing.JButton jButton1cantidadDeCosto;
    private javax.swing.JButton jButton1gananciaTotal;
    private javax.swing.JButton jButton1salirPropietario;
    private javax.swing.JButton jButton1totalPrecioDeCosto_propietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1pedido_propietario;
    // End of variables declaration//GEN-END:variables
}