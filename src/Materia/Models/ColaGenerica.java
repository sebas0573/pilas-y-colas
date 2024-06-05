package Materia.Models;

import java.util.NoSuchElementException;

public class ColaGenerica <T>{

    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int size;
    

    public void addNode (T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if (isEmpty()) {
            first= nuevoNodo;
            last=nuevoNodo;
        }else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
        size ++;
    }

    public T remove (){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia: ");
        }

        T value = first.data;
        first= first.next;

        if (first==null) {
            last=null;
        }
        size --;
        return value;
    }

    public T peek (){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");

        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return size;
    }
    
    
}