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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Area;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import repositorio.RepositorioArea;
import servicio.ServicioArea;
import servicio.ServicioEmpleado;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioEmpleado ServicioEmpleado;
    private ServicioArea servicioArea;
    private RepositorioArea repositorioArea;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.ServicioEmpleado = new ServicioEmpleado();
        this.servicioArea = new ServicioArea();
        this.repositorioArea = new RepositorioArea();
        this.rellenarComboArea();

    }

    public void guardarEmpleadoApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        String apellido = this.vistaPrincipal.getjTextFieldApellido().getText();
        int idArea = Integer.parseInt(this.vistaPrincipal.getjTextField_Id_area().getText());
        Calendar cal = Calendar.getInstance();

        java.sql.Timestamp fecha = new java.sql.Timestamp(cal.getTimeInMillis());

        Area area = this.servicioArea.getArea(idArea);

        try {
            this.ServicioEmpleado.guardarEmpleado(area, nombre, apellido, fecha);

            this.vistaPrincipal.getjTextFieldNombre().setText("");
            this.vistaPrincipal.getjTextFieldApellido().setText("");

            JOptionPane.showMessageDialog(null, "el empleado se guardo correctamente");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }

    }

    public void guardarAreaApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombreArea().getText();
        String cantidad = this.vistaPrincipal.getjTextFieldCantidadEmpleados().getText();

        try {

            this.servicioArea.guardarArea(nombre, cantidad);
            this.vistaPrincipal.getjTextFieldNombreArea().setText("");
            this.vistaPrincipal.getjTextFieldCantidadEmpleados().setText("");

            JOptionPane.showMessageDialog(null, "el area se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void mostrarReporteArea_apretado() {
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConexion();
        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report1.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }

    }

    public void mostrarReporteEmpleado_apretado() {
        Conexion conexion2 = new Conexion();
        Connection conection2 = conexion2.getConexion();

        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/empleado.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, conection2);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }

    }

    public void areaConMenorEmpleados() {

        this.servicioArea.areaDeMenorEmpleados();

    }

    public void areaconMayorEmpleadosApretados() {
        this.servicioArea.areaDeMayorEmpleados();
    }
    
    public void rellenarComboArea(){
    ArrayList<Area> arrayArea = this.servicioArea.obtenerTodosArea();
    
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(arrayArea.toArray());
    
    this.vistaPrincipal. getjComboBoxAreaEliminar().setModel(modeloCombo);
    
    
    
    
    }

    public void eliminarAreaApretado() {
        Area area = (Area) this.vistaPrincipal. getjComboBoxAreaEliminar().getSelectedItem();
        
        try {
            this.servicioArea.eliminarArea(area);
            JOptionPane.showMessageDialog(null, "el area ha sido eliminada!");
            this.rellenarComboArea();
        } catch (IllegalArgumentException e) {
            JOptionPane.showInternalMessageDialog(null, e.getMessage());
        }
    }
       

}
