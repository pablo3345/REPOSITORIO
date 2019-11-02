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
public abstract class Moto {
    private String marca;
    private String modelo;
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    
    
    
    public abstract int totalVelocidad();
    
    
    
}
