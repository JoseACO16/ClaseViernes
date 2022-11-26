/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

/**
 *
 * @author XPC
 */
public class main {
    public static void main(String[] args) {
        arbol a = new arbol();
        a.inserta(50);
        a.inserta(20);
        a.inserta(80);
        a.inserta(15);
        a.inserta(30);
        a.inserta(60);
        a.inserta(40);
        a.inserta(90);
        a.inserta(75);
        a.inserta(33);
        a.inserta(82);
        
        a.inOrden();
        
        //a.retornarAltura();
    }
}
