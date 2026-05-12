/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class NODO {
    private int valor;
    private NODO siguiente;
    //contructor default
    public NODO() {
        this.siguiente = null; //El siguiente tiene que ser null, va a marcar el fin de la lista
    }
    //contructor que acepte el valor
    public NODO(int valor) {
        this.valor = valor;
        this.siguiente = null;//va a marcar el fin de la lista
    }
    //metodos get y set
    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
    
}
