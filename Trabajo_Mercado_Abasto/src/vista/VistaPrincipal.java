/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        this.jRadioButton1Femenino.setSelected(true);
        this.jRadioButtonSi.setSelected(true);
       
    }

    public JRadioButton getjRadioButton1Femenino() {
        return jRadioButton1Femenino;
    }

    public JRadioButton getjRadioButton2Masculino() {
        return jRadioButton2Masculino;
    }

    public JTextField getjTextFieldApellido_cliente() {
        return jTextFieldApellido_cliente;
    }

    public JTextField getjTextFieldDNI_cliente() {
        return jTextFieldDNI_cliente;
    }

    public JTextField getjTextFieldNombre_cliente() {
        return jTextFieldNombre_cliente;
    }

    public JTextField getjTextFieldtelefono_cliente() {
        return jTextFieldtelefono_cliente;
    }

    public JTextField getjTextFieldNombre_Sector() {
        return jTextFieldNombre_Sector;
    }

    public JTextField getjTextField2Ancho_dimension() {
        return jTextField2Ancho_dimension;
    }

    public JTextField getjTextFieldLargo_dimension() {
        return jTextFieldLargo_dimension;
    }

    public JTextField getjTextFieldNombre_dimension() {
        return jTextFieldNombre_dimension;
    }

    public JTextField getjTextField1Nombre_tipoDePuesto() {
        return jTextField1Nombre_tipoDePuesto;
    }

    public JRadioButton getjRadioButtonNO() {
        return jRadioButtonNO;
    }

    public JRadioButton getjRadioButtonSi() {
        return jRadioButtonSi;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JTextField getjTextField1Lectura_kw() {
        return jTextField1Lectura_kw;
    }

    public JTextField getjTextField1Precio_lectura() {
        return jTextField1Precio_lectura;
    }

    public JComboBox<Object> getjComboBoxPuesto_lectura() {
        return jComboBoxPuesto_lectura;
    }

    public JComboBox<Object> getjComboBox1Dimension_Puesto() {
        return jComboBox1Dimension_Puesto;
    }

    public JComboBox<Object> getjComboBox2TipoDePuesto_puesto() {
        return jComboBox2TipoDePuesto_puesto;
    }

    public JComboBox<Object> getjComboBox3Sector_Puesto() {
        return jComboBox3Sector_Puesto;
    }

    public JComboBox<Object> getjComboBoxAño_fechaFin_contrato() {
        return jComboBoxAño_fechaFin_contrato;
    }

    public JComboBox<Object> getjComboBoxAño_fechaInicio_contrato() {
        return jComboBoxAño_fechaInicio_contrato;
    }

    public JComboBox<Object> getjComboBoxDia_fechaInicio_contrato() {
        return jComboBoxDia_fechaInicio_contrato;
    }

    public JComboBox<Object> getjComboBoxMes_fechaFin_contrato() {
        return jComboBoxMes_fechaFin_contrato;
    }

    public JComboBox<Object> getjComboBoxMes_fechaInicio_contrato() {
        return jComboBoxMes_fechaInicio_contrato;
    }

    public JTextField getjTextField1FechaCancelacion_contrato() {
        return jTextField1FechaCancelacion_contrato;
    }

    public ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    public JTable getjTable1Cliente() {
        return jTable1Cliente;
    }

    public JTextField getjTextFieldID_cliente() {
        return jTextFieldID_cliente;
    }

    public JComboBox<Object> getjComboBox1Cliente() {
        return jComboBox1Cliente;
    }

    public JTextField getjTextField1EncargadoDelAlquiler_Contrato() {
        return jTextField1EncargadoDelAlquiler_Contrato;
    }

    public JComboBox<Object> getjComboBox1EliminarContrato_contrato() {
        return jComboBox1EliminarContrato_contrato;
    }

    public JTable getjTableDimension() {
        return jTableDimension;
    }

    public JTable getjTable1Puesto() {
        return jTable1Puesto;
    }
    
    

   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   

   

   

    public JTextField getjTextField1Monto_Contrato() {
        return jTextField1Monto_Contrato;
    }

    public JComboBox<Object> getjComboBox1Cliente_contrato() {
        return jComboBox1Cliente_contrato;
    }

    public JComboBox<Object> getjComboBoxPuesto_contrato() {
        return jComboBoxPuesto_contrato;
    }

    public JComboBox<Object> getjComboBoxDia_fechaFin__contrato1() {
        return jComboBoxDia_fechaFin__contrato1;
    }

    public JComboBox<Object> getjComboBox1Sector_sector() {
        return jComboBox1Sector_sector;
    }

    public JComboBox<Object> getjComboBox1Dimension_dimension() {
        return jComboBox1Dimension_dimension;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombre_cliente = new javax.swing.JTextField();
        jTextFieldApellido_cliente = new javax.swing.JTextField();
        jTextFieldtelefono_cliente = new javax.swing.JTextField();
        jTextFieldDNI_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardar_cliente = new javax.swing.JButton();
        jRadioButton1Femenino = new javax.swing.JRadioButton();
        jRadioButton2Masculino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Cliente = new javax.swing.JTable();
        jButton1MostrarTabla = new javax.swing.JButton();
        jButton1ModificarTabla_cliente = new javax.swing.JButton();
        jButton1ActualizarTabla_cliente = new javax.swing.JButton();
        jTextFieldID_cliente = new javax.swing.JTextField();
        jButton1Eliminar_Cliente = new javax.swing.JButton();
        jComboBox1Cliente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNombre_Sector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonGuardarSector = new javax.swing.JButton();
        jButton1EliminarSector = new javax.swing.JButton();
        jComboBox1Sector_sector = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNombre_dimension = new javax.swing.JTextField();
        jTextField2Ancho_dimension = new javax.swing.JTextField();
        jTextFieldLargo_dimension = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1GuardarDimension = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDimension = new javax.swing.JTable();
        jButton1MostrarTablaDimension = new javax.swing.JButton();
        jComboBox1Dimension_dimension = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jButton1EliminarDimension = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jTextField1Nombre_tipoDePuesto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        GuardarTipoDePuesto = new javax.swing.JButton();
        jRadioButtonSi = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1Dimension_Puesto = new javax.swing.JComboBox<>();
        jComboBox2TipoDePuesto_puesto = new javax.swing.JComboBox<>();
        jComboBox3Sector_Puesto = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1GuardarPuesto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1Puesto = new javax.swing.JTable();
        jButton1MostrarTabla_puesto = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField1Lectura_kw = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField1Precio_lectura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxPuesto_lectura = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1GuardarLectura = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxDia_fechaInicio_contrato = new javax.swing.JComboBox<>();
        jComboBoxMes_fechaFin_contrato = new javax.swing.JComboBox<>();
        jComboBoxAño_fechaInicio_contrato = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxMes_fechaInicio_contrato = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxAño_fechaFin_contrato = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jTextField1Monto_Contrato = new javax.swing.JTextField();
        jComboBoxDia_fechaFin__contrato1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jComboBox1Cliente_contrato = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxPuesto_contrato = new javax.swing.JComboBox<>();
        jButtonGuardarContrato = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField1FechaCancelacion_contrato = new javax.swing.JTextField();
        jTextField1EncargadoDelAlquiler_Contrato = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox1EliminarContrato_contrato = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jButton1EliminarContrato = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1MostrarReporteContrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldNombre_cliente);
        jTextFieldNombre_cliente.setBounds(130, 30, 290, 32);
        jPanel1.add(jTextFieldApellido_cliente);
        jTextFieldApellido_cliente.setBounds(130, 80, 290, 29);
        jPanel1.add(jTextFieldtelefono_cliente);
        jTextFieldtelefono_cliente.setBounds(130, 130, 290, 31);
        jPanel1.add(jTextFieldDNI_cliente);
        jTextFieldDNI_cliente.setBounds(130, 180, 290, 31);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 40, 68, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 80, 68, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TELEFONO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 68, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 190, 49, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 230, 49, 14);

        jButtonGuardar_cliente.setBackground(new java.awt.Color(0, 204, 255));
        jButtonGuardar_cliente.setText("Guardar");
        jButtonGuardar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardar_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar_cliente);
        jButtonGuardar_cliente.setBounds(660, 30, 143, 40);

        buttonGroup2.add(jRadioButton1Femenino);
        jRadioButton1Femenino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1Femenino.setText("Femenino");
        jPanel1.add(jRadioButton1Femenino);
        jRadioButton1Femenino.setBounds(130, 230, 100, 23);

        buttonGroup2.add(jRadioButton2Masculino);
        jRadioButton2Masculino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2Masculino.setText("Masculino");
        jPanel1.add(jRadioButton2Masculino);
        jRadioButton2Masculino.setBounds(320, 230, 100, 23);

        jTable1Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellido", "telefono", "DNI", "sexo"
            }
        ));
        jScrollPane1.setViewportView(jTable1Cliente);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 270, 760, 230);

        jButton1MostrarTabla.setBackground(new java.awt.Color(0, 204, 255));
        jButton1MostrarTabla.setText("Mostrar Tabla");
        jButton1MostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1MostrarTabla);
        jButton1MostrarTabla.setBounds(50, 510, 140, 40);

        jButton1ModificarTabla_cliente.setBackground(new java.awt.Color(0, 204, 255));
        jButton1ModificarTabla_cliente.setText("Modificar Datos");
        jButton1ModificarTabla_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarTabla_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1ModificarTabla_cliente);
        jButton1ModificarTabla_cliente.setBounds(330, 510, 140, 40);

        jButton1ActualizarTabla_cliente.setBackground(new java.awt.Color(0, 204, 255));
        jButton1ActualizarTabla_cliente.setText("Actualizar Datos");
        jButton1ActualizarTabla_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarTabla_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1ActualizarTabla_cliente);
        jButton1ActualizarTabla_cliente.setBounds(610, 510, 140, 40);

        jTextFieldID_cliente.setEditable(false);
        jPanel1.add(jTextFieldID_cliente);
        jTextFieldID_cliente.setBounds(480, 510, 30, 30);

        jButton1Eliminar_Cliente.setBackground(new java.awt.Color(0, 204, 255));
        jButton1Eliminar_Cliente.setText("Eliminar Cliente");
        jButton1Eliminar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Eliminar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Eliminar_Cliente);
        jButton1Eliminar_Cliente.setBounds(680, 180, 140, 40);

        jPanel1.add(jComboBox1Cliente);
        jComboBox1Cliente.setBounds(450, 190, 210, 30);

        jTabbedPane1.addTab("CLIENTE", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE:");

        jButtonGuardarSector.setBackground(new java.awt.Color(0, 204, 255));
        jButtonGuardarSector.setText("Guardar");
        jButtonGuardarSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarSectorActionPerformed(evt);
            }
        });

        jButton1EliminarSector.setBackground(new java.awt.Color(51, 204, 255));
        jButton1EliminarSector.setText("Eliminar Sector");
        jButton1EliminarSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EliminarSectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre_Sector, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarSector, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1Sector_sector, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jButton1EliminarSector, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre_Sector, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButtonGuardarSector, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1EliminarSector, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jComboBox1Sector_sector))
                .addContainerGap(354, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SECTOR", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(null);
        jPanel3.add(jTextFieldNombre_dimension);
        jTextFieldNombre_dimension.setBounds(300, 30, 210, 33);
        jPanel3.add(jTextField2Ancho_dimension);
        jTextField2Ancho_dimension.setBounds(300, 80, 210, 34);
        jPanel3.add(jTextFieldLargo_dimension);
        jTextFieldLargo_dimension.setBounds(300, 130, 210, 32);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(200, 40, 70, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ANCHO:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(200, 90, 70, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR DIMENSION:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(84, 220, 150, 14);

        jButton1GuardarDimension.setBackground(new java.awt.Color(0, 204, 255));
        jButton1GuardarDimension.setText("Guardar");
        jButton1GuardarDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarDimensionActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1GuardarDimension);
        jButton1GuardarDimension.setBounds(600, 30, 141, 38);

        jTableDimension.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nombre", "ancho", "largo"
            }
        ));
        jScrollPane2.setViewportView(jTableDimension);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(50, 270, 760, 280);

        jButton1MostrarTablaDimension.setBackground(new java.awt.Color(0, 204, 255));
        jButton1MostrarTablaDimension.setText("Mostrar Tabla");
        jButton1MostrarTablaDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarTablaDimensionActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1MostrarTablaDimension);
        jButton1MostrarTablaDimension.setBounds(580, 100, 200, 40);

        jPanel3.add(jComboBox1Dimension_dimension);
        jComboBox1Dimension_dimension.setBounds(260, 210, 280, 30);

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("LARGO:");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(200, 140, 84, 14);

        jButton1EliminarDimension.setBackground(new java.awt.Color(0, 204, 255));
        jButton1EliminarDimension.setText("Eliminar Dimension");
        jButton1EliminarDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EliminarDimensionActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1EliminarDimension);
        jButton1EliminarDimension.setBounds(580, 203, 190, 40);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(30, 180, 790, 10);

        jTabbedPane1.addTab("DIMENSION", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOMBRE:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CAMARA REFRIGERANTE:");

        GuardarTipoDePuesto.setBackground(new java.awt.Color(0, 204, 255));
        GuardarTipoDePuesto.setText("Guardar");
        GuardarTipoDePuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTipoDePuestoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonSi);
        jRadioButtonSi.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSi.setText("SI");

        buttonGroup1.add(jRadioButtonNO);
        jRadioButtonNO.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNO.setText("NO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextField1Nombre_tipoDePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(GuardarTipoDePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jRadioButtonSi)
                .addGap(83, 83, 83)
                .addComponent(jRadioButtonNO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Nombre_tipoDePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(GuardarTipoDePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSi)
                    .addComponent(jRadioButtonNO)
                    .addComponent(jLabel11))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TIPO DE PUESTO", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));
        jPanel6.setLayout(null);

        jPanel6.add(jComboBox1Dimension_Puesto);
        jComboBox1Dimension_Puesto.setBounds(210, 30, 369, 31);

        jPanel6.add(jComboBox2TipoDePuesto_puesto);
        jComboBox2TipoDePuesto_puesto.setBounds(210, 110, 369, 37);

        jPanel6.add(jComboBox3Sector_Puesto);
        jComboBox3Sector_Puesto.setBounds(210, 190, 369, 35);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DIMENSION:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(50, 40, 78, 14);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TIPO DE PUESTO:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(50, 120, 116, 14);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SECTOR:");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(60, 200, 73, 14);

        jButton1GuardarPuesto.setBackground(new java.awt.Color(0, 204, 255));
        jButton1GuardarPuesto.setText("Guardar");
        jButton1GuardarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarPuestoActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1GuardarPuesto);
        jButton1GuardarPuesto.setBounds(640, 50, 149, 37);

        jTable1Puesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "dimension", "tipo de puesto", "sector"
            }
        ));
        jScrollPane3.setViewportView(jTable1Puesto);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(32, 252, 780, 280);

        jButton1MostrarTabla_puesto.setBackground(new java.awt.Color(0, 204, 255));
        jButton1MostrarTabla_puesto.setText("Mostrar Tabla");
        jButton1MostrarTabla_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarTabla_puestoActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1MostrarTabla_puesto);
        jButton1MostrarTabla_puesto.setBounds(613, 113, 210, 40);

        jTabbedPane1.addTab("PUESTO", jPanel6);

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LECTURA KW:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PUESTO:");

        jButton1GuardarLectura.setBackground(new java.awt.Color(0, 204, 255));
        jButton1GuardarLectura.setText("Guardar");
        jButton1GuardarLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarLecturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1Lectura_kw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1Precio_lectura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPuesto_lectura, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(113, 113, 113))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jButton1GuardarLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Lectura_kw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Precio_lectura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPuesto_lectura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(195, 195, 195)
                .addComponent(jButton1GuardarLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("LECTURA", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 0, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FECHA INICIO:");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(100, 170, 90, 14);

        jPanel7.add(jComboBoxDia_fechaInicio_contrato);
        jComboBoxDia_fechaInicio_contrato.setBounds(210, 160, 57, 20);

        jPanel7.add(jComboBoxMes_fechaFin_contrato);
        jComboBoxMes_fechaFin_contrato.setBounds(300, 230, 50, 20);

        jPanel7.add(jComboBoxAño_fechaInicio_contrato);
        jComboBoxAño_fechaInicio_contrato.setBounds(390, 160, 70, 20);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("FECHA FIN:");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(100, 230, 80, 14);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("/");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(280, 160, 20, 24);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("/");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(370, 160, 12, 24);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("/");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(280, 230, 12, 24);

        jPanel7.add(jComboBoxMes_fechaInicio_contrato);
        jComboBoxMes_fechaInicio_contrato.setBounds(300, 160, 50, 20);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("/");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(370, 230, 12, 24);

        jPanel7.add(jComboBoxAño_fechaFin_contrato);
        jComboBoxAño_fechaFin_contrato.setBounds(390, 230, 70, 20);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("MONTO:");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(100, 300, 60, 14);
        jPanel7.add(jTextField1Monto_Contrato);
        jTextField1Monto_Contrato.setBounds(210, 280, 161, 32);

        jPanel7.add(jComboBoxDia_fechaFin__contrato1);
        jComboBoxDia_fechaFin__contrato1.setBounds(210, 230, 57, 20);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CLIENTE:");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(110, 50, 71, 14);

        jPanel7.add(jComboBox1Cliente_contrato);
        jComboBox1Cliente_contrato.setBounds(210, 40, 370, 31);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PUESTO:");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(110, 100, 60, 14);

        jPanel7.add(jComboBoxPuesto_contrato);
        jComboBoxPuesto_contrato.setBounds(210, 90, 370, 30);

        jButtonGuardarContrato.setBackground(new java.awt.Color(51, 204, 255));
        jButtonGuardarContrato.setText("Guardar Contrato");
        jButtonGuardarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarContratoActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonGuardarContrato);
        jButtonGuardarContrato.setBounds(630, 170, 140, 40);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ELIMINAR CONTRATO:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(40, 500, 130, 14);
        jPanel7.add(jTextField1FechaCancelacion_contrato);
        jTextField1FechaCancelacion_contrato.setBounds(210, 340, 210, 30);
        jPanel7.add(jTextField1EncargadoDelAlquiler_Contrato);
        jTextField1EncargadoDelAlquiler_Contrato.setBounds(210, 400, 210, 30);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("FECHA DE CANCELACION:");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(40, 350, 160, 14);

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("año");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(410, 210, 40, 14);

        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("dia");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(230, 210, 40, 14);

        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("mes");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(310, 210, 40, 14);

        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("año");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(410, 140, 40, 14);

        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("mes");
        jPanel7.add(jLabel34);
        jLabel34.setBounds(310, 140, 40, 14);

        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("dia");
        jPanel7.add(jLabel35);
        jLabel35.setBounds(230, 140, 40, 14);

        jPanel7.add(jComboBox1EliminarContrato_contrato);
        jComboBox1EliminarContrato_contrato.setBounds(180, 490, 340, 30);

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("ENCARGADO DEL ALQUILER:");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(30, 410, 170, 14);

        jButton1EliminarContrato.setBackground(new java.awt.Color(0, 204, 255));
        jButton1EliminarContrato.setText("Eliminar Contrato");
        jButton1EliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EliminarContratoActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1EliminarContrato);
        jButton1EliminarContrato.setBounds(570, 480, 140, 40);
        jPanel7.add(jSeparator1);
        jSeparator1.setBounds(30, 450, 800, 20);

        jButton1MostrarReporteContrato.setBackground(new java.awt.Color(0, 204, 255));
        jButton1MostrarReporteContrato.setText("Mostrar Planilla");
        jButton1MostrarReporteContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarReporteContratoActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1MostrarReporteContrato);
        jButton1MostrarReporteContrato.setBounds(630, 240, 140, 40);

        jTabbedPane1.addTab("CONTRATO", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardar_clienteActionPerformed
    
        this.presentador.guardarClienteApretado();
    }//GEN-LAST:event_jButtonGuardar_clienteActionPerformed

    private void jButtonGuardarSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarSectorActionPerformed
        this.presentador.guardarSectorApretado();
    }//GEN-LAST:event_jButtonGuardarSectorActionPerformed

    private void jButton1GuardarDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarDimensionActionPerformed
        this.presentador.guardarDimensionApretado();
    }//GEN-LAST:event_jButton1GuardarDimensionActionPerformed

    private void GuardarTipoDePuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTipoDePuestoActionPerformed
        this.presentador.guardarTipoDePuestoApretado();
    }//GEN-LAST:event_GuardarTipoDePuestoActionPerformed

    private void jButton1GuardarLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarLecturaActionPerformed
        this.presentador.guardarLecturaApretado();
    }//GEN-LAST:event_jButton1GuardarLecturaActionPerformed

    private void jButtonGuardarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarContratoActionPerformed
        this.presentador.guardarContratoApretado();
    }//GEN-LAST:event_jButtonGuardarContratoActionPerformed

    private void jButton1MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarTablaActionPerformed
       this.presentador.mostrarTablaApretado();
    }//GEN-LAST:event_jButton1MostrarTablaActionPerformed

    private void jButton1ModificarTabla_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarTabla_clienteActionPerformed
      int fila = this.jTable1Cliente.getSelectedRow();
      
     if(fila != -1){
         this.jTextFieldID_cliente.setText(jTable1Cliente.getValueAt( fila, 0).toString());
         this.jTextFieldNombre_cliente.setText(jTable1Cliente.getValueAt(fila, 1).toString());
         this.jTextFieldApellido_cliente.setText(jTable1Cliente.getValueAt(fila, 2).toString());
         this.jTextFieldtelefono_cliente.setText(jTable1Cliente.getValueAt(fila, 3).toString());
         this.jTextFieldDNI_cliente.setText(jTable1Cliente.getValueAt(fila, 4).toString());
         
         if(jTable1Cliente.getValueAt(fila, 5).equals("femenino")){
         this.jRadioButton1Femenino.setSelected(true);
        
         
         }
         else{
         this.jRadioButton2Masculino.setSelected(true);
         }
         
           this.jTextFieldID_cliente.setEditable(false);
     
     
     }
    }//GEN-LAST:event_jButton1ModificarTabla_clienteActionPerformed

    private void jButton1ActualizarTabla_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarTabla_clienteActionPerformed
      Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        this.getjRadioButton1Femenino().setActionCommand("femenino");
        this.getjRadioButton2Masculino().setActionCommand("masculino");
        String sexo = this.getButtonGroup2().getSelection().getActionCommand();

       
         
        
        String sql ="UPDATE cliente SET nombre='"+this.jTextFieldNombre_cliente.getText() +"',"
                +"apellido='"+ this.jTextFieldApellido_cliente.getText() + "',"
                +"telefono='" + this.jTextFieldtelefono_cliente.getText()+"',"
                +"dni='"+this.jTextFieldDNI_cliente.getText()+"',"
                +"sexo='"+sexo+ "'WHERE idcliente='"+jTextFieldID_cliente.getText() + "'";
        
        try {
            PreparedStatement preparedStatement =(PreparedStatement) con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            this.presentador.mostrarTablaApretado();
            this.presentador.llenarComboCliente();
           
            JOptionPane.showMessageDialog(null, "los datos se actualizaron correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
           // Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActualizarTabla_clienteActionPerformed

    private void jButton1Eliminar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Eliminar_ClienteActionPerformed
        this.presentador.eliminarClienteApretado();
    }//GEN-LAST:event_jButton1Eliminar_ClienteActionPerformed

    private void jButton1GuardarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarPuestoActionPerformed
       this.presentador.guardarPuestoApretado();
    }//GEN-LAST:event_jButton1GuardarPuestoActionPerformed

    private void jButton1EliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EliminarContratoActionPerformed
       this.presentador.eliminarContratoApretado();
    }//GEN-LAST:event_jButton1EliminarContratoActionPerformed

    private void jButton1MostrarTablaDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarTablaDimensionActionPerformed
       this.presentador.mostrarTablaDimension();
    }//GEN-LAST:event_jButton1MostrarTablaDimensionActionPerformed

    private void jButton1MostrarTabla_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarTabla_puestoActionPerformed
      this.presentador.mostrarTabla_puesto();
    }//GEN-LAST:event_jButton1MostrarTabla_puestoActionPerformed

    private void jButton1MostrarReporteContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarReporteContratoActionPerformed
      this.presentador.mostrarReporteContrato();
    }//GEN-LAST:event_jButton1MostrarReporteContratoActionPerformed

    private void jButton1EliminarSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EliminarSectorActionPerformed
       this.presentador.eliminarSectorApretado();
    }//GEN-LAST:event_jButton1EliminarSectorActionPerformed

    private void jButton1EliminarDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EliminarDimensionActionPerformed
        this.presentador.eliminarDimensionApretado();
    }//GEN-LAST:event_jButton1EliminarDimensionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarTipoDePuesto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1ActualizarTabla_cliente;
    private javax.swing.JButton jButton1EliminarContrato;
    private javax.swing.JButton jButton1EliminarDimension;
    private javax.swing.JButton jButton1EliminarSector;
    private javax.swing.JButton jButton1Eliminar_Cliente;
    private javax.swing.JButton jButton1GuardarDimension;
    private javax.swing.JButton jButton1GuardarLectura;
    private javax.swing.JButton jButton1GuardarPuesto;
    private javax.swing.JButton jButton1ModificarTabla_cliente;
    private javax.swing.JButton jButton1MostrarReporteContrato;
    private javax.swing.JButton jButton1MostrarTabla;
    private javax.swing.JButton jButton1MostrarTablaDimension;
    private javax.swing.JButton jButton1MostrarTabla_puesto;
    private javax.swing.JButton jButtonGuardarContrato;
    private javax.swing.JButton jButtonGuardarSector;
    private javax.swing.JButton jButtonGuardar_cliente;
    private javax.swing.JComboBox<Object> jComboBox1Cliente;
    private javax.swing.JComboBox<Object> jComboBox1Cliente_contrato;
    private javax.swing.JComboBox<Object> jComboBox1Dimension_Puesto;
    private javax.swing.JComboBox<Object> jComboBox1Dimension_dimension;
    private javax.swing.JComboBox<Object> jComboBox1EliminarContrato_contrato;
    private javax.swing.JComboBox<Object> jComboBox1Sector_sector;
    private javax.swing.JComboBox<Object> jComboBox2TipoDePuesto_puesto;
    private javax.swing.JComboBox<Object> jComboBox3Sector_Puesto;
    private javax.swing.JComboBox<Object> jComboBoxAño_fechaFin_contrato;
    private javax.swing.JComboBox<Object> jComboBoxAño_fechaInicio_contrato;
    private javax.swing.JComboBox<Object> jComboBoxDia_fechaFin__contrato1;
    private javax.swing.JComboBox<Object> jComboBoxDia_fechaInicio_contrato;
    private javax.swing.JComboBox<Object> jComboBoxMes_fechaFin_contrato;
    private javax.swing.JComboBox<Object> jComboBoxMes_fechaInicio_contrato;
    private javax.swing.JComboBox<Object> jComboBoxPuesto_contrato;
    private javax.swing.JComboBox<Object> jComboBoxPuesto_lectura;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1Femenino;
    private javax.swing.JRadioButton jRadioButton2Masculino;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Cliente;
    private javax.swing.JTable jTable1Puesto;
    private javax.swing.JTable jTableDimension;
    private javax.swing.JTextField jTextField1EncargadoDelAlquiler_Contrato;
    private javax.swing.JTextField jTextField1FechaCancelacion_contrato;
    private javax.swing.JTextField jTextField1Lectura_kw;
    private javax.swing.JTextField jTextField1Monto_Contrato;
    private javax.swing.JTextField jTextField1Nombre_tipoDePuesto;
    private javax.swing.JTextField jTextField1Precio_lectura;
    private javax.swing.JTextField jTextField2Ancho_dimension;
    private javax.swing.JTextField jTextFieldApellido_cliente;
    private javax.swing.JTextField jTextFieldDNI_cliente;
    private javax.swing.JTextField jTextFieldID_cliente;
    private javax.swing.JTextField jTextFieldLargo_dimension;
    private javax.swing.JTextField jTextFieldNombre_Sector;
    private javax.swing.JTextField jTextFieldNombre_cliente;
    private javax.swing.JTextField jTextFieldNombre_dimension;
    private javax.swing.JTextField jTextFieldtelefono_cliente;
    // End of variables declaration//GEN-END:variables

   
}
