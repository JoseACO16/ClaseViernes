/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author XPC
 */
public class List {
    
    
   private node<Persona> cabeza;
   
   public List(){
       
   }
   
   public void insertar(Persona value){
      node <Persona> nuevoNodo = new node <Persona>(value);
       if(cabeza==null){
           cabeza = nuevoNodo;
       }
       else if(cabeza.getValue().getId()>nuevoNodo.getValue().getId()){
           nuevoNodo.setNext(cabeza);
           cabeza=nuevoNodo;
       }
       else if(cabeza.getValue().getId()>nuevoNodo.getValue().getId() && cabeza.getNext() == null){
           cabeza.setNext(nuevoNodo);
       }
       else {
           node <Persona> aux = cabeza;
           while(aux.getNext() != null && aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()){
               aux=aux.getNext();
           }
           nuevoNodo.setNext(aux.getNext());
           aux.setNext(nuevoNodo);
}
   }

   
   public void imprimirLista(){
       node <Persona> aux = cabeza;
       while(aux!=null){
           System.out.println(aux.getValue().toString());
           aux=aux.getNext();
       }
   }
   
   
   public boolean existe(int id){
      boolean esta=false;
      
      //busca en lista, y retorna true si es una persona tiene el id
      //en la lista
      if(cabeza != null){   //si hay algo en la lista buscara
          node aux= cabeza;  //utilizando aux como indice
          
          //mientras no se acabe la lista y el elemento
          //de la lista sea menor que el buscador
          while(aux != null && aux.getDato().getId() < id){
              aux = aux.getNext(); // avanzo en la lista
          }
          //verdadero si lo encontro
          esta = (aux !=null && aux.getDato().getId()==id);
      }
      return esta;
  }
  
  public void modifica(Persona p){
      //busca si existe alguien con el id, lo actualiza
      if(cabeza != null){ //si hay algo en la lista buscare
          node aux = cabeza; //utilizando aux como indice
          //mientras no se acabe la lista y el elemento
          //de la lista sea menor que el buscador
          while(aux != null && aux.getDato().getId() < p.getId()){
              aux = aux.getNext();// avanzando en la lista
          }
          //si lo encuentra hago el cambio
          if(aux != null && aux.getDato().getId()==p.getId()){
              //solo basta cambiar nombre
              aux.getDato().setNombre(p.getNombre());
          }
          
      }
  }
  
  public void elimina(int id){
      //si una persona tiene el id lo elimina
      if(cabeza !=null){  //si hay algo en la lista buscara
          if(cabeza.getDato().getId()==id){
              cabeza = cabeza.getNext();
          }else{
              node aux = cabeza; //utilizando aux como indicew
              //mientras no se acabe la lista y el elemento
              //de la lista sea menor que el buscador
              while(aux.getNext() != null && aux.getNext().getDato().getId()<id){
                  aux = aux.getNext();//avanzo en la lista
              }
              //si es el adelamte....lo borro
              if(aux.getNext()!= null && aux.getNext().getDato().getId()== id){
                  aux.setNext(aux.getNext().getNext());
              }
          }
          
      }
  }
  
  public Persona extrae(int id){
      Persona p=null;
      //si una persona tiene el id, lo extrae (eliminando y retornando
      if(cabeza!= null){  //si hay algo en lista buscara
          if(cabeza.getDato().getId()==id){
              cabeza=cabeza.getNext();
          }else{
              node aux= cabeza;//utilizando aux como indice
              
              //mientras no se acabe la lista y el elemento
              //de la lista sea menor que el buscador
              
              while(aux.getNext() !=null && aux.getNext().getDato().getId()<id){
                  aux=aux.getNext();
              }
              //si  es el de adelante.... guardo persona y lo borro
              if(aux.getNext()!=null&&aux.getNext().getDato().getId()==id){
                  p= aux.getNext().getDato();
                  aux.setNext(aux.getNext().getNext());//cambio las referencias
              }
          }
      }
      return p;
  }
   
}