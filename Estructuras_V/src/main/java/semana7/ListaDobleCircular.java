/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author XPC
 */
public class ListaDobleCircular {
    
    private node<Persona> head;
    private node<Persona> tail;
    
  public void insertar(Persona value){
      node <Persona> nuevoNodo = new node <Persona>(value);
       if(head==null){
           head = nuevoNodo;
           tail = head;
           tail.setNext(head);
       }
       else if(head.getValue().getId()> value.getId()){
           node <Persona> aux = nuevoNodo;
           aux.setNext(head);
           head = aux;
           tail.setNext(head);
       }
       else if(tail.getValue().getId()<= value.getId()){
           node <Persona> aux = nuevoNodo;
           tail.setNext(aux);
           tail = aux;
           tail.setNext(head);
       }
       else {
           node <Persona> aux = tail;
           while(aux.getNext().getValue().getId() < value.getId()){
               aux=aux.getNext();
               
           }
           node <Persona> Temp = nuevoNodo;
           Temp.setNext(aux.getNext());
           aux.setNext(Temp);
   }
  }
  
  public void imprimirLista(){
       node <Persona> aux = head;
       while(aux!=tail){
           System.out.println(aux.getValue().toString());
           aux=aux.getNext();
       }
       System.out.println(tail.getValue().toString());
   }
  
}
