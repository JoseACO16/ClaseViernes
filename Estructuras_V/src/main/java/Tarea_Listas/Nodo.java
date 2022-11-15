/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Listas;

import semana7.node;

/**
 *
 * @author XPC
 */
public class Nodo<T> {
   
    
    private T valor;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    
}
