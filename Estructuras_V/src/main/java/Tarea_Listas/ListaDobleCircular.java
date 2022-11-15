
package Tarea_Listas;

import semana8.Persona;
import semana8.node;

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
            nuevoNodo.setBack(tail); 
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail); 
        } else {
            node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);
            
            aux.getNext().setBack(nuevoNodo); 
            nuevoNodo.setBack(aux); 
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
}
