/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

import java.util.Scanner;

/**
 *
 * @author XPC
 */
public class Ejercicio1 {
    
    int invertir(int numero, int inver){
        if(numero >0){
            return invertir(numero/10, numero %10 + inver *10);
        }
        else{
            return inver;
        }
    }
    
    public static void main(String[] args){
        Ejercicio1 NI = new Ejercicio1();
        Scanner sc = new Scanner(System.in);
        int numero, inver = 0;
        numero = sc.nextInt();
        System.out.println("El numero inverso es: " + NI.invertir(numero, inver));
    }
}
