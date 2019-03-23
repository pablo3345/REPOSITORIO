/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import conexion.Conexion;
import java.sql.Connection;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicio.ServicioCliente;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioCliente servivioCliente;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servivioCliente = new ServicioCliente();
    }

    public void GuardarApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        String apellido = this.vistaPrincipal.getjTextFieldApellido().getText();

        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp fecha = new java.sql.Timestamp(calendar.getTimeInMillis());

        try {
            this.servivioCliente.guardarCliente(nombre, apellido, fecha);

            this.vistaPrincipal.getjTextFieldNombre().setText("");
            this.vistaPrincipal.getjTextFieldApellido().setText("");
            JOptionPane.showMessageDialog(null, "el cliente se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void mostrarReporteApretado() {
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConexion();

        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report_1.jasper"));//asi se hace para que funcione el reporte en el ejecutable
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
    }
    

}
