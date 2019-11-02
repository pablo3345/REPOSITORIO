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
public class MotoConCambio extends Moto{

    
    private int velocidadEnPrimera;
    private int velocidadEnSegunda;
    private int velocidadEnTercera;

    public MotoConCambio(int velocidadEnPrimera, int velocidadEnSegunda, int velocidadEnTercera, String marca, String modelo, int cilindrada) {
        super(marca, modelo, cilindrada);
        this.velocidadEnPrimera = velocidadEnPrimera;
        this.velocidadEnSegunda = velocidadEnSegunda;
        this.velocidadEnTercera = velocidadEnTercera;
    }
    
    
    public int totalVelocidad(){
        return velocidadEnPrimera + velocidadEnSegunda + velocidadEnTercera;
    
    
    
    
    }


    
}
