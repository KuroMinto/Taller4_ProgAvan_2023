package Clases.NodosYListas.SegunEvol;
import Clases.Objetos.PokemonSegundaEvol;

public class ListaNodosSegundo {
    private NodoDobleSegundo head;
    private NodoDobleSegundo tail;

    public ListaNodosSegundo() {
        this.head = null;
        this.tail = null;
    }


    public void insertarAlFinalConCola(PokemonSegundaEvol pokemon) {
        NodoDobleSegundo nuevoNodo = new NodoDobleSegundo(pokemon);

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
        NodoDobleSegundo aux = this.head;
        while(aux != null) {
            System.out.println(aux.getPokemon());
            aux = aux.getNext();
        }
        return;
    }

    public void recorrerAtras() {
        NodoDobleSegundo aux = this.tail;
        while (aux != null) {
            System.out.println(aux.getPokemon());
            aux = aux.getPrevious();
        }
        return;
    }
}