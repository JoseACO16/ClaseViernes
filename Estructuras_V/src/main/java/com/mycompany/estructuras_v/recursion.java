/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuras_v;

/**
 *
 * @author XPC
 */
public class recursion {
        static int arr []={12, 34, 64, 2, 3, 90};
    
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            System.out.print(n);
            return n * factorial(n - 1);
        }
    }
    //encontrarmax (arr, 0,0)
public static int encontrarmax(int[]numeros, int indice, int max){
    if(indice!=numeros.length){
        
        if(numeros[indice]>max){
            System.out.print("/n");
            System.out.print(max);
            System.out.print(numeros[indice]);
            max= encontrarmax(numeros,indice +1,numeros[indice]);
        }
        else{
            System.out.print("/n");
            System.out.print(max);
            System.out.print(numeros[indice]);
            max= encontrarmax(numeros,indice +1,max);
        }

        }
return max;

}
}
