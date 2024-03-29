/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class PlatoVistas extends javax.swing.JFrame {
    
    private Presentador presentador;

    /**
     * Creates new form PlatoVistas
     */
    public PlatoVistas() {
        initComponents();
        setLocationRelativeTo(this);
        this.presentador = new Presentador(this);
    }

    public JTextField getjTextField1precioAlPublico_plato() {
        return jTextField1precioAlPublico_plato;
    }

    public JTextField getjTextField2nombre_plato() {
        return jTextField2nombre_plato;
    }

    public JTextField getjTextField3costoDelPlato_plato() {
        return jTextField3costoDelPlato_plato;
    }

    public JTextArea getjTextArea1ingredientes_plato() {
        return jTextArea1ingredientes_plato;
    }

    public JRadioButton getjRadioButton1calientes_plato() {
        return jRadioButton1calientes_plato;
    }

    public JRadioButton getjRadioButton2fria_plato() {
        return jRadioButton2fria_plato;
    }

    public JRadioButton getjRadioButton3ensaladas_plato() {
        return jRadioButton3ensaladas_plato;
    }

    public JRadioButton getjRadioButton4postres_plato() {
        return jRadioButton4postres_plato;
    }

    public JRadioButton getjRadioButton5bebidas_plato() {
        return jRadioButton5bebidas_plato;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JTable getjTable1comidasYbebidas_plato() {
        return jTable1comidasYbebidas_plato;
    }

    public JComboBox<Object> getjComboBox1tipo_plato() {
        return jComboBox1tipo_plato;
    }

   
    
    
    
    
    
    
    
    

   
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jTextField1precioAlPublico_plato = new javax.swing.JTextField();
        jTextField2nombre_plato = new javax.swing.JTextField();
        jTextField3costoDelPlato_plato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1ingredientes_plato = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton1salirPlato = new javax.swing.JButton();
        jButton1guardarPlato1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1calientes_plato = new javax.swing.JRadioButton();
        jRadioButton2fria_plato = new javax.swing.JRadioButton();
        jRadioButton3ensaladas_plato = new javax.swing.JRadioButton();
        jRadioButton4postres_plato = new javax.swing.JRadioButton();
        jRadioButton5bebidas_plato = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1comidasYbebidas_plato = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1buscarPorTipo_plato = new javax.swing.JButton();
        jComboBox1tipo_plato = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(768, 578));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio al Publico:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 100, 120, 30);
        getContentPane().add(jTextField1precioAlPublico_plato);
        jTextField1precioAlPublico_plato.setBounds(190, 100, 190, 30);
        getContentPane().add(jTextField2nombre_plato);
        jTextField2nombre_plato.setBounds(190, 20, 190, 30);
        getContentPane().add(jTextField3costoDelPlato_plato);
        jTextField3costoDelPlato_plato.setBounds(190, 60, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo del Plato:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 20, 70, 20);

        jTextArea1ingredientes_plato.setColumns(20);
        jTextArea1ingredientes_plato.setRows(5);
        jScrollPane1.setViewportView(jTextArea1ingredientes_plato);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 140, 190, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PLATO.2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 10, 150, 140);

        jButton1salirPlato.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salirPlato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salirPlato.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salirPlato.setText("Salir");
        jButton1salirPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirPlatoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salirPlato);
        jButton1salirPlato.setBounds(440, 90, 80, 40);

        jButton1guardarPlato1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1guardarPlato1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1guardarPlato1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1guardarPlato1.setText("Guardar");
        jButton1guardarPlato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1guardarPlato1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1guardarPlato1);
        jButton1guardarPlato1.setBounds(420, 20, 120, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingredientes:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 160, 100, 20);

        jRadioButton1calientes_plato.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1calientes_plato);
        jRadioButton1calientes_plato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1calientes_plato.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1calientes_plato.setText("caliente");
        getContentPane().add(jRadioButton1calientes_plato);
        jRadioButton1calientes_plato.setBounds(150, 220, 80, 25);

        jRadioButton2fria_plato.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2fria_plato);
        jRadioButton2fria_plato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2fria_plato.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2fria_plato.setText("fria");
        getContentPane().add(jRadioButton2fria_plato);
        jRadioButton2fria_plato.setBounds(240, 220, 60, 25);

        jRadioButton3ensaladas_plato.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3ensaladas_plato);
        jRadioButton3ensaladas_plato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3ensaladas_plato.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3ensaladas_plato.setText("ensaladas");
        getContentPane().add(jRadioButton3ensaladas_plato);
        jRadioButton3ensaladas_plato.setBounds(310, 220, 100, 25);

        jRadioButton4postres_plato.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4postres_plato);
        jRadioButton4postres_plato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4postres_plato.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4postres_plato.setText("postres");
        getContentPane().add(jRadioButton4postres_plato);
        jRadioButton4postres_plato.setBounds(410, 220, 80, 25);

        jRadioButton5bebidas_plato.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton5bebidas_plato);
        jRadioButton5bebidas_plato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5bebidas_plato.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5bebidas_plato.setText("bebidas");
        getContentPane().add(jRadioButton5bebidas_plato);
        jRadioButton5bebidas_plato.setBounds(500, 220, 80, 23);

        jTable1comidasYbebidas_plato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id ", "nombre", "costo", "precio al publico", "tipo", "ingredientes"
            }
        ));
        jScrollPane2.setViewportView(jTable1comidasYbebidas_plato);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 720, 170);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 220, 50, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 310, 50, 20);

        jButton1buscarPorTipo_plato.setBackground(new java.awt.Color(0, 0, 0));
        jButton1buscarPorTipo_plato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1buscarPorTipo_plato.setForeground(new java.awt.Color(255, 255, 255));
        jButton1buscarPorTipo_plato.setText("Buscar por tipo");
        jButton1buscarPorTipo_plato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1buscarPorTipo_platoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1buscarPorTipo_plato);
        jButton1buscarPorTipo_plato.setBounds(300, 300, 150, 40);

        getContentPane().add(jComboBox1tipo_plato);
        jComboBox1tipo_plato.setBounds(130, 310, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo negro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1guardarPlato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1guardarPlato1ActionPerformed
        this.presentador.guardarComidasYbebidasApretado();
    }//GEN-LAST:event_jButton1guardarPlato1ActionPerformed

    private void jButton1salirPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirPlatoActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1salirPlatoActionPerformed

    private void jButton1buscarPorTipo_platoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1buscarPorTipo_platoActionPerformed
       this.presentador.buscarPorTipoApretado();
    }//GEN-LAST:event_jButton1buscarPorTipo_platoActionPerformed

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
            java.util.logging.Logger.getLogger(PlatoVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlatoVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlatoVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlatoVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatoVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1buscarPorTipo_plato;
    private javax.swing.JButton jButton1guardarPlato1;
    private javax.swing.JButton jButton1salirPlato;
    private javax.swing.JComboBox<Object> jComboBox1tipo_plato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1calientes_plato;
    private javax.swing.JRadioButton jRadioButton2fria_plato;
    private javax.swing.JRadioButton jRadioButton3ensaladas_plato;
    private javax.swing.JRadioButton jRadioButton4postres_plato;
    private javax.swing.JRadioButton jRadioButton5bebidas_plato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1comidasYbebidas_plato;
    private javax.swing.JTextArea jTextArea1ingredientes_plato;
    private javax.swing.JTextField jTextField1precioAlPublico_plato;
    private javax.swing.JTextField jTextField2nombre_plato;
    private javax.swing.JTextField jTextField3costoDelPlato_plato;
    // End of variables declaration//GEN-END:variables
}
