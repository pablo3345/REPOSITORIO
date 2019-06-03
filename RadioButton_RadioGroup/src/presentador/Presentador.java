/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import servicio.ServicioEmpresa;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vista;
    private ServicioEmpresa servicioEmpresa;

    public Presentador(VistaPrincipal vista) {
        this.vista = vista;
        this.servicioEmpresa = new ServicioEmpresa();
    }

    public void guardarEmpresaApretado() {
        
        String mensaje ="El pais seleccionado es ";
        
        if(this.vista.getjRadioButton1Argentina().isSelected()){
        mensaje += "Argentina";
        
        }
        else if(this.vista.getjRadioButton2Chile().isSelected()){
        mensaje += "Chile";
        
        }
        else if(this.vista.getjRadioButton3Brasil().isSelected()){
        mensaje += "Brasil";
        
        }
        this.vista.getjLabel3().setText(mensaje);

        String nombre = this.vista.getjTextField1Empresa().getText();
        this.vista.getjRadioButton2Chile().setActionCommand("chile");
        this.vista.getjRadioButton3Brasil().setActionCommand("brasil");
        this.vista.getjRadioButton1Argentina().setActionCommand("argentina");

        String pais = this.vista.getButtonGroup1().getSelection().getActionCommand();
        
       

        try {
          

            this.servicioEmpresa.guardarEmpresa(nombre, pais);

            this.vista.getjTextField1Empresa().setText("");
            JOptionPane.showMessageDialog(null, "la empresa se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
