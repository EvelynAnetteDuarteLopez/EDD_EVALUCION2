/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_arbol;

/**
 *
 * @author eveli
 */
public class Nodo {
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;
    
    /// CONSTRUCTOR DEFAULT
    ///
public Nodo(){
    this.izquierda=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.derecha=null;//Va a marcar el fin de la lista
}

public Nodo(int valor){
    this.valor=valor;
    this.izquierda=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.derecha=null;
       
}
 

public Nodo getIzquierda(){ 
     return izquierda;
     
 }
 
  public void setIzquierda(Nodo izquierda){
     this.izquierda= izquierda;
 }

  
  public Nodo getDerecha(){ 
     return derecha;
     
 }
 
  public void setDerecha(Nodo derecha){
     this.derecha=derecha;
 }


public int getValor(){ 
     return valor;
     
 }
 
  public void setValor(){
     this.valor=valor;
 }
    
}
