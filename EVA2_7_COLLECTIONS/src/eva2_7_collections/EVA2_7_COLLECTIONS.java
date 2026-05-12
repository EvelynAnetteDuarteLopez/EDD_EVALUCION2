/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author eveli
 */
public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Integer> lista = new LinkedList<Integer>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        //ARRAYLIST
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hola");
        arrayList.add(" ");
        arrayList.add("Mundo");
        arrayList.add("Cruel");
        arrayList.add("!!!");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println("Tamaño del arrayList = " + arrayList.size());
       System.out.println(arrayList);
       //QUEUE
       Queue<Integer> queue = new LinkedList<Integer>();
       queue.add(100);
       queue.add(200);
       queue.add(300);
       queue.add(400);
       System.out.println(queue.peek());//Lee el primer elemento
       System.out.println(queue.poll());//nuestro pop: lee y elimina el primer elemento
       System.out.println(queue);
       //STACK
       Stack<String> stack = new  Stack<String>();
       stack.push("Hola");
       stack.push(" ");
       stack.push("Mundo");
       stack.push("!!!");
       System.out.println(stack.peek());
       System.out.println(stack.pop());
       System.out.println(stack);
       
      

        
       
        
        
    }
    
}
