
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
            cabeza.setBack(tail); 
        } else{
            nuevoNodo.setBack(tail); 
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail); 
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
