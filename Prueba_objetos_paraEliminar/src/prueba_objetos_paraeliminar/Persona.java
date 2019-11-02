/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_objetos_paraeliminar;

/**
 *
 * @author pablo
 */
public class Persona {
    private String nombre;
    private int edad;
    private Cuerpo cuerpoDeLaPersona;
    private Fecha  inicioDeDeporte;
    private TipoDeDeporte tipoDeDeporte;

    public Persona(String nombre, int edad, Cuerpo cuerpoDeLaPersona, Fecha inicioDeDeporte, TipoDeDeporte tipoDeDeporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuerpoDeLaPersona = cuerpoDeLaPersona;
        this.inicioDeDeporte = inicioDeDeporte;
        this.tipoDeDeporte = tipoDeDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Cuerpo getCuerpoDeLaPersona() {
        return cuerpoDeLaPersona;
    }

    public Fecha getInicioDeDeporte() {
        return inicioDeDeporte;
    }

    public TipoDeDeporte getTipoDeDeporte() {
        return tipoDeDeporte;
    }
    
    
    
    
}
