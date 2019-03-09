/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    private Presentador  presentador;

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.presentador = new Presentador(this);
        setLocationRelativeTo(this);
    }

    public JTextField getjTextFieldMonto_Total_compra() {
        return jTextFieldMonto_Total_compra;
    }

    public JTextField getjTextFieldLocalidad_provee() {
        return jTextFieldLocalidad_provee;
    }

    public JTextField getjTextFieldNombre_apellido_provee() {
        return jTextFieldNombre_apellido_provee;
    }

    public JTextField getjTextFieldRubro_provee() {
        return jTextFieldRubro_provee;
    }

    public JTextField getjTextFieldCosto_producto() {
        return jTextFieldCosto_producto;
    }

    public JTextField getjTextFieldGanancia_producto() {
        return jTextFieldGanancia_producto;
    }

    public JTextField getjTextFieldNombre_producto() {
        return jTextFieldNombre_producto;
    }

    public JTextField getjTextFieldStockActual_producto() {
        return jTextFieldStockActual_producto;
    }

    public JTextField getjTextFieldStockMinimo_producto() {
        return jTextFieldStockMinimo_producto;
    }

    public JTextField getjTextFieldTipo_producto() {
        return jTextFieldTipo_producto;
    }

    public JTextField getjTextFieldCantidad_compra_producto() {
        return jTextFieldCantidad_compra_producto;
    }

    public JTextField getjTextFieldPrecioUnitario_compra_producto() {
        return jTextFieldPrecioUnitario_compra_producto;
    }

    public JComboBox<Object> getjComboBoxeliminar_compraVenta() {
        return jComboBoxeliminar_compraVenta;
    }
    
    
    
    

   

   

    public JComboBox<Object> getjComboBoxProveedor_compra() {
        return jComboBoxProveedor_compra;
    }

    public JComboBox<Object> getjComboBoxCompra_compraProducto() {
        return jComboBoxCompra_compraProducto;
    }

    public JComboBox<Object> getjComboBoxProducto_compraProducto() {
        return jComboBoxProducto_compraProducto;
    }

    public JComboBox<Object> getjComboBoxStockActual_producto_compProd() {
        return jComboBoxStockActual_producto_compProd;
    }

    public JComboBox<Object> getjComboBoxEliminarProducto() {
        return jComboBoxEliminarProducto;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombre_producto = new javax.swing.JTextField();
        jTextFieldCosto_producto = new javax.swing.JTextField();
        jTextFieldGanancia_producto = new javax.swing.JTextField();
        jTextFieldStockMinimo_producto = new javax.swing.JTextField();
        jTextFieldStockActual_producto = new javax.swing.JTextField();
        jTextFieldTipo_producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonGuardar_Producto = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBoxEliminarProducto = new javax.swing.JComboBox<>();
        jButtonEliminarProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldMonto_Total_compra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProveedor_compra = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButtonguardar_compra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNombre_apellido_provee = new javax.swing.JTextField();
        jTextFieldLocalidad_provee = new javax.swing.JTextField();
        jTextFieldRubro_provee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonGuardarProveedor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxProducto_compraProducto = new javax.swing.JComboBox<>();
        jComboBoxCompra_compraProducto = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonGuardarCompra_venta = new javax.swing.JButton();
        jTextFieldCantidad_compra_producto = new javax.swing.JTextField();
        jTextFieldPrecioUnitario_compra_producto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxeliminar_compraVenta = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButtonEliminar_compraProducto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBoxStockActual_producto_compProd = new javax.swing.JComboBox<>();
        jButtonCalcularStockActual = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("NOMBRE");

        jLabel6.setText("COSTO");

        jLabel7.setText("GANANCIA");

        jLabel8.setText("STOCK MINIMO");

        jLabel9.setText("STOCK ACTUAL");

        jLabel10.setText("TIPO");

        jButtonGuardar_Producto.setText("Guardar");
        jButtonGuardar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardar_ProductoActionPerformed(evt);
            }
        });

        jButtonEliminarProducto.setText("Eliminar Producto");
        jButtonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre_producto)
                    .addComponent(jTextFieldCosto_producto)
                    .addComponent(jTextFieldGanancia_producto)
                    .addComponent(jTextFieldStockMinimo_producto)
                    .addComponent(jTextFieldStockActual_producto)
                    .addComponent(jTextFieldTipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jComboBoxEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jButtonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldNombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(31, 31, 31)
                                        .addComponent(jTextFieldCosto_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldGanancia_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonGuardar_Producto)
                                        .addGap(20, 20, 20)))
                                .addComponent(jTextFieldStockMinimo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldStockActual_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarProducto))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCTO", jPanel1);

        jLabel1.setText("MONTO TOTAL");

        jLabel13.setText("PROVEEDOR");

        jButtonguardar_compra.setText("Guardar");
        jButtonguardar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguardar_compraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxProveedor_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonguardar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMonto_Total_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProveedor_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMonto_Total_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(jButtonguardar_compra)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("COMPRA", jPanel2);

        jLabel2.setText("NOMBRE Y APELLIDO");

        jLabel3.setText("LOCALIDAD");

        jLabel4.setText("RUBRO");

        jButtonGuardarProveedor.setText("Guardar");
        jButtonGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre_apellido_provee)
                    .addComponent(jTextFieldLocalidad_provee)
                    .addComponent(jTextFieldRubro_provee, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre_apellido_provee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldLocalidad_provee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRubro_provee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jButtonGuardarProveedor)
                .addGap(78, 78, 78))
        );

        jTabbedPane1.addTab("PROVEEDOR", jPanel3);

        jPanel4.setLayout(null);

        jLabel11.setText("CANTIDAD");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(80, 160, 90, 10);

        jLabel12.setText("PRECIO UNITARIO");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(70, 200, 150, 14);

        jPanel4.add(jComboBoxProducto_compraProducto);
        jComboBoxProducto_compraProducto.setBounds(140, 90, 600, 20);

        jPanel4.add(jComboBoxCompra_compraProducto);
        jComboBoxCompra_compraProducto.setBounds(140, 40, 380, 20);

        jLabel14.setText("COMPRA");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(40, 40, 65, 14);

        jLabel15.setText("PRODUCTO");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(30, 90, 75, 14);

        jButtonGuardarCompra_venta.setText("Guardar");
        jButtonGuardarCompra_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCompra_ventaActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardarCompra_venta);
        jButtonGuardarCompra_venta.setBounds(570, 170, 160, 23);
        jPanel4.add(jTextFieldCantidad_compra_producto);
        jTextFieldCantidad_compra_producto.setBounds(210, 140, 280, 30);
        jPanel4.add(jTextFieldPrecioUnitario_compra_producto);
        jTextFieldPrecioUnitario_compra_producto.setBounds(210, 190, 280, 30);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(10, 270, 740, 10);

        jPanel4.add(jComboBoxeliminar_compraVenta);
        jComboBoxeliminar_compraVenta.setBounds(250, 290, 310, 30);

        jLabel16.setText("ELIMINAR DETALLE COMPRA_PRODUCTO");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(20, 300, 210, 14);

        jButtonEliminar_compraProducto.setText("Eliminar");
        jButtonEliminar_compraProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar_compraProductoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEliminar_compraProducto);
        jButtonEliminar_compraProducto.setBounds(590, 290, 150, 30);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(0, 360, 750, 10);

        jPanel4.add(jComboBoxStockActual_producto_compProd);
        jComboBoxStockActual_producto_compProd.setBounds(140, 400, 330, 30);

        jButtonCalcularStockActual.setText("Actualizar stock y precio unitario");
        jButtonCalcularStockActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularStockActualActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCalcularStockActual);
        jButtonCalcularStockActual.setBounds(500, 400, 230, 30);

        jLabel17.setText("PRODUCTO");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(40, 410, 80, 14);

        jTabbedPane1.addTab("COMPRA_PRODUCTO", jPanel4);

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

    private void jButtonGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarProveedorActionPerformed
       this.presentador.guardarProveedorApretado();
    }//GEN-LAST:event_jButtonGuardarProveedorActionPerformed

    private void jButtonguardar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguardar_compraActionPerformed
       this.presentador.guardarCompraApretado();
    }//GEN-LAST:event_jButtonguardar_compraActionPerformed

    private void jButtonGuardar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardar_ProductoActionPerformed
       this.presentador.guardarProductoApretado();
    }//GEN-LAST:event_jButtonGuardar_ProductoActionPerformed

    private void jButtonGuardarCompra_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCompra_ventaActionPerformed
       this.presentador.guardarCompraProducto_apretado();
    }//GEN-LAST:event_jButtonGuardarCompra_ventaActionPerformed

    private void jButtonEliminar_compraProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar_compraProductoActionPerformed
       this.presentador.eliminar_compraProducto();
    }//GEN-LAST:event_jButtonEliminar_compraProductoActionPerformed

    private void jButtonCalcularStockActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularStockActualActionPerformed
       this.presentador.calcularStockActualApretado();
    }//GEN-LAST:event_jButtonCalcularStockActualActionPerformed

    private void jButtonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProductoActionPerformed
       this.presentador.eliminarProductoApretado();
    }//GEN-LAST:event_jButtonEliminarProductoActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularStockActual;
    private javax.swing.JButton jButtonEliminarProducto;
    private javax.swing.JButton jButtonEliminar_compraProducto;
    private javax.swing.JButton jButtonGuardarCompra_venta;
    private javax.swing.JButton jButtonGuardarProveedor;
    private javax.swing.JButton jButtonGuardar_Producto;
    private javax.swing.JButton jButtonguardar_compra;
    private javax.swing.JComboBox<Object> jComboBoxCompra_compraProducto;
    private javax.swing.JComboBox<Object> jComboBoxEliminarProducto;
    private javax.swing.JComboBox<Object> jComboBoxProducto_compraProducto;
    private javax.swing.JComboBox<Object> jComboBoxProveedor_compra;
    private javax.swing.JComboBox<Object> jComboBoxStockActual_producto_compProd;
    private javax.swing.JComboBox<Object> jComboBoxeliminar_compraVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldCantidad_compra_producto;
    private javax.swing.JTextField jTextFieldCosto_producto;
    private javax.swing.JTextField jTextFieldGanancia_producto;
    private javax.swing.JTextField jTextFieldLocalidad_provee;
    private javax.swing.JTextField jTextFieldMonto_Total_compra;
    private javax.swing.JTextField jTextFieldNombre_apellido_provee;
    private javax.swing.JTextField jTextFieldNombre_producto;
    private javax.swing.JTextField jTextFieldPrecioUnitario_compra_producto;
    private javax.swing.JTextField jTextFieldRubro_provee;
    private javax.swing.JTextField jTextFieldStockActual_producto;
    private javax.swing.JTextField jTextFieldStockMinimo_producto;
    private javax.swing.JTextField jTextFieldTipo_producto;
    // End of variables declaration//GEN-END:variables
}
