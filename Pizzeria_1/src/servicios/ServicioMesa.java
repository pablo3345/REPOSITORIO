/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Mesa;
import repositorio.RepositorioMesa;

/**
 *
 * @author pablo
 */
public class ServicioMesa {
    private RepositorioMesa  repositorioMesa;

    public ServicioMesa() {
        this.repositorioMesa =new RepositorioMesa();
    }
    
    
    

    public void guardarMesa(String numero, String estado) {
        Mesa mesa = new Mesa(numero, estado);
        
        this.repositorioMesa.guardarMesa(mesa);
        
        
    }

    public ArrayList<Mesa> obtenerMesas() {
       ArrayList<Mesa> mesaArray = this.repositorioMesa.obtenerTodosMesas();
       
       return mesaArray;
    }
    
    
    public ArrayList<Mesa> mesasOcupadas(){
    
    ArrayList<Mesa> mesasOcup = this.repositorioMesa.obtenerMesasOcupadas();
    
    return mesasOcup;
    
    
    }
    
}
