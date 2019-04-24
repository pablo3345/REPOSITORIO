/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class Vistas extends javax.swing.JFrame {
    private Presentador presentador;

    /**
     * Creates new form Vistas
     */
    public Vistas() {
        
        initComponents();
        this.presentador = new Presentador(this);
        setLocationRelativeTo(this);
       
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public JTextField getjTextFieldDni() {
        return jTextFieldDni;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextFieldEdad() {
        return jTextFieldEdad;
    }

    public JComboBox<Object> getjComboBox1() {
        return jComboBox1;
    }

  

  
    
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/guason.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 460));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NOMBRE:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 68, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("EDAD:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 60, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("APELLIDO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 80, 28);
        getContentPane().add(jTextFieldApellido);
        jTextFieldApellido.setBounds(140, 80, 226, 28);
        getContentPane().add(jTextFieldDni);
        jTextFieldDni.setBounds(140, 180, 226, 28);
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(140, 30, 226, 28);

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarEmpleado(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 240, 154, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 68, 28);
        getContentPane().add(jTextFieldEdad);
        jTextFieldEdad.setBounds(140, 130, 226, 29);

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mostrar Empleados Guardados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMostrarEmpleadosGuardados(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 240, 190, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(450, 10, 0, 270);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Jubilados");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 80, 70, 20);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 320, 290, 30);

        jButton3.setBackground(new java.awt.Color(153, 0, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar empleado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEmpleado(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 373, 220, 30);

        jButton4.setBackground(new java.awt.Color(153, 0, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Personas Jubiladas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarJubilados(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(460, 130, 150, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 630, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(410, 230, 0, 2);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(470, 110, 130, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Seleccione el empleado a eliminar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 320, 240, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/guason.jpg"))); // NOI18N
        jLabel8.setAutoscrolls(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 630, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarEmpleado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarEmpleado
       this.presentador.botonGuardarApretado();
       
       
    }//GEN-LAST:event_botonGuardarEmpleado

    private void JButtonMostrarEmpleadosGuardados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMostrarEmpleadosGuardados
       this.presentador.mostrarEmpleadosApretados();
    }//GEN-LAST:event_JButtonMostrarEmpleadosGuardados

    private void botonEliminarEmpleado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEmpleado
       this.presentador.eliminarEmpleadoApretado();
    }//GEN-LAST:event_botonEliminarEmpleado

    private void botonMostrarJubilados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarJubilados
       this.presentador.mostrarJubiladosApretado();
    }//GEN-LAST:event_botonMostrarJubilados

  

  
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

  
}




