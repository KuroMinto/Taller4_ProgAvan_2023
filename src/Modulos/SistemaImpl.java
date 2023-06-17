package Modulos;

import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;
import Clases.Objetos.PokemonBasico;
import Clases.Objetos.PokemonPrimeraEvol;
import Clases.Objetos.PokemonSegundaEvol;
import ucn.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SistemaImpl implements Sistema{

    public SistemaImpl() {
    }


    @Override
    public LinkedList<String> cargar() throws IOException {
        ArchivoEntrada archEntry = new ArchivoEntrada("kanto.txt");
        Registro reg = archEntry.getRegistro();

        Scanner scanner = new Scanner(new File("kanto.txt"));
        LinkedList<String> lista = new LinkedList<String>();

        while (scanner.hasNextLine()) {
            String token = scanner.nextLine();

            if (!token.equals("")) {
                String str = token.replace(" ", "");;
                String[] tokens = str.split(",");

                lista.add(str);
            }
        }
        return lista;
    }

    @Override
    public ListaNodosBasico cargarPokemonesBasico() throws IOException {
        LinkedList<String> listaCargada = cargar();
        ListaNodosBasico listaNodosBasico = new ListaNodosBasico();
        Iterator<String> iterador = listaCargada.iterator();

        for (String s : listaCargada) {
            String[] tokens = s.split(",");

            if (tokens[2].equalsIgnoreCase("Basico")) { //Caso cuando su etapa sea de pokemones BÁSICOS
                if (tokens.length == 6) {
                    PokemonBasico pokemonBasico = new PokemonBasico(tokens[0], tokens[1], tokens[2], tokens[4], tokens[5], tokens[3], "null", "null");
                    listaNodosBasico.insertarAlFinalConCola(pokemonBasico);
                } else if (tokens.length == 7) {
                    PokemonBasico pokemonBasico = new PokemonBasico(tokens[0], tokens[1], tokens[2], tokens[5], tokens[6], tokens[3], tokens[4], "null");
                    listaNodosBasico.insertarAlFinalConCola(pokemonBasico);
                } else {
                    PokemonBasico pokemonBasico = new PokemonBasico(tokens[0], tokens[1], tokens[2], tokens[6], tokens[7], tokens[3], tokens[4], tokens[5]);
                    listaNodosBasico.insertarAlFinalConCola(pokemonBasico);
                }
            }
        }
        return listaNodosBasico;
    }

    @Override
    public ListaNodosPrimera cargarPokemonesPrimera() throws IOException {
        LinkedList<String> listaCargada = cargar();
        Scanner scanner = new Scanner(String.valueOf(listaCargada));
        ListaNodosPrimera listaNodosPrimera = new ListaNodosPrimera();

        while (scanner.hasNextLine()) {
            String token = scanner.nextLine();

            if (!token.equals("")) {
                String str = token;
                String[] tokens = str.split(",");

                if (tokens[2].equalsIgnoreCase("Primera Evolucion")) { //Caso cuando su etapa sea de pokemones BÁSICOS
                    if (tokens.length == 6) {
                        PokemonPrimeraEvol pokemonPrimeraEvol = new PokemonPrimeraEvol(tokens[0], tokens[1], tokens[2], tokens[4], tokens[5], "null", tokens[3]);
                        listaNodosPrimera.insertarAlFinalConCola(pokemonPrimeraEvol);
                    } else {
                        PokemonPrimeraEvol pokemonPrimeraEvol = new PokemonPrimeraEvol(tokens[0], tokens[1], tokens[2], tokens[5], tokens[6], tokens[3], tokens[4]);
                        listaNodosPrimera.insertarAlFinalConCola(pokemonPrimeraEvol);
                    }
                }
            }
        }
        return listaNodosPrimera;
    }

    @Override
    public ListaNodosSegundo cargarPokemonesSegunda() throws IOException {
        LinkedList<String> listaCargada = cargar();
        Scanner scanner = new Scanner(String.valueOf(listaCargada));
        ListaNodosSegundo listaNodosSegundo = new ListaNodosSegundo();

        while (scanner.hasNextLine()) {
            String token = scanner.nextLine();

            if (!token.equals("")) {
                String str = token;
                String[] tokens = str.split(",");

                if (tokens[2].equalsIgnoreCase("Segunda Evolucion")) { //Caso cuando su etapa sea de pokemones BÁSICOS
                    PokemonSegundaEvol pokemonSegundaEvol = new PokemonSegundaEvol(tokens[0], tokens[1], tokens[2], tokens[5], tokens[6], tokens[3], tokens[4]);
                    listaNodosSegundo.insertarAlFinalConCola(pokemonSegundaEvol);
                }
            }
        }
        return listaNodosSegundo;
    }

    public void desplegarDesdeRango() {

    }

    @Override
    public void desplegarTodos() {

    }

    @Override
    public void despelgarSegunTipo() {

    }

    @Override
    public void desplegarPrimeraEvol() {

    }

    @Override
    public void busquedaPersonalizada() {

    }
}