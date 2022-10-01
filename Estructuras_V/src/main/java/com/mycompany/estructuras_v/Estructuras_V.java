/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructuras_v;

import Semana_3.Stack;
import Tarea1.Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author XPC
 */
public class Estructuras_V {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
// ejercicio en clase y similar al ejercicio 3 tarea
//        System.out.println();
//        int[] arr ={12, 34, 64, 2, 3, };
//        //System.out.println("hola mundo");
//        //System.out.println("Hello World!");
//        //System.out.println(recursion.factorial(3));
//        //System.out.println(recursion.encontrarmax(arr, 1, arr[0]));
//        //fghftxhrfh
//        System.out.println(recursion.encontrarmax(arr, 1, arr[0]));
        
        //ejercicio2
//        Ejercicio2 p = new Ejercicio2();
//        String palabra;
//        Scanner sc = new Scanner(System.in);
//        palabra = sc.next();
//        System.out.println("String recusivamente: " + p.Ejercicio2(palabra));

//main semana3
        Stack<Integer> Pila = new Stack<Integer>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(3);
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());

    }
}
