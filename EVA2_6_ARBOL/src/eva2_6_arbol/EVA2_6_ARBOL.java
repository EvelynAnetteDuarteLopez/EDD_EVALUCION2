/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arbol;

/**
 *
 * @author eveli
 */
public class EVA2_6_ARBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBin arbol = new ArbolBin();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        System.out.println("");
        arbol.imprimirPreOrder();
        System.out.println("");
        arbol.imprimirInOrder();
        System.out.println("");
        arbol.imprimirPostOrder();
        
 
    }
    
}
