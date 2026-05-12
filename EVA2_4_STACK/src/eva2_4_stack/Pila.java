package eva2_4_stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eveli
 */
public class Pila {
   private Nodo inicio;// aqui inicia todo
   private Nodo fin;
   private int Longitud;
  
   
     public Pila(){
     
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
     
       public void imprimirListaIn(){
      
        Nodo temp= fin;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getPrevio();
            }
            
        System.out.println("");
       
    }
     
      public void vaciarLista(){
        
        inicio=null;
        fin=null;
        Longitud=0;
    }
      
     public boolean comprobarNodo(){
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
    
    
     public void borrarEn(int posi){
        ///VALIDAR:
        ///DE INICIO (O) HASTA Y FIN (N-1) N--> LONGITUD
        int tama=longitud();
        if((posi<0) || (posi>=tama)){// POSICIÓN INCORRECTA
            throw  new RuntimeException("La posicion no existe en la lista");
        }else{
        // CASOS
        if(posi==0){// inicio de la lista
            inicio=inicio.getSiguiente();
             if(inicio==null)
                 fin=inicio;
        }else{// cualquier otra posicion
              //TENEMOS QUE MOVERNOS
            Nodo temp= inicio;
            int cont=0;
            
            while (cont<posi-1){ //temp tiene que quedar una posicion antes de posi
            temp=temp.getSiguiente();
            cont++;
            
            
            }
            //DES-CONECTAR
            Nodo borrar=temp.getSiguiente();
            temp.setSiguiente(borrar.getSiguiente());
            Longitud++;
            
            if(temp.getSiguiente()==null){
                fin=temp;
            }
        }
       
        }
        
    }
     
     
    public void push(int valor){
        agregarNodo(valor);
    }
    
    public int peek(){
        if(fin !=null)
            return fin.getValor();
        else
            throw new RuntimeException("La pila esta vacia");  
    }
    
    public int pop(){
        int resu= peek();
        //BORRAR EL NODO (EL ULTIMO NODO)
        borrarEn(Longitud-1);
        return resu;

    }
}
