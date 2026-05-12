/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author eveli
 */
public class LISTADOBLE {
    private Nodo inicio;// aqui inicia todo
   private Nodo fin;
   private int Longitud;
   
     public LISTADOBLE(){
     
       this.inicio=null;
       this.fin=null;
       this.Longitud=0;
    
     }
     
      public int longitud(){ 
      return Longitud;
      }
     
     public void imprimirLista(){
      
        Nodo temp= inicio;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getSiguiente();
            }
            
        System.out.println("");
    }
     
       public void ListaIn(){
      
        Nodo temp= fin;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getPrevio();
            }
            
        System.out.println("");
       
    }
     
      public void borrarLista(){
        
        inicio=null;
        fin=null;
        Longitud=0;
    }
      
     public boolean buscarNodo(){
        if (inicio==null){
            return false;
        }else{
            return true;
        }
        
    }
     
    public void agregarNodo(int valor){
    Nodo nuevo= new Nodo(valor);
        
        if (inicio==null){
            
            inicio = nuevo;
            fin=nuevo;
        }else{
        
        fin.setSiguiente(nuevo);
        nuevo.setPrevio(fin);
        fin =nuevo;
        
    }     
        Longitud++;
    }
    
    
     public void agregarEn(int posi, int valor){
        ///VALIDAR:
        ///DE INICIO (O) HASTA Y FIN (N-1) N--> LONGITUD
        int tama=longitud();
        
        if((posi<0) || (posi>=tama)){// POSICIÓN INCORRECTA
            throw  new RuntimeException("La posicion no existe en la lista");
        
        }else{
        
        Nodo nuevo= new Nodo(valor);
         // CASOS
        
        if(posi==0){// inicio de la lista
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            Longitud++;
        }else{// cualquier otra posicion
              //TENEMOS QUE MOVERNOS
            Nodo temp= inicio;
            int cont=0;
            
            while (cont<(posi-1)){ //temp tiene que quedar una posicion antes de posi
            temp=temp.getSiguiente();
            cont++;
            
            
            }
            //CONECTA
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
            temp.setPrevio(nuevo);
            Longitud++;
        }
       
        }
    }
     
     
     public int buscarEn(int posi){
         int tamaño = longitud();
         if((posi<0)||(posi>=tamaño)){
           throw  new RuntimeException("La posicion no existe en la lista");
         }else{
             Nodo temp = inicio;
             int cont=0;
             
             if(posi==0){
                 return temp.getValor();
             }
             
             while(cont<(posi)){
                 temp=temp.getSiguiente();
                 cont++;
             }
             return temp.getValor();
         }
     }
     
     public void borraEn(int posi){
        int tamaño = longitud();
         if((posi<0)||(posi>=tamaño)){
           throw  new RuntimeException("La posicion no existe en la lista");
         }else{
             
             if(posi==0){
                 Nodo borrar=inicio;
                 inicio=borrar.getSiguiente();
                 Longitud--;
             }else{
                 int cont=0;
                 Nodo temp=inicio;
                 
                 while(cont<(posi-1)){
                 temp=temp.getSiguiente();
                 cont++;
                 }
                 
                 Nodo borrar=temp.getSiguiente();
                 temp.setSiguiente(borrar.getSiguiente());
                 Longitud--;
                 
                 if(temp.getSiguiente()==null){
                     fin=temp;
                 }
             }
         }

         
     }
     
     
     
     
    
    
    
}
