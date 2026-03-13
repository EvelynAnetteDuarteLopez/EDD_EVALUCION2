/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_referencias;

/**
 *
 * @author Evelyn Anette Duarte Lopez
 */
public class EVA2_1_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Ejemplo miObj=new Ejemplo();
    miObj.valor =100;
    miObj.otro =new Ejemplo();
    miObj.otro.valor = 200;
    miObj.otro.otro = new Ejemplo();
    miObj.otro.otro.valor = 300;
    //System.out.println("MiObj = " + miObj.valor);
    //System.out.println("MiObj = " + miObj.otro.valor);
    //System.out.println("MiObj = " + miObj.otro.otro.valor);
    Ejemplo temp = miObj;
    while(temp != null){
        System.out.println("Valor = " + temp.valor);
        temp = temp.otro;
    }
          
    }
    
}

class Ejemplo{
    int valor;
    Ejemplo otro;
}
