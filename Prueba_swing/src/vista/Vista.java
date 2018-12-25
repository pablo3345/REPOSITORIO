/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.Competencia;
import modelo.Deportista;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public final class Vista extends javax.swing.JFrame {
    private Presentador presentador;

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
         setLocationRelativeTo(null);
        
        
        this.presentador = new Presentador(this);
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public JTextField getjTextFieldDNI() {
        return jTextFieldDNI;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextFieldCantidadKilometros() {
        return jTextFieldCantidadKilometros;
    }

    public JTextField getjTextFieldFecha() {
        return jTextFieldFecha;
    }

    public JTextField getjTextFieldPais() {
        return jTextFieldPais;
    }

    public JTextField getjTextFieldTiempoRecorrido() {
        return jTextFieldTiempoRecorrido;
    }

    public JComboBox<Deportista> getjComboBoxDeportista() {
        return jComboBoxDeportista;
    }

    public JComboBox<Deportista> getjComboBoxDeportistaYKilometros() {
        return jComboBoxDeportistaYKilometros;
    }
    
    

   

    

   
    

    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jTextFieldTiempoRecorrido = new javax.swing.JTextField();
        jTextFieldCantidadKilometros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBoxDeportista = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxDeportistaYKilometros = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonTiempoRecorrido = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldApellido);
        jTextFieldApellido.setBounds(130, 160, 236, 41);
        jPanel1.add(jTextFieldDNI);
        jTextFieldDNI.setBounds(130, 250, 236, 41);
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(130, 80, 236, 41);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("APELLIDO:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 180, 90, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 88, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DNI:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 260, 58, 28);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarDeportista(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 400, 219, 42);

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Mostrar Deportista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDeportista(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(560, 400, 219, 43);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/pantalla_proyectoFinal.jpg"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 830, 480);

        jTabbedPane1.addTab("DEPORTISTA", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jTextFieldFecha);
        jTextFieldFecha.setBounds(280, 109, 219, 39);
        jPanel2.add(jTextFieldPais);
        jTextFieldPais.setBounds(280, 37, 219, 39);
        jPanel2.add(jTextFieldTiempoRecorrido);
        jTextFieldTiempoRecorrido.setBounds(280, 257, 219, 39);
        jPanel2.add(jTextFieldCantidadKilometros);
        jTextFieldCantidadKilometros.setBounds(280, 180, 219, 39);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FECHA:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 112, 82, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("TIEMPO RECORRIDO:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(96, 268, 166, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PAIS:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(180, 48, 54, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CANTIDAD DE KILOMETROS:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(41, 191, 221, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("DEPORTISTA:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(128, 345, 112, 28);

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarCompetencia(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(567, 37, 220, 40);

        jPanel2.add(jComboBoxDeportista);
        jComboBoxDeportista.setBounds(280, 344, 291, 34);

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Mostrar Competencia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarCompetencia(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(567, 177, 220, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo, sin rompecabezas.jpg"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 0, 830, 480);

        jTabbedPane1.addTab("COMPETENCIA", jPanel2);

        jPanel3.setLayout(null);

        jPanel3.add(jComboBoxDeportistaYKilometros);
        jComboBoxDeportistaYKilometros.setBounds(162, 108, 328, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("SALIR");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(720, 318, 54, 28);

        jButtonCalcular.setBackground(new java.awt.Color(102, 255, 255));
        jButtonCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCalcular.setText("Calcular Kilometros");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonCalcularKIilometros(evt);
            }
        });
        jPanel3.add(jButtonCalcular);
        jButtonCalcular.setBounds(90, 387, 220, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("DEPORTISTA:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(172, 53, 166, 28);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("CANTIDAD DE KILOMETROS RECORIDOS:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(43, 324, 306, 28);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("CANTIDAD DE TIEMPO RECORIDOS:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(382, 318, 267, 28);

        jButtonSalir.setBackground(new java.awt.Color(102, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalir);
        jButtonSalir.setBounds(720, 387, 61, 40);

        jButtonTiempoRecorrido.setBackground(new java.awt.Color(102, 255, 255));
        jButtonTiempoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTiempoRecorrido.setText("Tiempo Recorrido");
        jButtonTiempoRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTiempoRecorridoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTiempoRecorrido);
        jButtonTiempoRecorrido.setBounds(416, 386, 209, 42);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo, sin rompecabezas.jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 0, 830, 480);

        jTabbedPane1.addTab("RESULTADO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTiempoRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTiempoRecorridoActionPerformed
        this.presentador.calcularTiempoApretado();
    }//GEN-LAST:event_jButtonTiempoRecorridoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void ButonCalcularKIilometros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonCalcularKIilometros
        this.presentador.calcularKilometrosApretado();
    }//GEN-LAST:event_ButonCalcularKIilometros

    private void jButtonMostrarCompetencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarCompetencia
        this.presentador.mostrarCompetenciaApretado();
    }//GEN-LAST:event_jButtonMostrarCompetencia

    private void BotonGuardarCompetencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCompetencia
        this.presentador.guardarCompetenciaApretado();
    }//GEN-LAST:event_BotonGuardarCompetencia

    private void jButtonMostrarDeportista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDeportista
        this.presentador.mostrarDeportistaApretado();
    }//GEN-LAST:event_jButtonMostrarDeportista

    private void BotonGuardarDeportista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarDeportista
        this.presentador.botonGuardarDeportista();
    }//GEN-LAST:event_BotonGuardarDeportista

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTiempoRecorrido;
    private javax.swing.JComboBox<Deportista> jComboBoxDeportista;
    private javax.swing.JComboBox<Deportista> jComboBoxDeportistaYKilometros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCantidadKilometros;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldTiempoRecorrido;
    // End of variables declaration//GEN-END:variables
}
