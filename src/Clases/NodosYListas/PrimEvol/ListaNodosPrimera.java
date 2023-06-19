package Clases.NodosYListas.PrimEvol;
import Clases.Objetos.PokemonPrimeraEvol;

public class ListaNodosPrimera {
    private NodoDoblePrimera head;
    private NodoDoblePrimera tail;

    public ListaNodosPrimera() {
        this.head = null;
        this.tail = null;
    }


    public void insertarAlFinalConCola(PokemonPrimeraEvol pokemon) {
        NodoDoblePrimera nuevoNodo = new NodoDoblePrimera(pokemon);

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