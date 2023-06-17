import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;
import Clases.Objetos.PokemonBasico;
import Modulos.*;
import ucn.StdOut;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        carga();
    }

    public static void inicio() {
        //TODO: Agregar todos los métodos que se crean para ejecutar desde el main el programa.
    }

    public static void interfaz() {
        //TODO: Crear la interfaz gráfica para el programa.
    }

    public static void carga() throws IOException {
        SistemaImpl sistema = new SistemaImpl();
        ListaNodosBasico listaBasicos = sistema.cargarPokemonesBasico();
        LinkedList<String> listaCargada = sistema.cargar();

        StdOut.println("=================================================================");
        for (String s : listaCargada) {
            StdOut.println(s);
        }
        StdOut.println("=================================================================");
        listaBasicos.recorrerAdelante();
        StdOut.println("=================================================================");

        StdOut.println("=================================================================");

        StdOut.println("=================================================================");
    }
}