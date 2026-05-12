/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_queue;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class Nodo {
  private int valor;
    private Nodo siguiente;
    private Nodo previo;
    
    /// CONSTRUCTOR DEFAULT
    ///
public Nodo(){
    this.siguiente=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.previo=null;
}

public Nodo(int valor){
    this.valor=valor;
    this.siguiente=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.previo=null;
       
}
 

public Nodo getSiguiente(){ 
     return siguiente;
     
 }
 
  public void setSiguiente(Nodo siguiente){
     this.siguiente=siguiente;
 }

  
  public Nodo getPrevio(){ 
     return previo;
     
 }
 
  public void setPrevio(Nodo previo){
     this.previo=previo;
 }


public int getValor(){ 
     return valor;
     
 }
 
  public void setValor(){
     this.valor=valor;
 }
    
    
    
    
    
    
    
}
