/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author XPC
 */
public class Ejercicio2 {
    
    public String Ejercicio2(String palabra) {
            if (palabra.length() <= 1) {
                System.out.println(palabra);
                return palabra;
            }
            System.out.println(palabra);
            return Ejercicio2(palabra.substring(1)) + palabra.charAt(0);
        }
}
