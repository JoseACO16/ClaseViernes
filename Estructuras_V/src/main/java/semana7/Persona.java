/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author XPC
 */
public class Persona {
    
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona() {
    }
    
    @Override
    public String toString(){
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
