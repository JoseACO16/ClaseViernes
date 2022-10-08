/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

/**
 *
 * @author XPC
 */
public class main {
    
    public static void main(String[] args) {
        //nodo y stack ... PILA
//        Stack<Integer> Pila = new Stack<Integer>();
//        Pila.push(1);
//        Pila.push(2);
//        Pila.push(3);
//        System.out.println(Pila.pop());
//        System.out.println(Pila.pop());
//        System.out.println(Pila.pop());
//        System.out.println(Pila.pop());
//        // boolean
//        System.out.println(Pila.encontrar(3));
        
        
        ////////////COLA///////////////
        
        Queue <Integer> prueba = new Queue <Integer> ();
        for(int i =0; i<101; i++){
            prueba.enqueue(i);
            
        }
        int temp = prueba.findByIndex(23).getValue();
        Queue <Integer> prueba2 = new Queue <Integer> ();
        prueba2.enqueue(temp);
        for(int i =0; i<100; i++){
            prueba2.enqueue(i);
            System.out.println("");
        }
    }
    
}
