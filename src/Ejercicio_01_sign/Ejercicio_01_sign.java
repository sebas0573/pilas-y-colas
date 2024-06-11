package Ejercicio_01_sign;
import java.util.HashMap;
import java.util.Map;
import Materia.Pilas.PilaGenerica;

public class Ejercicio_01_sign{
    public boolean isValid(String s){
        Map<Character, Character> pares = new HashMap<>();
        pares.put(')', '(');
        pares.put('}', '{');
        pares.put(']', '[');
        
        // Pila para mantener los caracteres de apertura
        PilaGenerica<Character> pilaGenerica = new PilaGenerica<>();
        
        // Iterar sobre cada carácter en el string
        for (char c : s.toCharArray()) {
            // Si el carácter es de cierre
            if (pares.containsKey(c)) {
                // Verificar el carácter de apertura correspondiente de la cima de la pila
                char topElement = pilaGenerica.isEmpty() ? '#' : pilaGenerica.pop();
                if (topElement != pares.get(c)) {
                    return false;
                }
            } else {
                // Si es un carácter de apertura, agregarlo a la pila
                pilaGenerica.push(c);
            }
        }
        
        // Al final, la pila debe estar vacía si todos los caracteres fueron emparejados correctamente
        return pilaGenerica.isEmpty();
    }
    
}
