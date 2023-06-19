package Clases.Objetos;

import ucn.*;

public class PokemonPrimeraEvol extends Pokemon{
    private String siguienteEvol;
    private String involucion;

    /**
     *
     * @param id - ID del Pokemon
     * @param nombre - nombre del Pokemon
     * @param etapa - etapa del Pokemon
     * @param tipo1 - tipo1 del Pokemon
     * @param tipo2 - tipo2 del Pokemon
     * @param siguienteEvol - Siguiente evolución del Pokemon
     * @param involucion - Involución del Pokemon
     */
    public PokemonPrimeraEvol(String id, String nombre, String etapa, String tipo1, String tipo2, String siguienteEvol, String involucion) {
        super(id, nombre, etapa, tipo1, tipo2);
        this.siguienteEvol = siguienteEvol;
        this.involucion = involucion;
    }

    public String getSiguienteEvol() {
        return siguienteEvol;
    }

    public void setSiguienteEvol(String siguienteEvol) {
        this.siguienteEvol = siguienteEvol;
    }

    public String getInvolucion() {
        return involucion;
    }

    public void setInvolucion(String involucion) {
        this.involucion = involucion;
    }
}
