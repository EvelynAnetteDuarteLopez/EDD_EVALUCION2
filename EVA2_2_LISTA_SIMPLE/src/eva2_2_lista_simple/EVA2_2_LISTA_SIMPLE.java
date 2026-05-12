/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //long ini, fin, tiempo;
        LISTA lista= new LISTA();
        /*int[]arreglo = new int[1000000];
        ini = System.nanoTime();
        //operacion
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*1000);
        }
        fin = System.nanoTime();
        tiempo= fin - ini; //tiempo en nanosegundos (mil millonesimas de segundos)
        System.out.println("Arreglo = " + tiempo);
        
        for(int i = 0; i < 1000000; i++){
            lista.agregar((int)(Math.random()*1000));
        }
        fin = System.nanoTime();
        tiempo= fin - ini; //tiempo en nanosegundos (mil millonesimas de segundos)
        System.out.println("Lista = " + tiempo);
        System.out.println("Tamaño");
        lista.vaciarLista();
        lista.imprimirLista();*/
        
        
        
        
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimirLista();
        System.out.println("Cantidad de nodos: " + lista.longitud());
        lista.agregarEn(2, 400);
        lista.imprimirLista();
        System.out.println("Cantidad de nodos: " + lista.longitud());
        System.out.println("Valor encontrado: " + lista.encontrarEn(5));
        lista.borrarEn(1);
        lista.imprimirLista();
        lista.imprimirListaIn(1);
        
    
     
    }
    
}
