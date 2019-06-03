/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import conexion.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Contrato;
import modelo.Dimension;
import modelo.Puesto;
import modelo.Sector;
import modelo.TipoDePuesto;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicios.ServicioCliente;
import servicios.ServicioContrato;
import servicios.ServicioDimension;
import servicios.ServicioLectura;
import servicios.ServicioPuesto;
import servicios.ServicioSector;
import servicios.ServicioTipo_de_Puesto;
import vista.Contraseña;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioCliente servicioCliente;
    private ServicioContrato servicioContrato;
    private ServicioDimension servicioDimension;
    private ServicioLectura servicioLectura;
    private ServicioPuesto servicioPuesto;
    private ServicioSector servicioSector;
    private ServicioTipo_de_Puesto servicioTipo_de_Puesto;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioCliente = new ServicioCliente();
        this.servicioContrato = new ServicioContrato();
        this.servicioDimension = new ServicioDimension();
        this.servicioLectura = new ServicioLectura();
        this.servicioPuesto = new ServicioPuesto();
        this.servicioSector = new ServicioSector();
        this.servicioTipo_de_Puesto = new ServicioTipo_de_Puesto();
        this.rellenarComboDia();
        this.rellenarComboMes();
        this.rellenarComboAño();
        this.llenarComboCliente();
        this.llenarComboDimension_puesto();
        this.llenarComboTipoDePuesto_puesto();
        this.LlenarComboSector();
        this.llenarComboPuesto_lectura();
        this.rellenarComboFin();
        this.rellenarComboDiaFin();
        this.rellenarComboMesFin();
        this.llenarComboContrato();
        this.llenarComboSector_sector();
        this.llenarComboDimension();

    }

    private void rellenarComboDia() {
        DefaultComboBoxModel dia = new DefaultComboBoxModel();

        dia.addElement(1);
        dia.addElement(2);
        dia.addElement(3);
        dia.addElement(4);
        dia.addElement(5);
        dia.addElement(6);
        dia.addElement(7);
        dia.addElement(8);
        dia.addElement(9);
        dia.addElement(10);
        dia.addElement(11);
        dia.addElement(12);
        dia.addElement(13);
        dia.addElement(14);
        dia.addElement(15);
        dia.addElement(16);
        dia.addElement(17);
        dia.addElement(18);
        dia.addElement(19);
        dia.addElement(20);
        dia.addElement(21);
        dia.addElement(22);
        dia.addElement(23);
        dia.addElement(24);
        dia.addElement(25);
        dia.addElement(26);
        dia.addElement(27);
        dia.addElement(28);
        dia.addElement(29);
        dia.addElement(30);
        dia.addElement(31);

        this.vistaPrincipal.getjComboBoxDia_fechaInicio_contrato().setModel(dia);

        this.vistaPrincipal.getjComboBoxDia_fechaFin__contrato1().setModel(dia);

    }

    private void rellenarComboMes() {
        DefaultComboBoxModel modeloMes = new DefaultComboBoxModel();

        modeloMes.addElement(1);
        modeloMes.addElement(2);
        modeloMes.addElement(3);
        modeloMes.addElement(4);
        modeloMes.addElement(5);
        modeloMes.addElement(6);
        modeloMes.addElement(7);
        modeloMes.addElement(8);
        modeloMes.addElement(9);
        modeloMes.addElement(10);
        modeloMes.addElement(11);
        modeloMes.addElement(12);

        this.vistaPrincipal.getjComboBoxMes_fechaInicio_contrato().setModel(modeloMes);
        this.vistaPrincipal.getjComboBoxMes_fechaFin_contrato().setModel(modeloMes);

    }
      private void rellenarComboMesFin() {
        DefaultComboBoxModel modeloMesFin = new DefaultComboBoxModel();

        modeloMesFin.addElement(1);
        modeloMesFin.addElement(2);
        modeloMesFin.addElement(3);
        modeloMesFin.addElement(4);
        modeloMesFin.addElement(5);
        modeloMesFin.addElement(6);
        modeloMesFin.addElement(7);
        modeloMesFin.addElement(8);
        modeloMesFin.addElement(9);
        modeloMesFin.addElement(10);
        modeloMesFin.addElement(11);
        modeloMesFin.addElement(12);

       
        this.vistaPrincipal.getjComboBoxMes_fechaFin_contrato().setModel(modeloMesFin);

    }

    private void rellenarComboAño() {

        DefaultComboBoxModel modeloAño = new DefaultComboBoxModel();

        modeloAño.addElement(2010);
        modeloAño.addElement(2011);
        modeloAño.addElement(2012);
        modeloAño.addElement(2013);
        modeloAño.addElement(2014);
        modeloAño.addElement(2015);
        modeloAño.addElement(2016);
        modeloAño.addElement(2017);
        modeloAño.addElement(2018);
        modeloAño.addElement(2019);
        modeloAño.addElement(2020);
        modeloAño.addElement(2021);
        modeloAño.addElement(2022);
        modeloAño.addElement(2023);
        modeloAño.addElement(2024);
        modeloAño.addElement(2025);

        this.vistaPrincipal.getjComboBoxAño_fechaInicio_contrato().setModel(modeloAño);

    }

    private void rellenarComboFin() {
        DefaultComboBoxModel modeloAñoFin = new DefaultComboBoxModel();

        modeloAñoFin.addElement(2010);
        modeloAñoFin.addElement(2011);
        modeloAñoFin.addElement(2012);
        modeloAñoFin.addElement(2013);
        modeloAñoFin.addElement(2014);
        modeloAñoFin.addElement(2015);
        modeloAñoFin.addElement(2016);
        modeloAñoFin.addElement(2017);
        modeloAñoFin.addElement(2018);
        modeloAñoFin.addElement(2019);
        modeloAñoFin.addElement(2020);
        modeloAñoFin.addElement(2021);
        modeloAñoFin.addElement(2022);
        modeloAñoFin.addElement(2023);
        modeloAñoFin.addElement(2024);
        modeloAñoFin.addElement(2025);

        this.vistaPrincipal.getjComboBoxAño_fechaFin_contrato().setModel(modeloAñoFin);

    }

    public void guardarClienteApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre_cliente().getText();
        String apellido = this.vistaPrincipal.getjTextFieldApellido_cliente().getText();
        String telefono = this.vistaPrincipal.getjTextFieldtelefono_cliente().getText();
        String dni = this.vistaPrincipal.getjTextFieldDNI_cliente().getText();
        this.vistaPrincipal.getjRadioButton1Femenino().setActionCommand("femenino");
        this.vistaPrincipal.getjRadioButton2Masculino().setActionCommand("masculino");
        String sexo = this.vistaPrincipal.getButtonGroup2().getSelection().getActionCommand();

        try {
            this.servicioCliente.guardarCliente(nombre, apellido, telefono, dni, sexo);
            JOptionPane.showMessageDialog(null, "el cliente se guardo correctamente");
            this.llenarComboCliente();

            this.vistaPrincipal.getjTextFieldNombre_cliente().setText("");
            this.vistaPrincipal.getjTextFieldApellido_cliente().setText("");
            this.vistaPrincipal.getjTextFieldtelefono_cliente().setText("");
            this.vistaPrincipal.getjTextFieldDNI_cliente().setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarSectorApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre_Sector().getText();

        try {
            this.servicioSector.guardarSector(nombre);
            JOptionPane.showMessageDialog(null, "el sector se guardo correctamente");
            this.vistaPrincipal.getjTextFieldNombre_Sector().setText("");
            this.LlenarComboSector();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarDimensionApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre_dimension().getText();
        String ancho = this.vistaPrincipal.getjTextField2Ancho_dimension().getText();
        String largo = this.vistaPrincipal.getjTextFieldLargo_dimension().getText();

        try {
            this.servicioDimension.guardarDimension(nombre, ancho, largo);

            JOptionPane.showMessageDialog(null, "la dimension se guardo correctamente");
            this.llenarComboDimension_puesto();

            this.vistaPrincipal.getjTextFieldNombre_dimension().setText("");
            this.vistaPrincipal.getjTextField2Ancho_dimension().setText("");
            this.vistaPrincipal.getjTextFieldLargo_dimension().setText("");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }

    public void guardarTipoDePuestoApretado() {
        
       

        String nombre = this.vistaPrincipal.getjTextField1Nombre_tipoDePuesto().getText();
        this.vistaPrincipal.getjRadioButtonSi().setActionCommand("Si");
        this.vistaPrincipal.getjRadioButtonNO().setActionCommand("No");
        String camara_refrigerante = this.vistaPrincipal.getButtonGroup1().getSelection().getActionCommand();

        try {
            this.servicioTipo_de_Puesto.guardarTipo_de_puesto(nombre, camara_refrigerante);
           
            
            this.llenarComboTipoDePuesto_puesto();
            JOptionPane.showMessageDialog(null, "el tipo de puesto se guardo correctamente");

            this.vistaPrincipal.getjTextField1Nombre_tipoDePuesto().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarLecturaApretado() {
        Puesto puesto = (Puesto) this.vistaPrincipal.getjComboBoxPuesto_lectura().getSelectedItem();
        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp fecha = new java.sql.Timestamp(calendar.getTimeInMillis());
        String lecturakw = this.vistaPrincipal.getjTextField1Lectura_kw().getText();
        String precio = this.vistaPrincipal.getjTextField1Precio_lectura().getText();
        
       

        try {
            this.servicioLectura.guardarLectura(puesto, fecha, lecturakw, precio);
            
            this.llenarComboPuesto_lectura();

            this.vistaPrincipal.getjTextField1Lectura_kw().setText("");
            this.vistaPrincipal.getjTextField1Precio_lectura().setText("");

            JOptionPane.showMessageDialog(null, "la lectura se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarContratoApretado() {
        Puesto puesto =  (Puesto) this.vistaPrincipal.getjComboBoxPuesto_contrato().getSelectedItem();

        Cliente cliente = (Cliente) this.vistaPrincipal.getjComboBox1Cliente_contrato().getSelectedItem();
        Integer diaInicio = (Integer) this.vistaPrincipal.getjComboBoxDia_fechaInicio_contrato().getSelectedItem();
        Integer mesInicio = (Integer) this.vistaPrincipal.getjComboBoxMes_fechaInicio_contrato().getSelectedItem();
        Integer añoInicio = (Integer) this.vistaPrincipal.getjComboBoxAño_fechaInicio_contrato().getSelectedItem();
        Integer diaFin = (Integer) this.vistaPrincipal.getjComboBoxDia_fechaFin__contrato1().getSelectedItem();
        Integer mesFin = (Integer) this.vistaPrincipal.getjComboBoxMes_fechaFin_contrato().getSelectedItem();
        Integer añoFin = (Integer) this.vistaPrincipal.getjComboBoxAño_fechaFin_contrato().getSelectedItem();
        String monto = this.vistaPrincipal.getjTextField1Monto_Contrato().getText();
        String fechaDeCancelacion = this.vistaPrincipal.getjTextField1FechaCancelacion_contrato().getText();
        String encargadoDelAlquiler = this.vistaPrincipal.getjTextField1EncargadoDelAlquiler_Contrato().getText();

    

        try {
            this.servicioContrato.guardarContrato(cliente, puesto, diaInicio, mesInicio, añoInicio, diaFin, mesFin, añoFin, monto, fechaDeCancelacion, encargadoDelAlquiler);
            
           this.vistaPrincipal.getjTextField1Monto_Contrato().setText("");
           this.vistaPrincipal.getjTextField1FechaCancelacion_contrato().setText("");
           this.vistaPrincipal.getjTextField1EncargadoDelAlquiler_Contrato().setText("");
            
            
            
            JOptionPane.showMessageDialog(null, "el contrato se guardo correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void mostrarTablaApretado() {
        ArrayList<Cliente> array = this.servicioCliente.obtenerTodosCliente();

        DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPrincipal.getjTable1Cliente().getModel();

        //limpiar los movimientos anteriores
        tablaModelo.setRowCount(0);

        //agregar los datos a las filas
        for (Cliente cliente : array) {
            Object[] datosCliente = {cliente.getIdcliente().toString(), cliente.getNombre(), cliente.getApellido(), cliente.getTelefono(), cliente.getDni(), cliente.getSexo()};
            tablaModelo.addRow(datosCliente);

        }

    }

    public void llenarComboCliente() {
        ArrayList<Cliente> clientes = this.servicioCliente.obtenerTodosCliente();

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(clientes.toArray());

        this.vistaPrincipal.getjComboBox1Cliente().setModel(modeloCombo);
        this.vistaPrincipal.getjComboBox1Cliente_contrato().setModel(modeloCombo);

    }

    public void eliminarClienteApretado() {
        Cliente cliente = (Cliente) this.vistaPrincipal.getjComboBox1Cliente().getSelectedItem();

        try {
            this.servicioCliente.eliminarCliente(cliente);
            JOptionPane.showMessageDialog(null, "el cliente ha sido eliminado");
            this.llenarComboCliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void llenarComboDimension_puesto() {

        ArrayList<Dimension> dimensiones = this.servicioDimension.obtenerTodosDimension();
        DefaultComboBoxModel modeloDimension = new DefaultComboBoxModel(dimensiones.toArray());

        this.vistaPrincipal.getjComboBox1Dimension_Puesto().setModel(modeloDimension);
//        this.vistaPrincipal.getjComboBoxPuesto_contrato().setModel(modeloDimension);

    }

    private void llenarComboTipoDePuesto_puesto() {
        ArrayList<TipoDePuesto> tiposPuestos = this.servicioTipo_de_Puesto.obtenerTodosTipoDePuesto();

        DefaultComboBoxModel modeloTipoPuestos = new DefaultComboBoxModel(tiposPuestos.toArray());

        this.vistaPrincipal.getjComboBox2TipoDePuesto_puesto().setModel(modeloTipoPuestos);

    }

    private void LlenarComboSector() {

        ArrayList<Sector> array = this.servicioSector.obtenerTodosSector();

        DefaultComboBoxModel modeloSector = new DefaultComboBoxModel(array.toArray());

        this.vistaPrincipal.getjComboBox3Sector_Puesto().setModel(modeloSector);

    }

    private void llenarComboPuesto_lectura() {
        ArrayList<Puesto> puestoss = this.servicioPuesto.obtenerTodos();

        DefaultComboBoxModel modeloPuestos = new DefaultComboBoxModel(puestoss.toArray());

        this.vistaPrincipal.getjComboBoxPuesto_lectura().setModel(modeloPuestos);
        this.vistaPrincipal. getjComboBoxPuesto_contrato().setModel(modeloPuestos);

    }

    public void guardarPuestoApretado() {
        Dimension dimension = (Dimension) this.vistaPrincipal.getjComboBox1Dimension_Puesto().getSelectedItem();
        TipoDePuesto tipoDePuesto = (TipoDePuesto) this.vistaPrincipal.getjComboBox2TipoDePuesto_puesto().getSelectedItem();
        Sector sector = (Sector) this.vistaPrincipal.getjComboBox3Sector_Puesto().getSelectedItem();

        try {
            this.servicioPuesto.guardarPuesto(dimension, tipoDePuesto, sector);
            this.llenarComboPuesto_lectura();

            JOptionPane.showMessageDialog(null, "el puesto se guardo correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
       private void rellenarComboDiaFin() {
        DefaultComboBoxModel diaFin = new DefaultComboBoxModel();

        diaFin.addElement(1);
        diaFin.addElement(2);
        diaFin.addElement(3);
        diaFin.addElement(4);
        diaFin.addElement(5);
        diaFin.addElement(6);
        diaFin.addElement(7);
        diaFin.addElement(8);
        diaFin.addElement(9);
        diaFin.addElement(10);
        diaFin.addElement(11);
        diaFin.addElement(12);
        diaFin.addElement(13);
        diaFin.addElement(14);
        diaFin.addElement(15);
        diaFin.addElement(16);
        diaFin.addElement(17);
        diaFin.addElement(18);
        diaFin.addElement(19);
        diaFin.addElement(20);
        diaFin.addElement(21);
        diaFin.addElement(22);
        diaFin.addElement(23);
        diaFin.addElement(24);
        diaFin.addElement(25);
        diaFin.addElement(26);
        diaFin.addElement(27);
        diaFin.addElement(28);
        diaFin.addElement(29);
        diaFin.addElement(30);
        diaFin.addElement(31);

       

        this.vistaPrincipal.getjComboBoxDia_fechaFin__contrato1().setModel(diaFin);

    }
       
       private void llenarComboContrato(){
       
       ArrayList<Contrato> arrayContrato = this.servicioContrato.obtenerTodosContrato();
       
       
       DefaultComboBoxModel modeloContrato = new DefaultComboBoxModel(arrayContrato.toArray());
       
       this.vistaPrincipal. getjComboBox1EliminarContrato_contrato().setModel(modeloContrato);
       
       
       }

    public void eliminarContratoApretado() {
       Contrato contrato = (Contrato) this.vistaPrincipal. getjComboBox1EliminarContrato_contrato().getSelectedItem();
        try {
             this.servicioContrato.eliminarContrato(contrato);
             this.llenarComboContrato();
             JOptionPane.showMessageDialog(null, "el contrato se elimino correctamente");
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
    }

    public void mostrarTablaDimension() {
       ArrayList<Dimension> arrayDimension = this.servicioDimension.obtenerTodosDimension();
       
       DefaultTableModel modeloTable = (DefaultTableModel) this.vistaPrincipal.getjTableDimension().getModel();
       
       modeloTable.setRowCount(0);
       
       
       for(Dimension dimension : arrayDimension){
       Object[] datosDimension ={dimension.getIddimension().toString(), dimension.getNombre(), dimension.getAncho(), dimension.getLargo()};
       
       modeloTable.addRow(datosDimension);
       
       
       
       }
    }

    public void mostrarTabla_puesto() {
       ArrayList<Puesto> arrayPuesto = this.servicioPuesto.obtenerTodos();
       
       DefaultTableModel modeloTabla = (DefaultTableModel) this.vistaPrincipal.getjTable1Puesto().getModel();
       
       modeloTabla.setRowCount(0);
       
       for(Puesto puesto : arrayPuesto){
    
    
    Object[] datosPuesto ={puesto.getIdpuesto().toString(), puesto.getDimension().getIddimension().toString(), puesto.getTipoDePuesto().getIdtipoDePuesto().toString(),
    puesto.getSector().getIdsector().toString()};
    
    modeloTabla.addRow(datosPuesto);
    
    }
    }

    public void mostrarReporteContrato() {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
           JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporte/report1.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, con);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
        
        
    }

    public void eliminarSectorApretado() {
        
        Sector sector = (Sector) this.vistaPrincipal.getjComboBox1Sector_sector().getSelectedItem();
        try {
            this.servicioSector.eliminarSector(sector);
            JOptionPane.showMessageDialog(null, "el sector fue eliminado");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    private void llenarComboSector_sector(){
    
    ArrayList<Sector> arraySector = this.servicioSector.obtenerTodosSector();
    
    DefaultComboBoxModel modelo = new DefaultComboBoxModel(arraySector.toArray());
    
    this.vistaPrincipal. getjComboBox1Sector_sector().setModel(modelo);
    
    
    }

    public void eliminarDimensionApretado() {
        
        Dimension dimension = (Dimension) this.vistaPrincipal. getjComboBox1Dimension_dimension().getSelectedItem();
        try {
            this.servicioDimension.eliminarDimension(dimension);
            JOptionPane.showMessageDialog(null, "la dimension se elimino correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void llenarComboDimension(){
    ArrayList<Dimension> array = this.servicioDimension.obtenerTodosDimension();
    
    
    DefaultComboBoxModel modeloDimension = new DefaultComboBoxModel(array.toArray());
    
    this.vistaPrincipal. getjComboBox1Dimension_dimension().setModel(modeloDimension);
    
    }

}
