/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Listas;

/**
 *
 * @author XPC
 */
public class Lista {
    private Nodo inicio;
    private int tamano;

    public void Lista() {
        inicio = null;
        tamano = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamano;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamano++;
    }

    public int getValor(int posicion) throws Exception {

        if (posicion >= 0 && posicion < tamano) {
            if (posicion == 0) {
                return inicio.getValor();
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

    public void listar() {
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
