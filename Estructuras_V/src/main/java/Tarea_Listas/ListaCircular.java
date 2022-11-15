/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Listas;



/**
 *
 * @author XPC
 */
public class ListaCircular {
    
    
    Nodo primero;
    Nodo fin;

    public ListaCircular() {
        this.primero = null;
        this.fin = null;
    }
    
    public void eliminar(int valor){
        Nodo inicio = new Nodo();//actual
        Nodo ultimo = new Nodo();//anterior
        
        inicio = primero;
        ultimo = fin;
        
        do{
            if(inicio.getValor() == inicio){
                if(inicio ==primero){
                    primero=primero.getSiguiente();
                    fin.getSiguiente()=primero;
                }else if(inicio==fin){
                    ultimo.getSiguiente()=fin.getSiguiente();
                    fin=ultimo;
                }else{
                    ultimo.getSiguiente()=inicio.getSiguiente();
                }
            }
            ultimo=inicio;
            inicio=inicio.getSiguiente();
        }while(inicio !=primero);
    }
   
    
}
