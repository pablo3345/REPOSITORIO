/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Compra;
import modelo.CompraProducto;
import modelo.Producto;
import repositorio.RepositorioCompraProducto;
import repositorio.RepositorioProducto;

/**
 *
 * @author pablo
 */
public class ServicioCompraProducto {

    private RepositorioCompraProducto repositorioCompraProducto;
    private RepositorioProducto repositorioProducto;

    public ServicioCompraProducto() {
        this.repositorioCompraProducto = new RepositorioCompraProducto();
        this.repositorioProducto = new RepositorioProducto();

    }

    public void guardarCompraProducto(Compra compras, Producto productos, String cantidad, String precioUnitarioo) {
        int cantidadConvertida = this.validarCantidad(cantidad);
        double precioUnitarioConvertido = this.validarPrecioUnitario(precioUnitarioo);

        CompraProducto compraProducto = new CompraProducto(compras, productos, cantidadConvertida, precioUnitarioConvertido);

        this.repositorioCompraProducto.guardarcompraProducto(compraProducto);

    }

    private int validarCantidad(String cantidad) {

        try {
            int cantidadParseada = Integer.parseInt(cantidad);
            return cantidadParseada;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }

    }

    private double validarPrecioUnitario(String precioUnitario) {

        try {
            double precioUnitarioParseado = Double.parseDouble(precioUnitario);
            return precioUnitarioParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("precio unitario incorrecto");
        }

    }

    public List<CompraProducto> obtenerTodosCompraProducto() {

        List<CompraProducto> todos = this.repositorioCompraProducto.obtenerTodosCompraProductos();

        return todos;

    }

    public void eliminarCompraProducto(CompraProducto compraProductoseleccionado) {

        this.repositorioCompraProducto.eliminarCompraProducto(compraProductoseleccionado);

    }

    public void actualizarStock(int ID_producto, Producto producto) {
        String mensaje = "";

        ArrayList<CompraProducto> compraProductos = this.repositorioCompraProducto.obtenerTodosPorProducto(ID_producto);
        int total = 0;
        total = producto.getStockActual();
        // double precioActual = 0;

        for (CompraProducto compraProducto : compraProductos) {

            total += compraProducto.getCantidad();
            // precioActual = compraProducto.getPrecioUnitario();

        }
        if (total >= 50) {
            JOptionPane.showMessageDialog(null, "STOCK COMPLETO");

        }

        JOptionPane.showMessageDialog(null, "El stock actual es de: " + total);

    }

    public ArrayList<CompraProducto> obtenerParaLaTabla() {

        ArrayList<CompraProducto> obtenerTabla = this.repositorioCompraProducto.obtenerTodosCompraProductos();

        return obtenerTabla;

    }

    public void obtenerCompraProductoPorCompra(int idCompra, Compra compra) {

        String mensaje = "";
        ArrayList<CompraProducto> obtenerCompraProductoPorCompra = this.repositorioCompraProducto.obtenerTodosPorCompra(idCompra);

        double a = 0;
        double b = 0;
        int c = 0;

        a = compra.getMontoTotal();

        obtenerCompraProductoPorCompra.get(obtenerCompraProductoPorCompra.size() - 1);

        for (CompraProducto comPro : obtenerCompraProductoPorCompra) {

            b = comPro.getPrecioUnitario();
            c = (int) (a / b);

        }

        JOptionPane.showMessageDialog(null, "ultimo precio unitario de los detalles compra " + b + "y la cantidad de productos es de : " + c);

    }

}
