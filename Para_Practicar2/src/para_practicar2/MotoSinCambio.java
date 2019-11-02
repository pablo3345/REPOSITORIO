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
public class MotoSinCambio extends Moto{
    
    private int velocidadMaxima;

    public MotoSinCambio(int velocidadMaxima, String marca, String modelo, int cilindrada) {
        super(marca, modelo, cilindrada);
        this.velocidadMaxima = velocidadMaxima;
    }

  public int totalVelocidad(){
  
  return velocidadMaxima;
  
  
  
  }
    
    
    
}
