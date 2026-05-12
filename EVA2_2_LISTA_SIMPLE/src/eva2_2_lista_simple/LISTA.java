/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class LISTA {
   private NODO inicio;//aqui inicia nuestra lista
   private NODO fin;
   private int longitud;
   
   public LISTA(){
       this.inicio= null;
       this.fin = null;//AL CREAR LA LISTA, esta vacia
       this.longitud = 0;
       //La compu solo puede ver un nodo a la vez
   }
   
   //AGREGAR UN NODO:
   //O(N) EFICIENCIA POR MOVERNOS NODO POR NODO
   //O(1)EFICIENCIA POR USAR UN NODO FIN
   public void agregar(int valor){
       NODO nuevo= new NODO(valor);
       //VAMOS A INSERTAR UN NODO AL FINAL DE LA LISTA
       //PERO
       //HAY QUE VERIFICAR QUE  ESTADO TIENE LA LISTA
       //LISTA VACIA
       if(inicio == null){
           inicio = nuevo; //agrega el nuevo nodo
           fin = nuevo;
       }else{
           //ESTO ES PARA MOVER A TEMP AL ULTIMO NODO
           NODO temp = inicio;
    while(temp.getSiguiente()!= null){
        //ESTO ES PARA MOVER A TEMP AL ULTIMO NODO
        temp = temp.getSiguiente();//mueve el temp al siguiente nodo
    }
       temp.setSiguiente(nuevo);//conectamos el nuevo nodo al ultimo nodo de la lista
       fin.setSiguiente(nuevo);//conectamos el nuevo nodo
       fin = nuevo;//movemos fin al ultimo nodo
       }
       longitud ++;
   }
   //EFICIENCIA O(N) ---> AGREGAR METODO IMPRIMIR ORDEN INVERSO
   public void imprimirLista(){
       NODO temp = inicio;
    while(temp != null){
        System.out.print("[" + temp.getValor() + "]");
        temp = temp.getSiguiente();
    }
    System.out.println("");
   }
   //EFICIENCIA: O(1)
   public void vaciarLista(){
    inicio=null;
    fin=null;
    longitud = 0;
}
   //EFICIENCIA: O(N) --->Hacerlo O(1)
   public int longitud(){
       int cont = 0;
       NODO temp= inicio;
          while(temp != null){
              cont++;
              temp = temp.getSiguiente();
    }
     return cont;
   }
   //
   public void agregarEn(int posi, int valor){
       //VALIDAR:
       //DE INICIO (O) HASTA Y FIN (N-1) -->LOGITUD
       int tama= longitud();
       if((posi < 0)||(posi >= tama)){
           throw new RuntimeException("La posicion no existe en la lista");
       }else{
           NODO nuevo = new NODO(valor);
       //Casos
           if(posi== 0){//inicia la lista
               nuevo.setSiguiente(inicio);
               inicio = nuevo;
               longitud++;
       }else{//cualquier otra posicion
             //TENEMOS QUE MOVERNOS
             NODO temp = inicio;
             int cont = 0;
             while(cont < (posi-1)){//temp tiene que quedar una posicion antes de posi
                  temp = temp.getSiguiente();
                  cont++;
             }
             //conectar
             nuevo.setSiguiente(temp.getSiguiente());
             temp.setSiguiente(nuevo);
               
           }
       
       }
   }
   //O(1)
   public boolean esVacia(){
       if(inicio == null)
           return true;
       else
           return false;  
   }
   //O(N)
   public int encontrarEn(int posi){
   int tama= longitud();
       if((posi < 0)||(posi >= tama)){
           throw new RuntimeException("La posicion no existe en la lista");
       }else{
       //Casos
       NODO nuevo= new NODO();
           if(posi== 0){//inicia la lista
               return inicio.getValor();
       }else{//cualquier otra posicion
             //TENEMOS QUE MOVERNOS
             NODO temp = inicio;
             int cont = 0;
             while(cont<(posi)){
                  temp = temp.getSiguiente();
                  cont++;
             }
             //conectar
             return temp.getValor();
               
           }
       }
   }
   
   public void borrarEn(int posi){
       int tama= longitud();
       if((posi < 0)||(posi >= tama)){
           throw new RuntimeException("La posicion no existe en la lista");
       }else{
       //Casos
           if(posi== 0){//inicia la lista
               inicio = inicio.getSiguiente();
             
       }else{//cualquier otra posicion
             //TENEMOS QUE MOVERNOS
             NODO temp = inicio;
             int cont = 0;
             while(cont < (posi-1)){//temp tiene que quedar una posicion antes de posi
                  temp = temp.getSiguiente();
                  cont++;
             }
             //desconectar
             NODO NodoBorrar=temp.getSiguiente();
             temp.setSiguiente(NodoBorrar.getSiguiente());
             if(temp.getSiguiente() == null)
                 fin=temp; 
           }
       }  
   }
   //O(N AL 2)
   public int imprimirListaIn(int posi){
       for(int i = longitud() -1; i >=0; i++){
           System.out.println("[" + encontrarEn(i) + "]");
       }
       System.out.println("");
       return 0;
   }
}
