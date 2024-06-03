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

        System.out.println("Estoy en la pantalla: "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir la pantalla: "+pilaPantallas.pop().getNombre());
        pilaPantallas.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t --> "+pilaPantallas.peek().getNombre());
    }
}
