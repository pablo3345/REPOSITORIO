/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Competencia;
import modelo.Deportista;

/**
 *
 * @author pablo
 */
public class RepositorioCompetencia {

    private static ArrayList<Competencia> competenciasGuardadas;

    public RepositorioCompetencia() {
        this.competenciasGuardadas = new ArrayList<>();
    }

    public void guardarCompetencia(Competencia competencia) {
       
        
     
        
        this.competenciasGuardadas.add(competencia);
    }

    public ArrayList<Competencia> obtenerCompetencias() {
        return this.competenciasGuardadas;

    }
    
        public ArrayList<Competencia> getMovimientosRelacionados(Deportista deportistass)
    {
        ArrayList<Competencia> movimientosRelacionados = new ArrayList<>();
        //cada casillero del Array va a tener una competencia, que es como un objeto que guarda valores (competencia puede tener cualquier nombre)
        for(Competencia competencia : this.competenciasGuardadas) {
            if 
                    (competencia.getADeportista().equals(deportistass)) 
                   
                 {
                movimientosRelacionados.add(competencia);
                
                //ese deportista es de la competencia, y la agrega a la lista de movimientosRelacionados
            }
        }
     
       
        return movimientosRelacionados;
        
       
      
       
    }
    
    
    
 
    
  

}





