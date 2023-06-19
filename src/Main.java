import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;
import Modulos.*;
import ucn.StdIn;
import ucn.StdOut;

import java.io.IOException;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        inicio();
    }

    public static void inicio() throws IOException {
        //TODO: Agregar todos los métodos que se crean para ejecutar desde el main el programa.
        menuPrincipal();
    }


    public static void menuPrincipal() throws IOException {
        SistemaImpl sistema = new SistemaImpl();
        LinkedList<String> listaCargada = sistema.cargar();
        ListaNodosBasico listaBasicos = sistema.cargarPokemonesBasico(listaCargada);
        ListaNodosPrimera listaPrimeros = sistema.cargarPokemonesPrimera(listaCargada);
        ListaNodosSegundo listaSegundos = sistema.cargarPokemonesSegunda(listaCargada);


        StdOut.println("========================================================");
        StdOut.println("======================Bienvenido/a======================");
        StdOut.println("========================================================");
        StdOut.println("[1] Desplegar los pokemones dado un rango");
        StdOut.println("[2] Desplegar todos los pokemones de forma alfabetica");
        StdOut.println("[3] Despelgar todos los pokemones dado un tipo");
        StdOut.println("[4] Desplegar todos los pokemones con primera evolucion");
        StdOut.println("[5] Busqueda personalizada de pokemones");
        StdOut.println("========================================================");
        StdOut.print("Escriba la opcion que desee: ");
        String opcion = StdIn.readString();
        StdOut.println("========================================================");

        switch (opcion) {
            case "1":
                StdOut.print("Ingrese el rango: ");
                int rango = StdIn.readInt();
                StdOut.println("========================================================");
                LinkedList<String> listanueva = sistema.desplegarDesdeRango(rango,listaCargada);
                for (String s : listanueva) {
                    StdOut.println(s);
                }
                StdOut.println("========================================================");
                break;
            /*case "2":
                listanueva = sistema.desplegarTodos(listaCargada);
                for (String s : listanueva) {
                    StdOut.println(s);
                }
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;*/
            default:
                throw new ArrayIndexOutOfBoundsException("Se ha especificado una opcion no valida.");
        }


        /*StdOut.println("=================================================================");
        for (String s : listaCargada) {
            StdOut.println(s);
        }
        StdOut.println("=================================================================");
        LinkedList<String> listanueva = sistema.desplegarDesdeRango(10,listaCargada);
        for (String s : listanueva) {
            StdOut.println(s);
        }*/
    }
}