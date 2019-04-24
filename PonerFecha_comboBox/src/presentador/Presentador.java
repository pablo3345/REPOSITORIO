/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import conexion.Conexion;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicio.ServicioJugador;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioJugador servicioJugador;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioJugador = new ServicioJugador();
        this.rellenarComboDia();
        this.rellenarComboMes();
        this.rellenarComboAño();
    }

    public void rellenarComboDia() {

        DefaultComboBoxModel<Object> modeloComboDia = new DefaultComboBoxModel();

        modeloComboDia.addElement(1);
        modeloComboDia.addElement(2);
        modeloComboDia.addElement(3);
        modeloComboDia.addElement(4);
        modeloComboDia.addElement(5);
        modeloComboDia.addElement(6);
        modeloComboDia.addElement(7);
        modeloComboDia.addElement(8);
        modeloComboDia.addElement(9);
        modeloComboDia.addElement(10);
        modeloComboDia.addElement(11);
        modeloComboDia.addElement(12);
        modeloComboDia.addElement(13);
        modeloComboDia.addElement(14);
        modeloComboDia.addElement(15);
        modeloComboDia.addElement(16);
        modeloComboDia.addElement(17);
        modeloComboDia.addElement(18);
        modeloComboDia.addElement(19);
        modeloComboDia.addElement(20);
        modeloComboDia.addElement(21);
        modeloComboDia.addElement(22);
        modeloComboDia.addElement(23);
        modeloComboDia.addElement(24);
        modeloComboDia.addElement(25);
        modeloComboDia.addElement(26);
        modeloComboDia.addElement(27);
        modeloComboDia.addElement(28);
        modeloComboDia.addElement(29);
        modeloComboDia.addElement(30);
        modeloComboDia.addElement(31);

        this.vistaPrincipal.getjComboBoxDia().setModel(modeloComboDia);

    }

    public void rellenarComboMes() {

        DefaultComboBoxModel<Object> modeloComboMes = new DefaultComboBoxModel<>();

        modeloComboMes.addElement("enero");
        modeloComboMes.addElement("febrero");
        modeloComboMes.addElement("marzo");
        modeloComboMes.addElement("abril");
        modeloComboMes.addElement("mayo");
        modeloComboMes.addElement("junio");
        modeloComboMes.addElement("julio");
        modeloComboMes.addElement("agosto");
        modeloComboMes.addElement("septiembre");
        modeloComboMes.addElement("octubre");
        modeloComboMes.addElement("noviembre");
        modeloComboMes.addElement("diciembre");

        this.vistaPrincipal.getjComboBoxMes().setModel(modeloComboMes);

    }

    public void rellenarComboAño() {
        DefaultComboBoxModel<Object> modeloComboAño = new DefaultComboBoxModel<>();

        modeloComboAño.addElement(1978);
        modeloComboAño.addElement(1979);
        modeloComboAño.addElement(1980);
        modeloComboAño.addElement(1981);
        modeloComboAño.addElement(1982);
        modeloComboAño.addElement(1983);
        modeloComboAño.addElement(1984);
        modeloComboAño.addElement(1985);
        modeloComboAño.addElement(1986);
        modeloComboAño.addElement(1987);
        modeloComboAño.addElement(1988);
        modeloComboAño.addElement(1989);
        modeloComboAño.addElement(1990);
        modeloComboAño.addElement(1991);
        modeloComboAño.addElement(1992);
        modeloComboAño.addElement(1993);
        modeloComboAño.addElement(1994);
        modeloComboAño.addElement(1995);
        modeloComboAño.addElement(1996);
        modeloComboAño.addElement(1997);
        modeloComboAño.addElement(1998);
        modeloComboAño.addElement(1999);
        modeloComboAño.addElement(2000);
        modeloComboAño.addElement(2001);
        modeloComboAño.addElement(2002);
        modeloComboAño.addElement(2003);
        modeloComboAño.addElement(2004);
        modeloComboAño.addElement(2005);
        modeloComboAño.addElement(2006);
        modeloComboAño.addElement(2007);
        modeloComboAño.addElement(2008);
        modeloComboAño.addElement(2009);
        modeloComboAño.addElement(2010);
        modeloComboAño.addElement(2011);
        modeloComboAño.addElement(2012);
        modeloComboAño.addElement(2013);
        modeloComboAño.addElement(2014);
        modeloComboAño.addElement(2015);
        modeloComboAño.addElement(2016);
        modeloComboAño.addElement(2017);
        modeloComboAño.addElement(2018);
        modeloComboAño.addElement(2019);

        this.vistaPrincipal.getjComboBoxAño().setModel(modeloComboAño);

    }

    public void guardarJugadorApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        Integer diaNacimiento = (Integer) this.vistaPrincipal.getjComboBoxDia().getSelectedItem();
        String mesNacimiento = (String) this.vistaPrincipal.getjComboBoxMes().getSelectedItem();
        Integer añoNacimiento = (Integer) this.vistaPrincipal.getjComboBoxAño().getSelectedItem();

        try {
            this.servicioJugador.guatdarJugador(nombre, diaNacimiento, mesNacimiento, añoNacimiento);

            this.vistaPrincipal.getjTextFieldNombre().setText("");

            JOptionPane.showMessageDialog(null, "el jugador se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void mostrarReporteApretado() {

        //ahora voy a llamar al reporte que teniamos
        Conexion conexion1 = new Conexion();
        Connection connection1 = conexion1.getConexion();

        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report1.jasper"));//aca agregamos todas las librerias xq nos va a marcar error
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, connection1); //null significa que no le pasamos ningun parametro
            JasperViewer view = new JasperViewer(print, false);//el jasper view nos va a permitir ver nuestro reporte
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());

        }

    }

}
