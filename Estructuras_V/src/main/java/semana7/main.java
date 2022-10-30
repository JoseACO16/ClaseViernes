/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author XPC
 */
public class main {
    public static void main(String[] args) {
//        List Lista = new List();
//        Lista.insertar(new Persona(1,"P"));
//        Lista.insertar(new Persona(3,"P"));
//        Lista.insertar(new Persona(2,"P"));
//        Lista.imprimirLista();
        
        
        ListaDobleCircular Lista2 = new ListaDobleCircular();
        Lista2.insertar(new Persona(1, "P"));
        Lista2.insertar(new Persona(2, "P"));
        Lista2.insertar(new Persona(3, "P"));
        Lista2.insertar(new Persona(4, "P"));
        Lista2.imprimirLista();
        
    }
}
