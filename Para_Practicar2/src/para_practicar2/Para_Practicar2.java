/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package para_practicar2;

/**
 *
 * @author pablo
 */
public class Para_Practicar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MotoConCambio motosConCambios = new MotoConCambio(40, 30, 25, "Honda", "Biz", 110);
        MotoSinCambio motosSinCambios = new MotoSinCambio(60, "Yamaha", "hiup", 60);
      
        
        mostrarVelocidadesMaximas(motosConCambios);
        mostrarVelocidadesMaximas(motosSinCambios);
        

    }
    
    private static void mostrarVelocidadesMaximas(Moto moto){
        System.out.println("la velocidad es "+moto.totalVelocidad() );
    
    
    
    }

}
