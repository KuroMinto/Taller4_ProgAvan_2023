package Clases.NodosYListas.SegunEvol;
import Clases.Objetos.PokemonSegundaEvol;

public class NodoDobleSegundo {
    private PokemonSegundaEvol pokemon;
    private NodoDobleSegundo next;
    private NodoDobleSegundo previous;

    /**
     *
     * @param pokemon
     */
    public NodoDobleSegundo(PokemonSegundaEvol pokemon) {
        this.pokemon = pokemon;
        this.next = null;
        this.previous = null;
    }

    public PokemonSegundaEvol getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSegundaEvol pokemon) {
        this.pokemon = pokemon;
    }

    public NodoDobleSegundo getNext() {
        return next;
    }

    public void setNext(NodoDobleSegundo next) {
        this.next = next;
    }

    public NodoDobleSegundo getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDobleSegundo previous) {
        this.previous = previous;
    }
}
