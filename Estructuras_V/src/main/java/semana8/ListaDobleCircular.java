/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

import semana8.Persona;
import semana8.node;

/**
 *
 * @author XPC
 */
public class ListaDobleCircular {
    
    
    private node<Persona> cabeza;
    private node<Persona> tail;


   public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            tail = cabeza;
            tail.setNext(cabeza);
            cabeza.setBack(tail); //
        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail); //
        } else if (tail.getValue().getId() <= value.getId()){
            nuevoNodo.setBack(tail); //
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail); //
        } else {
            node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);
            
            aux.getNext().setBack(nuevoNodo); //
            nuevoNodo.setBack(aux); //
        }
  
   }
   
   public boolean existe(int id){
       boolean valor = false;
       node<Persona> aux = cabeza;
       while(aux.getNext().getValue().getId()== id||aux.getNext()==cabeza){
           aux = aux.getNext();
       }
       if(aux.getNext().getValue().getId()==id){
           return true;
       }else{
           return false;
       }
   }
   public void modifica(Persona value){
       if(cabeza==null){
           System.out.println("no existe el valor");
       }else if(cabeza.getValue().getId()==value.getId()){
           cabeza.setValue(value);
       }else if(tail.getValue().getId()==value.getId()){
           tail.setValue(value);
       }else{
           node<Persona> aux = cabeza;
           while(aux.getNext().getValue().getId()==value.getId()||aux.getNext()==cabeza){
               aux=aux.getNext();
       }
           if(aux.getNext().getValue().getId()==value.getId()){
               aux.getNext().setValue(value);
           }else{
               System.out.println("el id no existe");
           }
       }
   }
   
   public void elimina(int id){
       if (cabeza == null) {
            System.out.println("no hay lista");
            
        } else if (cabeza.getValue().getId() == id) {
            
            cabeza = cabeza.getNext();
            cabeza.getBack().setNext(null);
            cabeza.getBack().setBack(null);
            tail.setNext(cabeza);
            cabeza.setBack(tail);
            
            
        } else if (tail.getValue().getId() == id) {
            
            tail = tail.getBack();
            tail.getNext().setBack(null);
            tail.getNext().setNext(null);
            tail.setNext(cabeza);
            cabeza.setNext(tail);
                        
        } else {
            node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() == id || aux.getNext() == cabeza) {
                aux = aux.getNext();
            }
            
            if (aux.getNext().getValue().getId() == id) {
                
                aux.setNext(aux.getNext().getNext());
                aux.getNext().setNext(aux);
                aux.getNext().setBack(null);
                aux.getNext().setNext(null);
            }   
        }   
    
   }
   
   public Persona extrae (int id){
    
        if (cabeza == null) {
            return null;



       } else if (cabeza.getValue().getId() == id) {
            
            return cabeza.getValue();



       } else if (tail.getValue().getId() <= id) {
            return tail.getValue();
        } else {
            node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() == id || aux.getNext() == cabeza) {
                aux = aux.getNext();
            }



           if (aux.getNext().getValue().getId() == id ) {
                return aux.getNext().getValue();
            } else {
                return null;
            }



       }
   }
   
   public void print(){
       node<Persona> aux =cabeza;
       int i=0;
       while(aux.getNext().getValue().getId()==aux.getNext().getValue().getId()||aux.getNext()==cabeza){
           System.out.println(i + ",["+ aux.getValue() + "]"+ "->");
           aux=aux.getNext();
           i++;
       }
   }

}

