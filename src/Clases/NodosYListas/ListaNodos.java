package Clases.NodosYListas;
import Clases.Objetos.*;

public class ListaNodos {
    private NodoDoble head;
    private NodoDoble tail;

    public ListaNodos() {
        this.head = null;
        this.tail = null;
    }


    public void insertarAlFinalConCola(Pokemon pokemon) {
        NodoDoble nuevoNodo = new NodoDoble(pokemon);

        //Se verifica si no hay nodos con datos con anterioridad en la lista, si no existen, se agrega el nuevo nodo como la cabezera.
        if (this.tail == null) {
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
            return;
        }

        this.tail.setNext(nuevoNodo);
        nuevoNodo.setPrevious(this.tail);
        this.tail = nuevoNodo;
    }

    public void recorrerAdelante() {
        NodoDoble aux = this.head;
        while(aux != null) {
            System.out.println(aux.getPokemon());
            aux = aux.getNext();
        }
        return;
    }

    public void recorrerAtras() {
        NodoDoble aux = this.tail;
        while (aux != null) {
            System.out.println(aux.getPokemon());
            aux = aux.getPrevious();
        }
        return;
    }

    public void insertarAlComienzo(Pokemon pokemon) {
        NodoDoble nuevoNodo = new NodoDoble(pokemon);
        if (this.head == null) {
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        }

        nuevoNodo.setNext(this.head);
        this.head.setPrevious(nuevoNodo);
        this.head = nuevoNodo;
    }
}