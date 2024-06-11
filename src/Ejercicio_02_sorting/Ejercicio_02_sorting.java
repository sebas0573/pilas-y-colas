package Ejercicio_02_sorting;
import java.util.Stack;

import Materia.Pilas.*;
public class Ejercicio_02_sorting {
    public static void sortPila(PilaGenerica<Integer> pila) {
        PilaGenerica<Integer> Pila = new PilaGenerica<Integer>();

        while (!Pila.isEmpty()) {
            int temp = Pila.pop();

            
            while (!Pila.isEmpty() && Pila.peek() > temp) {
                pila.push(Pila.pop());
            }
            Pila.push(temp);
        }

        while (!Pila.isEmpty()) {
            pila.push(Pila.pop());
        }

    }
    
    
}