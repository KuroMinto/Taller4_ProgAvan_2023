package Modulos;

import java.io.IOException;
import java.util.LinkedList;

public interface Sistema {
    LinkedList<String> cargar() throws IOException;

    LinkedList<String> desplegarDesdeRango(int rangoMaximo, LinkedList<String> listaCargada) throws IOException;
    void desplegarTodos(LinkedList<String> listaCargada) throws IOException;
    void desplegarSegunTipo(LinkedList<String> listaCargada);
    void desplegarPrimeraEvol(LinkedList<String> listaCargada);
    void busquedaPersonalizada(String nombre, String id, LinkedList<String> listaCargada);
}