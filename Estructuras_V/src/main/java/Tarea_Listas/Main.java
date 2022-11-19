/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Listas;

import java.util.Scanner;
import semana8.Persona;

/**
 *
 * @author XPC
 */
public class Main {
     public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese la posicion a buscar");
        numero = sc.nextInt();

        // Agregar a la lista
        lista.agregar(12);
        lista.agregar(15);
        lista.agregar(9);
        lista.agregar(41);
        lista.agregar(6);

        System.out.println("Lista");
        lista.listar();

        System.out.println("\n Se obtiene el valor del nodo en la posicion ingresada");
        System.out.println(lista.getValor(numero));
        System.out.println("\n Se obtiene el valor del nodo anterior a la posicion ingresada");
        System.out.println(lista.getValor(numero-1));
        
        //
        ListaCircular lc = new ListaCircular();
        System.out.println("Eliminar nodo");
        System.out.println("cual es el valor del nodo que quiere eliminar");
        lc.eliminar(numero);
        
        semana8.ListaDobleCircular prueba = new semana8.ListaDobleCircular();
        Persona a = new Persona(1,"Melanie");
        Persona b = new Persona(2,"Jose");
        Persona c = new Persona(3,"Jessica");
        Persona d = new Persona(4,"Mauricio");
        Persona e = new Persona(5,"Sofia");
        
        prueba.insertar(a);
        prueba.insertar(b);
        prueba.insertar(c);
        prueba.insertar(e);
        
        prueba.existe(2);
    }
}
