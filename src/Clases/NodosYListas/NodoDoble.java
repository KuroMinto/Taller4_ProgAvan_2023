package Clases.NodosYListas;
import Clases.Objetos.*;

public class NodoDoble {
    private Pokemon pokemon;
    private NodoDoble next;
    private NodoDoble previous;

    public NodoDoble(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.next = null;
        this.previous = null;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDoble previous) {
        this.previous = previous;
    }
}
