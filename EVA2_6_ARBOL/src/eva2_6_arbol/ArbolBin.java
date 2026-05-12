/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_arbol;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class ArbolBin {
    private Nodo raiz;
    
    public ArbolBin(){
        raiz= null; //arbol vacio
    }
    
    public void agregar(int valor){
        //VERIFICAMOS SI HAY NODOS EN EL ARBOL
        //SI EL ARBOL ESTA VACIO: FACIL
        if(raiz == null){
            raiz = new Nodo(valor);
        }else{//recursividad
            agregarRecu(raiz, valor);
            
        }
    }
    //O(log2N)--->SOLO SI EL ARBOL ESTA BALEANCEADO
    //O(N)---> CUANDO EL ARBOL NO ES BALANCEADO
    private void agregarRecu(Nodo actual, int valor){
        if(valor < actual.getValor()){//LADO IZQUIERDO
            if(actual.getIzquierda()== null){//Espacio disponible
                //insertamos
                Nodo nuevo = new Nodo(valor);
                actual.setIzquierda(nuevo);//agregamos el nuevo nodo a la izquierda
   
            }else{//Espacio ocupado
                //Movernos
                agregarRecu(actual.getIzquierda(), valor);
            }
            
        }
        if(valor > actual.getValor()){//LADO DERECHO
            if(actual.getDerecha()== null){//Espacio disponible
                //insertamos
                Nodo nuevo = new Nodo(valor);
                actual.setDerecha(nuevo);//agregamos el nuevo nodo a la izquierda
   
            }else{//Espacio ocupado
                //Movernos
                agregarRecu(actual.getDerecha(), valor);
            }   
        }
    }
    
    public void imprimirPreOrder(){
        imprimirPreOrderRec(raiz); //iniciamos en root
        
    }
    //O(N)--> IMPRIMIR (VISITAR) TODOS LOS NODOS DEL ARBOL
    public void imprimirPreOrderRec(Nodo actual){
        if(actual != null){
            System.out.print("[" + actual.getValor() + "]");//visitar el nodo
            //recorrer el lado izq
            imprimirPreOrderRec(actual.getIzquierda());
            //recorrer el lado derecho
            imprimirPreOrderRec(actual.getDerecha());

        }   
    }
    
    public void imprimirInOrder(){
        imprimirPreOrderRec(raiz); //iniciamos en root
        
    }
    //O(N)--> IMPRIMIR (VISITAR) TODOS LOS NODOS DEL ARBOL
    public void imprimirInOrderRec(Nodo actual){
        if(actual != null){
            System.out.print("[" + actual.getValor() + "]");//visitar el nodo
            //recorrer el lado izq
            imprimirPreOrderRec(actual.getIzquierda());
            //recorrer el lado derecho
            imprimirPreOrderRec(actual.getDerecha());

        }
    }
    
    public void imprimirPostOrder(){
        imprimirPostOrderRec(raiz);
    }
    
    public void imprimirPostOrderRec(Nodo actual){
        if(actual != null){
            System.out.print("[" + actual.getValor() + "]");//visitar el nodo
            //recorrer el lado izq
            imprimirPostOrderRec(actual.getIzquierda());
            //recorrer el lado derecho
            imprimirPostOrderRec(actual.getDerecha());

        }
        
        
    }
}
