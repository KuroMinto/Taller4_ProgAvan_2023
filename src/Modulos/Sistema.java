package Modulos;

import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;

import java.io.IOException;
import java.util.LinkedList;

public interface Sistema {
    LinkedList<String> cargar() throws IOException;

    ListaNodosBasico cargarPokemonesBasico(LinkedList<String> listaCargada) throws IOException;

    ListaNodosPrimera cargarPokemonesPrimera(LinkedList<String> listaCargada) throws IOException;

    ListaNodosSegundo cargarPokemonesSegunda(LinkedList<String> listaCargada) throws IOException;

    LinkedList<String> desplegarDesdeRango(int rangoMaximo, LinkedList<String> listaCargada) throws IOException;

    /*LinkedList<String> desplegarTodos(LinkedList<String> listaCargada) throws IOException;

    void desplegarSegunTipo(LinkedList<String> listaCargada);
    void desplegarPrimeraEvol(LinkedList<String> listaCargada);
    void busquedaPersonalizada(String nombre, String id, LinkedList<String> listaCargada);*/
}