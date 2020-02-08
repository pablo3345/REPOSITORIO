/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPrincipal;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Repuesto;
import modelo.Venta;
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
        setLocationRelativeTo(this);
    }

    public JTextField getjTextField1Codigo_repuesto() {
        return jTextField1Codigo_repuesto;
    }

    public JComboBox<Object> getjComboBox1Estado_repuestos() {
        return jComboBox1Estado_repuestos;
    }

    public JTextField getjTextField1ID_baja_Repuesto() {
        return jTextField1ID_baja_Repuesto;
    }

    public JComboBox<Object> getjComboBox1AltaBaja_producto() {
        return jComboBox1AltaBaja_producto;
    }

    public JComboBox<Object> getjComboBox1DadosDebaja_repuestos() {
        return jComboBox1DadosDebaja_repuestos;
    }

    public JComboBox<Object> getjComboBox1ComboAlta_repuestos() {
        return jComboBox1ComboAlta_repuestos;
    }

    public JTextField getjTextField1Nombre_fabrica() {
        return jTextField1Nombre_fabrica;
    }

    public JTextField getjTextField2Direccion_fabrica() {
        return jTextField2Direccion_fabrica;
    }

    public JComboBox<Object> getjComboBox1Fabrica_venta() {
        return jComboBox1Fabrica_venta;
    }

    public JComboBox<Object> getjComboBox2Repuesto_venta() {
        return jComboBox2Repuesto_venta;
    }

    public JTextField getjTextField1CantidadRepuestos_venta() {
        return jTextField1CantidadRepuestos_venta;
    }

    public JTextField getjTextField1Precio_venta() {
        return jTextField1Precio_venta;
    }

    public JTextField getjTextField1Total_venta() {
        return jTextField1Total_venta;
    }

    public JTextField getjTextField1Fabrica_comprobante() {
        return jTextField1Fabrica_comprobante;
    }

    public JTextField getjTextField2repuesto_comprobante() {
        return jTextField2repuesto_comprobante;
    }

    public JTextField getjTextField3precio_comprobante() {
        return jTextField3precio_comprobante;
    }

    public JTextField getjTextField4cantidad_comprobante() {
        return jTextField4cantidad_comprobante;
    }

    public JTextField getjTextField5Total_comprobante() {
        return jTextField5Total_comprobante;
    }

    public JTextField getjTextField6TotalAPagar_comprobante() {
        return jTextField6TotalAPagar_comprobante;
    }

    public JTable getjTable1Tabla_comprobante() {
        return jTable1Tabla_comprobante;
    }

    public JTextField getjTextField1idFabrica_venta() {
        return jTextField1idFabrica_venta;
    }
    
    
    
    

 
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   
    
    

    

    public JTextField getjTextField1Nombre_repuesto() {
        return jTextField1Nombre_repuesto;
    }

    public JTextField getjTextField1Precio_Repuesto() {
        return jTextField1Precio_Repuesto;
    }

    public JTextField getjTextField1StockActual_repuesto() {
        return jTextField1StockActual_repuesto;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Nombre_repuesto = new javax.swing.JTextField();
        jTextField1Codigo_repuesto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Precio_Repuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1StockActual_repuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1GuardarRepuesto = new javax.swing.JButton();
        jComboBox1Estado_repuestos = new javax.swing.JComboBox<>();
        jButton1DarDeBajaRepuesto = new javax.swing.JButton();
        jTextField1ID_baja_Repuesto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1AltaBaja_producto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1DadosDebaja_repuestos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1ComboAlta_repuestos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1Nombre_fabrica = new javax.swing.JTextField();
        jTextField2Direccion_fabrica = new javax.swing.JTextField();
        jButton1Guardar_fabrica = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1Fabrica_venta = new javax.swing.JComboBox<>();
        jComboBox2Repuesto_venta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField1Precio_venta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1CantidadRepuestos_venta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField1Total_venta = new javax.swing.JTextField();
        jButton1GuardarVenta = new javax.swing.JButton();
        jButton1calcularTotalVenta = new javax.swing.JButton();
        jTextField1idFabrica_venta = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton1ObtenerTotalFabrica = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1Fabrica_comprobante = new javax.swing.JTextField();
        jTextField2repuesto_comprobante = new javax.swing.JTextField();
        jTextField3precio_comprobante = new javax.swing.JTextField();
        jTextField4cantidad_comprobante = new javax.swing.JTextField();
        jTextField5Total_comprobante = new javax.swing.JTextField();
        jTextField6TotalAPagar_comprobante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Tabla_comprobante = new javax.swing.JTable();
        jButton1guardar_comprobante = new javax.swing.JButton();
        jButtonCargarTablaVentas = new javax.swing.JButton();
        jButton1cargarDatos = new javax.swing.JButton();
        jButton1TotalApagar = new javax.swing.JButton();
        jButton2LimpiarTabla = new javax.swing.JButton();
        jButton2GenerarComprobante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Stock actual:");

        jLabel5.setText("Estado:");

        jButton1GuardarRepuesto.setText("Guardar");
        jButton1GuardarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarRepuestoActionPerformed(evt);
            }
        });

        jButton1DarDeBajaRepuesto.setText("Aceptar");
        jButton1DarDeBajaRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DarDeBajaRepuestoActionPerformed(evt);
            }
        });

        jLabel6.setText("Id  Repuesto:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dar de alta o baja un producto");

        jLabel8.setText("Productos dado de baja");

        jLabel9.setText("Productos Activos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1ID_baja_Repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBox1AltaBaja_producto, 0, 130, Short.MAX_VALUE)))
                        .addGap(18, 35, Short.MAX_VALUE)
                        .addComponent(jButton1DarDeBajaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1Nombre_repuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextField1Codigo_repuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextField1Precio_Repuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextField1StockActual_repuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jComboBox1Estado_repuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1DadosDebaja_repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1ComboAlta_repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jButton1GuardarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Nombre_repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1GuardarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField1Codigo_repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Precio_Repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1StockActual_repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1DadosDebaja_repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1ComboAlta_repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1Estado_repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1DarDeBajaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1ID_baja_Repuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1AltaBaja_producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("REPUESTO", jPanel1);

        jLabel10.setText("Nombre:");

        jLabel11.setText("Direccion:");

        jButton1Guardar_fabrica.setText("Guardar");
        jButton1Guardar_fabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Guardar_fabricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1Nombre_fabrica)
                            .addComponent(jTextField2Direccion_fabrica, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1Guardar_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1Nombre_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2Direccion_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jButton1Guardar_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FABRICA", jPanel2);

        jLabel12.setText("Fabrica:");

        jLabel13.setText("Repuesto:");

        jLabel14.setText("Precio:");

        jLabel15.setText("Cantidad de repuestos:");

        jLabel16.setText("Total:");

        jButton1GuardarVenta.setText("Guardar");
        jButton1GuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarVentaActionPerformed(evt);
            }
        });

        jButton1calcularTotalVenta.setText("Calcular Total");
        jButton1calcularTotalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1calcularTotalVentaActionPerformed(evt);
            }
        });

        jLabel23.setText("id Fabrica");

        jButton1ObtenerTotalFabrica.setText("Obtener total Fabrica");
        jButton1ObtenerTotalFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ObtenerTotalFabricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1GuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1calcularTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1idFabrica_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1ObtenerTotalFabrica, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2Repuesto_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1Fabrica_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1CantidadRepuestos_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1Precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1Total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1Fabrica_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2Repuesto_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1CantidadRepuestos_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1Total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1calcularTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1GuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1ObtenerTotalFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1idFabrica_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        jTabbedPane1.addTab("VENTA", jPanel3);

        jLabel17.setText("Fabrica:");

        jLabel18.setText("Repuesto:");

        jLabel19.setText("Precio del repuestos:");

        jLabel20.setText("Cantidad:");

        jLabel21.setText("Total:");

        jLabel22.setText("Total a Pagar:");

        jTable1Tabla_comprobante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id Venta", "Fabrica", "Repuesto", "Precio del repuesto", "Cantidad de repuestos", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1Tabla_comprobante);

        jButton1guardar_comprobante.setText("Guardar");
        jButton1guardar_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1guardar_comprobanteActionPerformed(evt);
            }
        });

        jButtonCargarTablaVentas.setText("Cargar Tabla Ventas");
        jButtonCargarTablaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarTablaVentasActionPerformed(evt);
            }
        });

        jButton1cargarDatos.setText("Cargar datos");
        jButton1cargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1cargarDatosActionPerformed(evt);
            }
        });

        jButton1TotalApagar.setText("Total a pagar");
        jButton1TotalApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1TotalApagarActionPerformed(evt);
            }
        });

        jButton2LimpiarTabla.setText("Limpiar tabla");
        jButton2LimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimpiarTablaActionPerformed(evt);
            }
        });

        jButton2GenerarComprobante.setText("Generar comprobante");
        jButton2GenerarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GenerarComprobanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1Fabrica_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel18))
                            .addComponent(jLabel21))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5Total_comprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jTextField2repuesto_comprobante)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4cantidad_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3precio_comprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jTextField6TotalAPagar_comprobante))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1guardar_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCargarTablaVentas)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1cargarDatos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1TotalApagar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2LimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2GenerarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1Fabrica_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField2repuesto_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField3precio_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField4cantidad_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5Total_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6TotalAPagar_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel21)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCargarTablaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1guardar_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1cargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1TotalApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2LimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2GenerarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("COMPROBANTE", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1GuardarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarRepuestoActionPerformed
       this.presentador.guardarRepuestoApretado();
    }//GEN-LAST:event_jButton1GuardarRepuestoActionPerformed

    private void jButton1DarDeBajaRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DarDeBajaRepuestoActionPerformed
       this.presentador.altaBajaProducto();
    }//GEN-LAST:event_jButton1DarDeBajaRepuestoActionPerformed

    private void jButton1Guardar_fabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Guardar_fabricaActionPerformed
       this.presentador.guardarFabricaApretado();
    }//GEN-LAST:event_jButton1Guardar_fabricaActionPerformed

    private void jButton1GuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarVentaActionPerformed
       this.presentador.guardarVentaApretado();
    }//GEN-LAST:event_jButton1GuardarVentaActionPerformed

    private void jButton1calcularTotalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1calcularTotalVentaActionPerformed
     
      this.presentador.calcularTotalVenta();
       
       
        
     
        
        
    }//GEN-LAST:event_jButton1calcularTotalVentaActionPerformed

    private void jButton1guardar_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1guardar_comprobanteActionPerformed
       this.presentador.guardarComprobanteApretado();
    }//GEN-LAST:event_jButton1guardar_comprobanteActionPerformed

    private void jButtonCargarTablaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTablaVentasActionPerformed
       this.presentador.cargarTablaVentas();
    }//GEN-LAST:event_jButtonCargarTablaVentasActionPerformed

    private void jButton1cargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1cargarDatosActionPerformed
     
        int fila = this.getjTable1Tabla_comprobante().getSelectedRow();
        if (fila != -1) {
            this.jTextField1Fabrica_comprobante.setText(getjTable1Tabla_comprobante().getValueAt(fila, 1).toString());
            this. jTextField2repuesto_comprobante.setText(getjTable1Tabla_comprobante().getValueAt(fila, 2).toString());
            this.jTextField3precio_comprobante.setText(getjTable1Tabla_comprobante().getValueAt(fila, 3).toString());
            this.jTextField4cantidad_comprobante.setText(getjTable1Tabla_comprobante().getValueAt(fila, 4).toString());
            this.jTextField5Total_comprobante.setText(getjTable1Tabla_comprobante().getValueAt(fila, 5).toString());
           
            //////
           // this.jTextField_id_bicicleta.setEditable(false);

        } else {
            JOptionPane.showMessageDialog(null, "mensaje error");

        }
    }//GEN-LAST:event_jButton1cargarDatosActionPerformed

    private void jButton2LimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimpiarTablaActionPerformed
       Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();

        String sql = "DELETE from comprobante ";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "la tabla se limpio correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jButton2LimpiarTablaActionPerformed

    private void jButton1TotalApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1TotalApagarActionPerformed
       
        this.presentador.totalApagarComprobante();
    }//GEN-LAST:event_jButton1TotalApagarActionPerformed

    private void jButton1ObtenerTotalFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ObtenerTotalFabricaActionPerformed
      this.presentador.obtenerTotalFabrica();
    }//GEN-LAST:event_jButton1ObtenerTotalFabricaActionPerformed

    private void jButton2GenerarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GenerarComprobanteActionPerformed
       this.presentador.generarComprobante();
    }//GEN-LAST:event_jButton2GenerarComprobanteActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1DarDeBajaRepuesto;
    private javax.swing.JButton jButton1GuardarRepuesto;
    private javax.swing.JButton jButton1GuardarVenta;
    private javax.swing.JButton jButton1Guardar_fabrica;
    private javax.swing.JButton jButton1ObtenerTotalFabrica;
    private javax.swing.JButton jButton1TotalApagar;
    private javax.swing.JButton jButton1calcularTotalVenta;
    private javax.swing.JButton jButton1cargarDatos;
    private javax.swing.JButton jButton1guardar_comprobante;
    private javax.swing.JButton jButton2GenerarComprobante;
    private javax.swing.JButton jButton2LimpiarTabla;
    private javax.swing.JButton jButtonCargarTablaVentas;
    private javax.swing.JComboBox<Object> jComboBox1AltaBaja_producto;
    private javax.swing.JComboBox<Object> jComboBox1ComboAlta_repuestos;
    private javax.swing.JComboBox<Object> jComboBox1DadosDebaja_repuestos;
    private javax.swing.JComboBox<Object> jComboBox1Estado_repuestos;
    private javax.swing.JComboBox<Object> jComboBox1Fabrica_venta;
    private javax.swing.JComboBox<Object> jComboBox2Repuesto_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Tabla_comprobante;
    private javax.swing.JTextField jTextField1CantidadRepuestos_venta;
    private javax.swing.JTextField jTextField1Codigo_repuesto;
    private javax.swing.JTextField jTextField1Fabrica_comprobante;
    private javax.swing.JTextField jTextField1ID_baja_Repuesto;
    private javax.swing.JTextField jTextField1Nombre_fabrica;
    private javax.swing.JTextField jTextField1Nombre_repuesto;
    private javax.swing.JTextField jTextField1Precio_Repuesto;
    private javax.swing.JTextField jTextField1Precio_venta;
    private javax.swing.JTextField jTextField1StockActual_repuesto;
    private javax.swing.JTextField jTextField1Total_venta;
    private javax.swing.JTextField jTextField1idFabrica_venta;
    private javax.swing.JTextField jTextField2Direccion_fabrica;
    private javax.swing.JTextField jTextField2repuesto_comprobante;
    private javax.swing.JTextField jTextField3precio_comprobante;
    private javax.swing.JTextField jTextField4cantidad_comprobante;
    private javax.swing.JTextField jTextField5Total_comprobante;
    private javax.swing.JTextField jTextField6TotalAPagar_comprobante;
    // End of variables declaration//GEN-END:variables
}
