package Clases.NodosYListas.Basicos;
import Clases.Objetos.*;

public class NodoDobleBasico {
    private PokemonBasico pokemon;
    private NodoDobleBasico next;
    private NodoDobleBasico previous;

    public NodoDobleBasico(PokemonBasico pokemon) {
        this.pokemon = pokemon;
        this.next = null;
        this.previous = null;
    }

    public PokemonBasico getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonBasico pokemon) {
        this.pokemon = pokemon;
    }

    public NodoDobleBasico getNext() {
        return next;
    }

    public void setNext(NodoDobleBasico next) {
        this.next = next;
    }

    public NodoDobleBasico getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDobleBasico previous) {
        this.previous = previous;
    }
}
