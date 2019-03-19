/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private Presentador presentador;

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.presentador = new Presentador(this);
        setLocationRelativeTo(null);
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public JTextField getjTextFieldEdad() {
        return jTextFieldEdad;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextFieldSueldo() {
        return jTextFieldSueldo;
    }

    public JTable getjTableVendedores() {
        return jTableVendedores;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldSueldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonGuardarVendedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedores = new javax.swing.JTable();
        jButtonMostrarVendedores = new javax.swing.JButton();
        jButtonMostrarPlanilla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(725, 500));

        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(221, 33, 253, 37);
        jPanel1.add(jTextFieldApellido);
        jTextFieldApellido.setBounds(221, 114, 253, 39);
        jPanel1.add(jTextFieldEdad);
        jTextFieldEdad.setBounds(221, 195, 253, 41);
        jPanel1.add(jTextFieldSueldo);
        jTextFieldSueldo.setBounds(221, 282, 253, 39);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 50, 83, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(57, 126, 130, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EDAD:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(57, 208, 116, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUELDO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(57, 294, 107, 17);

        jButtonGuardarVendedor.setText("Guardar");
        jButtonGuardarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarVendedor);
        jButtonGuardarVendedor.setBounds(278, 389, 138, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/pantalla_siguientes.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(4, 0, 710, 460);

        jTabbedPane1.addTab("VENDEDOR", jPanel1);

        jPanel2.setLayout(null);

        jTableVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apellido", "Edad", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(jTableVendedores);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(31, 24, 527, 402);

        jButtonMostrarVendedores.setText("Mostrar Vendedores");
        jButtonMostrarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarVendedoresActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarVendedores);
        jButtonMostrarVendedores.setBounds(565, 140, 140, 30);

        jButtonMostrarPlanilla.setText("Mostrar Planilla");
        jButtonMostrarPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPlanillaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarPlanilla);
        jButtonMostrarPlanilla.setBounds(565, 207, 140, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/pantalla_siguientes.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(4, 0, 710, 460);

        jTabbedPane1.addTab("TABLA DE VENDEDORES", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarVendedorActionPerformed
        this.presentador.guardarVendedorApretado();
    }//GEN-LAST:event_jButtonGuardarVendedorActionPerformed

    private void jButtonMostrarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarVendedoresActionPerformed
        this.presentador.llenarTabla();
    }//GEN-LAST:event_jButtonMostrarVendedoresActionPerformed

    private void jButtonMostrarPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPlanillaActionPerformed
        this.presentador.mostrarPlanillaApretado();

    }//GEN-LAST:event_jButtonMostrarPlanillaActionPerformed

    /**
     * @param args the command line arguments
     *
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarVendedor;
    private javax.swing.JButton jButtonMostrarPlanilla;
    private javax.swing.JButton jButtonMostrarVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableVendedores;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSueldo;
    // End of variables declaration//GEN-END:variables
}
