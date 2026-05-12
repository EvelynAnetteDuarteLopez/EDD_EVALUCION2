/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author eveli
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     LISTADOBLE listaDoble= new LISTADOBLE();
     listaDoble.agregarNodo(100);
     listaDoble.agregarNodo(200);
     listaDoble.agregarNodo(300);
     listaDoble.agregarNodo(400);
     listaDoble.agregarNodo(500);
     listaDoble.imprimirLista();
     listaDoble.ListaIn();
     listaDoble.buscarNodo();
     listaDoble.agregarNodo(3);
     listaDoble.imprimirLista();
     listaDoble.borraEn(2);
     listaDoble.agregarEn(1, 4);
     listaDoble.longitud();

    
        
    
     
    
    }
    
}
