package Modulos;

import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;

import java.io.IOException;
import java.util.LinkedList;

public interface Sistema {
    LinkedList cargar() throws IOException;

    ListaNodosBasico cargarPokemonesBasico() throws IOException;
    ListaNodosPrimera cargarPokemonesPrimera() throws IOException;
    ListaNodosSegundo cargarPokemonesSegunda() throws IOException;


    void desplegarDesdeRango();
    void desplegarTodos();
    void despelgarSegunTipo();
    void desplegarPrimeraEvol();
    void busquedaPersonalizada();
}