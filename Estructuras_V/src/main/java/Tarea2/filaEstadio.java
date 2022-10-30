/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author XPC
 */


public class filaEstadio <T>{
    
    private Nodo<T> tail;
    private Nodo<T> head;
    
    //
    
    public void filaEstadio(Entrada entrada) {
   
        
        Nodo<T> newNode = new Nodo<T>(entrada);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (entrada.getHora() < 21) {
                if (entrada.getSector() == "Palco" || entrada.getSector() == "palco") {
                    if (entrada.getHora() < head.getEntrada().getHora()) {
                        newNode.setNext(head);
                        head = newNode;
                    } else {
                        Nodo<T> temp = head;
                        while (entrada.getHora() >= head.getNext().getEntrada().getHora()) {
                            temp = temp.getNext();
                        }
                        if (entrada.getHora() == temp.getNext().getEntrada().getHora()) {
                            if (entrada.getCedula() < temp.getNext().getEntrada().getCedula()) {
                                newNode.setNext(temp.getNext());
                                temp.setNext(newNode);
                            } else {
                                newNode.setNext(temp.getNext().getNext());
                                temp.getNext().setNext(newNode);
                            }
                        } else {
                            newNode.setNext(temp.getNext());
                            temp.setNext(newNode);
                        }
                    }
                } else {
                    Nodo<T> temp = head;
                    while (temp.getNext().getEntrada().getSector() != "sombra" || temp.getNext().getEntrada().getSector() != null) {
                        if (temp.getNext() == null) {
                            temp.setNext(newNode);
                            tail = newNode;
                        } else {
                            if (entrada.getHora() < head.getEntrada().getHora()) {
                                newNode.setNext(head);
                                head = newNode;
                            } else {
                                temp = head;
                                while (entrada.getHora() >= head.getNext().getEntrada().getHora()) {
                                    temp = temp.getNext();
                                }
                                if (entrada.getHora() == temp.getNext().getEntrada().getHora()) {
                                    if (entrada.getCedula() < temp.getNext().getEntrada().getCedula()) {
                                        newNode.setNext(temp.getNext());
                                        temp.setNext(newNode);
                                    } else {
                                        newNode.setNext(temp.getNext().getNext());
                                        temp.getNext().setNext(newNode);
                                    }
                                } else {
                                    newNode.setNext(temp.getNext());
                                    temp.setNext(newNode);
                                }
                            }
                        }
                    }
                }
            } else {
            }
            System.out.println("error, hora incorreta");
        }
    }
}
