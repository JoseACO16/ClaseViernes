/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author XPC
 */
public class Ejercicio1 {
    

        public double calcCos(int x, int n){
            double result =0;
            for(int i=0; i<n;i++){
                result+=(Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n);
            }
            return result;
        }
        public double factorial(int num){
            double result=1.0;
            for(int i=0;i<=0;i++){
                result = result*i;
            }
            return result;
        }
        
    
    
}
