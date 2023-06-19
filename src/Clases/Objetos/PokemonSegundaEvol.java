package Clases.Objetos;

import ucn.*;

public class PokemonSegundaEvol extends Pokemon{
    private String involucion1; //Primera evolución del pokemon, etapa previa a la actual.
    private String involucion2; //Etapa básica del pokemon.

    /**
     *
     * @param id
     * @param nombre
     * @param etapa
     * @param tipo1
     * @param tipo2
     * @param involucion1
     * @param involucion2
     */
    public PokemonSegundaEvol(String id, String nombre, String etapa, String tipo1, String tipo2, String involucion1, String involucion2) {
        super(id, nombre, etapa, tipo1, tipo2);
        this.involucion1 = involucion1;
        this.involucion2 = involucion2;
    }

    public String getInvolucion1() {
        return involucion1;
    }

    public void setInvolucion1(String involucion1) {
        this.involucion1 = involucion1;
    }

    public String getInvolucion2() {
        return involucion2;
    }

    public void setInvolucion2(String involucion2) {
        this.involucion2 = involucion2;
    }
}
