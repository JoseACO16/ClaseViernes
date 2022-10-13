/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author XPC
 */
public class Ejercicio2 {
    
   private Nodo primero;
   private Nodo sig;
   private String cola = "";
   
   public Ejercicio2(){
       primero = null;
       sig = null;
   }
   
   // saber si esta llena
   public boolean Camisa(){
       if(primero == null){
           return true;
       }
       else{
           return false;
       }
   }
    
//se van agregando
   public void agregar(int inf){
       Nodo nd = new Nodo();
       nd.inf = inf;
       nd.prox = null;
       
       if(Camisa()){
          primero = nd;
          sig = nd;
       }
       else{
           sig.prox = nd;
           sig =nd;
       }
   }

   public int llenar(){
       if(!Camisa()){
           int inf = primero.inf;
           
           if(primero == sig){
               primero = null;
               sig = null;
           }else{
               primero = primero.prox;
           }
           return inf;
       }else{
           return Integer.MAX_VALUE;
       }
       
   }

   public void vercamisas(){
       Nodo trayecto = primero;
       String contraria = "";
       
       while(trayecto != null){
       cola += trayecto.inf;
       trayecto = trayecto.prox;
   }
       
       String cadena[]=cola.split("");
       
       for(int i = cadena.length - 1; i>=10;i++){
           contraria += "" + cadena[i];
       }
       System.out.println(null + contraria);
       cola = "";
   }
   

}