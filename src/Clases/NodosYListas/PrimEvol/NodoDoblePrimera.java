package Clases.NodosYListas.PrimEvol;
import Clases.Objetos.PokemonPrimeraEvol;

public class NodoDoblePrimera {
    private PokemonPrimeraEvol pokemon;
    private NodoDoblePrimera next;
    private NodoDoblePrimera previous;

    public NodoDoblePrimera(PokemonPrimeraEvol pokemon) {
        this.pokemon = pokemon;
        this.next = null;
        this.previous = null;
    }

    public PokemonPrimeraEvol getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonPrimeraEvol pokemon) {
        this.pokemon = pokemon;
    }

    public NodoDoblePrimera getNext() {
        return next;
    }

    public void setNext(NodoDoblePrimera next) {
        this.next = next;
    }

    public NodoDoblePrimera getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDoblePrimera previous) {
        this.previous = previous;
    }
}
