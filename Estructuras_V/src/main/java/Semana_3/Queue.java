/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

/**
 *
 * @author XPC
 */
public class Queue<T> {
    
    //COLAS
    
    private node<T> head;
    private node<T> tail;
    
    public void enqueue(T value){
        node<T> newNode = new node<T>(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    
    public node<T> dequeue(){
        
        if(head==null){
            System.out.println("La cola esta vacia");
            return null;
        }
        else{
            node<T> firsInQueue=head;//retorna el nodo
            head=head.getNext();
            return firsInQueue;
        }
        

        
        }
    public node<T> findByIndex(int i){
        if(head == null){
        System.out.println("La cola esta vacia");
            return null;
    }
        else{
            node<T> temp = head;
            while(!temp.getNext().equals(null) && i!= 0){
                temp = temp.getNext();
                i--;
            }
            if(i ==0){
                return temp;
            }
            else{
                System.out.println("La cola no cuenta con muchos valores");
                return null;
            }
        }
            
    }        
            
}
