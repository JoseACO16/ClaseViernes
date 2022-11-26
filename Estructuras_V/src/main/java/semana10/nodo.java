/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

/**
 *
 * @author XPC
 */
public class nodo {
    private int id;
    private nodo HijoIzq;
    private nodo HijoDer;

    public nodo(int id) {
        this.id = id;
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public nodo getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(nodo HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public nodo getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(nodo HijoDer) {
        this.HijoDer = HijoDer;
    }

  
    
    
}
