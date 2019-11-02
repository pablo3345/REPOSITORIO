package modelo;
// Generated 04/06/2019 20:45:43 by Hibernate Tools 4.3.1



/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private Integer idarticulo;
     private Empleado empleado;
     private int cantidadVendida;
     private double precioUnitario;

    public Articulo() {
    }

    public Articulo(Empleado empleado, int cantidadVendida, double precioUnitario) {
       this.empleado = empleado;
       this.cantidadVendida = cantidadVendida;
       this.precioUnitario = precioUnitario;
    }
   
    public Integer getIdarticulo() {
        return this.idarticulo;
    }
    
    public void setIdarticulo(Integer idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public int getCantidadVendida() {
        return this.cantidadVendida;
    }
    
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }




}


