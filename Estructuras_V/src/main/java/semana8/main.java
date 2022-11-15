/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author XPC
 */
public class main {
    public static void main(String[] args) {
        ListaDobleCircular prueba = new ListaDobleCircular();
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
        prueba.extrae(3);
        prueba.modifica(e);
        prueba.print();
        prueba.elimina(3);
        prueba.print();
    }
}
