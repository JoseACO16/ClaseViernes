/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

/**
 *
 * @author XPC
 */
public class arbol {
    
    private nodo raiz;
    private int altura;
    
    public void inserta(int value){
        if(raiz == null){
            raiz = new nodo(value);
        }else{
            insertar(raiz, value);
        }
    }
    
    public void insertar(nodo node, int value){
        if(value <= node.getId()){
            if(node.getHijoIzq() == null){
                node.setHijoIzq(new nodo(value));
            }else{
                insertar(node.getHijoIzq(), value);
            }
        }else{
            if(node.getHijoDer()==null){
                node.setHijoDer(new nodo(value));
            }else{
                insertar(node.getHijoDer(), value);
            }
        }
    }
    
    public void inOrden(){
        if(raiz != null){
            inOrdenRecorrer(raiz);
        }else{
            System.out.println("arbol vacio.");
        }
    }
    
    private void inOrdenRecorrer(nodo node){
        if(node !=null){
            inOrdenRecorrer(node.getHijoIzq());
            System.out.println(node.getId()+ " , ");
            inOrdenRecorrer(node.getHijoDer());
        }
    }
    
    private void retornarAltura(nodo node, int nivel){
        if(node != null){
            retornarAltura(node.getHijoIzq(), nivel + 1);
            if(nivel>altura){
                altura=nivel;
            }
            System.out.println("en este momento, gire a la derecha" + node.getId());
            retornarAltura(node.getHijoDer(), nivel + 1);
        }
    }
    
    public int retornarAltura(){
        altura =0;
        retornarAltura(raiz, 1);
        System.out.println(altura);
        return altura;
    }
}
