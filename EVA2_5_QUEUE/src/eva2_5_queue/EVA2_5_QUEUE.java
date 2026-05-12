/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_queue;

/**
 *
 * @author eveli
 */
public class EVA2_5_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Cola cola= new Cola();
     cola.push(100);
     cola.push(200);
     cola.push(300);
     cola.push(400);
     cola.push(500);
     cola.imprimirLista();
     System.out.println("Primer elemento de la cola: "+ cola.pop());
     cola.pop();
     cola.imprimirLista();
      System.out.println("");
     cola.peek();
     System.out.println("");
     cola.push(1);
    }
    
}
