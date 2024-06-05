import Materia.Models.Cola;
import Materia.Models.ColaGenerica;
import Materia.Pilas.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en la cima de la pila: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la cima de la pila: "+pila.peek());
        

        System.out.println();

        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Menu Page", "/home"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Settings Page", "/home/menu/settings"));
        System.out.println("La cola tiene "+pilaPantallas.size()+ " elementos");

        System.out.println("Estoy en la pantalla: "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir la pantalla: "+pilaPantallas.pop().getNombre());
        pilaPantallas.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t --> "+pilaPantallas.peek().getNombre());
        System.out.println("La cola tiene "+pilaPantallas.size()+ " elementos");

        ////Implementacion de cola generica tipo pantalla
        Cola queue = new Cola();
        ////Añadir elementos a la cola
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        ////Mostrar el elemento en el frente
        System.out.println("Elemento en el frente: "+queue.peek());//10
        ////Retirar elementos de la cola
        System.out.println("Elemento retirado: "+queue.remove());//10
        System.out.println("Elemento en el frente: "+queue.peek());//10

        System.out.println("Elemento retirado: "+queue.remove());//20
        System.out.println("Elemento en el frente: "+queue.peek());//10

        ////verificar si la cola esta vacia
        System.out.println("¿Cola vacia?: "+(queue.isEmpty() ? "Si" : "No"));//false

        ColaGenerica<Pantalla> colaPantallas = new ColaGenerica<>();
        colaPantallas.addNode(new Pantalla("Menu Page", "/home"));
        colaPantallas.addNode(new Pantalla("Menu Page", "/home/menu"));
        colaPantallas.addNode(new Pantalla("Settings Page", "/home/menu/settings"));
        System.out.println("La cola tiene "+colaPantallas.size()+ " elementos");

        System.out.println("Estoy en la pantalla: "+colaPantallas.peek().getNombre());
        System.out.println("Destruir la pantalla: "+colaPantallas.remove().getNombre());
        colaPantallas.addNode(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t --> "+colaPantallas.peek().getNombre());
        System.out.println("La cola tiene "+colaPantallas.size()+ " elementos");
    }

}
