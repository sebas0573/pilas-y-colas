package Ejercicio_03_linkedLists;

public class LinkedListEjr {
    class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    
    private Node head;

    
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public int getByPos(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("La lista está vacía.");
        }

       
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        
        int fromStart = length - position - 1;
        if (fromStart < 0) {
            throw new IndexOutOfBoundsException("Posición fuera de los límites de la lista.");
        }

       
        current = head;
        for (int i = 0; i < fromStart; i++) {
            current = current.next;
        }
        return current.value;
    }
    
}