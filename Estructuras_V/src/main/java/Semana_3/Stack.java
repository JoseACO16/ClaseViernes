/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

/**
 *
 * @author XPC
 */
public class Stack<T> { 
    
     // nuestros atributos
    
    private node<T> top;
    
    
    public void push(T value){
        node<T> newNode = new node<T> (value);
        if(top==null){
            top=newNode;
        }else{
            newNode.setNext(top);
            top=newNode;
            
        }
        
        
    }
    
    public T pop(){
        node<T> popped_value = top;
        if(top!=null){
            top=top.getNext();
            return popped_value.getValue();
        }else{
            return null;
        }
        
        
    }
    
    public boolean encontrar(T x){
        
        boolean existe = false;
        
        node<T> aux = top;
        
        while( existe != true && aux != null){
         
            if (x == aux.getValue()) {
                existe = true;
            }else{
                aux = aux.getNext();
            }
            
        }
        return existe;
    }

}
