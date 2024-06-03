package Materia.Models;

public class NodoGenerico<T> {

    public T data;
    public NodoGenerico<T> next;

    public NodoGenerico(T data){
        this.data = data;
    }
}
