/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar_pilagenerica_eliminar;

/**
 *
 * @author pablo
 */
public class Pila<E> {

    //declaro un array internos para almacenar los elementos de la pila
    private E[] elementos;

    private int indiceUltimoElementoVacio = 0;

    public Pila(E[] elementos) {
        this.elementos = elementos;
    }

    public void agregarElemento(E elemento) {

        //primero verfificar que si se pueden agregar elementos
        if (this.indiceUltimoElementoVacio >= this.elementos.length) {
            throw new IllegalArgumentException("la pila esta llena");
        }

        this.elementos[indiceUltimoElementoVacio] = elemento;

        indiceUltimoElementoVacio++;

    }

    public E quitarElemento() {

        //verificar que si se puedan quitar elementos
        if (this.indiceUltimoElementoVacio <= 0) {
            throw new IllegalArgumentException("la pila esta vacia");
        }

        this.indiceUltimoElementoVacio--;

        //ahora obtenemos el elemento que se quita
        E elementoQuitado = this.elementos[this.indiceUltimoElementoVacio];

        this.elementos[indiceUltimoElementoVacio] = null;

        return elementoQuitado;
    }

    public void mostrarArreglo() {
        
        for(int i =0; i<3; i++){
            System.out.println(this.elementos[i]);
        
        
        }

    }

}


