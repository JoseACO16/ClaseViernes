/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author XPC
 */
public class Ejercicio4 {
    public static  int suma (int i, int cantidad, int numero, int suma){
       
        if (i < cantidad) {
            suma = suma(i + 1, cantidad , numero,suma + numero);
        }
        return suma;
    }
    
}
