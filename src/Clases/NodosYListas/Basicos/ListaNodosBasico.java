package Clases.NodosYListas.Basicos;
import Clases.Objetos.*;

public class ListaNodosBasico {
    private NodoDobleBasico head;
    private NodoDobleBasico tail;

    public ListaNodosBasico() {
        this.head = null;
        this.tail = null;
    }


    public void insertarAlFinalConCola(PokemonBasico pokemon) {
        NodoDobleBasico nuevoNodo = new NodoDobleBasico(pokemon);

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
}