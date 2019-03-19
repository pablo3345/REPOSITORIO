/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import conexion.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicio.ServicioVendedor;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioVendedor servicioVendedor;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioVendedor = new ServicioVendedor();

    }

    public void guardarVendedorApretado() {
        String nombre = vistaPrincipal.getjTextFieldNombre().getText();
        String apellido = vistaPrincipal.getjTextFieldApellido().getText();
        String edad = vistaPrincipal.getjTextFieldEdad().getText();
        String sueldo = vistaPrincipal.getjTextFieldSueldo().getText();

        try {
            this.servicioVendedor.guardarVendedor(nombre, apellido, edad, sueldo);

            vistaPrincipal.getjTextFieldNombre().setText("");
            vistaPrincipal.getjTextFieldApellido().setText("");
            vistaPrincipal.getjTextFieldEdad().setText("");
            vistaPrincipal.getjTextFieldSueldo().setText("");

            JOptionPane.showMessageDialog(null, "el vendedor se guardo correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void llenarTabla() {

        ArrayList<Vendedor> vendedores = this.servicioVendedor.mostrarVendedor();

        DefaultTableModel modeloTabla = (DefaultTableModel) this.vistaPrincipal.getjTableVendedores().getModel();

        //limpiar la tabla
        for (int fila = 0; fila < modeloTabla.getRowCount(); fila++) {

            modeloTabla.setRowCount(0); //en ingles significa establecer numero de filas.

            //agregar los vendedores a la tabla
            for (Vendedor vendedor : vendedores) {
                //añadir vendedores a la tabla

                Object[] añadirTansferencia = {vendedor.getIdvendedor(), vendedor.getNombre(), vendedor.getApellido(), vendedor.getEdad(), vendedor.getSueldo()};
                modeloTabla.addRow(añadirTansferencia);

            }

        }

    }

    public void mostrarPlanillaApretado() {

        Conexion con = new Conexion();
        Connection conexion = con.getConexion();

        try {
            String rutaReporte = System.getProperty("user.dir") + "/src/reporter/reportVendedor.jasper";
            JasperReport jasperRport = (JasperReport) JRLoader.loadObjectFromFile(rutaReporte);
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, conexion);
            //ahora creamos el jasper view que nos permite ver nuestro reporte
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }

    }
}
