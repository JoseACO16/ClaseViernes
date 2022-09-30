/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {

        int x;
        String cont;
        cont = JOptionPane.showInputDialog("Ingrese la tabla que desea multiplicar");
        x = Integer.parseInt(cont);
        JOptionPane.showMessageDialog(null, tablas(10, x));

    }

    public static String tablas(int num1, int x) {

        if (num1 == 1) {
            return x + " x " + 1 + " = " + x + "\n";

        } else {
            int b;
            b = num1;
            return tablas(num1 - 1, x) + x + " X " + b + " = " + (x * b) + "\n";

        }
    }
    
}
