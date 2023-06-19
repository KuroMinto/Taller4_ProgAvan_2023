package Modulos;

import ucn.*;
import java.io.File;
import java.io.IOException;
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

    /*@Override
    public ListaNodosBasico cargarPokemonesBasico() throws IOException {
        LinkedList<String> listaCargada = cargar();
        ListaNodosBasico listaNodosBasico = new ListaNodosBasico();

        for (String s : listaCargada) {
            String[] tokens = s.split(",");

            if (tokens[2].equalsIgnoreCase("Basico")) { //Caso cuando su etapa sea de pokemones BÁSICOS
                if (tokens.length == 6) {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String evol1 = tokens[3];
                    String evol2 = "Null";
                    String evol3 = "Null";
                    String tipo1 = tokens[4];
                    String tipo2 = tokens[5];
                    PokemonBasico pokemonBasico = new PokemonBasico(ID, nombre, etapa, tipo1, tipo2, evol1, evol2, evol3);
                    listaNodosBasico.insertarAlFinalConCola(pokemonBasico);
                } else if (tokens.length == 7) {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String evol1 = tokens[3];
                    String evol2 = tokens[4];
                    String evol3 = "Null";
                    String tipo1 = tokens[5];
                    String tipo2 = tokens[6];
                    PokemonBasico pokemonBasico = new PokemonBasico(ID, nombre, etapa, tipo1, tipo2, evol1, evol2, evol3);
                    listaNodosBasico.insertarAlFinalConCola(pokemonBasico);
                } else {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String evol1 = tokens[3];
                    String evol2 = tokens[4];
                    String evol3 = tokens[5];
                    String tipo1 = tokens[6];
                    String tipo2 = tokens[7];
                    PokemonBasico pokemonBasico = new PokemonBasico(ID, nombre, etapa, tipo1, tipo2, evol1, evol2, evol3);
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
    }*/ //Codigo no utilizado, hiatus.


    public LinkedList<String> desplegarDesdeRango(int rangoMaximo, LinkedList<String> listaCargada) throws IOException {
        LinkedList<String> listaNueva = new LinkedList<>();
        String[][] matriz = new String[rangoMaximo][2];

        if (rangoMaximo > listaCargada.size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int i = 0;
            int j = 0;
            while (true) {
                if (i < rangoMaximo) {
                    String nuevoString1 = null;
                    for (String s : listaCargada) {
                        String[] tokens = s.split(",", 2);
                        if (j == 0) {
                            matriz[i][j] = tokens[0];
                            nuevoString1 = tokens[0];
                            j++;
                            matriz[i][j] = tokens[1];
                            j = 0;
                            i++;
                            String nuevoString2 = tokens[1];
                            String cadenaCompleta = (nuevoString1+","+nuevoString2);
                            listaNueva.add(cadenaCompleta);
                        }

                        if (i==rangoMaximo) {
                            break;
                        }
                    }
                } else{
                    break;
                }
            }
        }

        for (int i=0; i<rangoMaximo; i++) {
            for (int j=0; j<2; j++) {
                for (int x=0; x<rangoMaximo; x++) {
                    for (int y=0; y<2; y++) {
                        if (Integer.parseInt(matriz[i][0]) >= Integer.parseInt(matriz[x][0])) {
                            matriz[i][j] = matriz[i][j];
                        } else {
                            String tempo = matriz[x][y];
                            String tempo1 = matriz[x][y+1];

                            matriz[x][y] = matriz[i][j];
                            matriz[x][y+1] = matriz[i][j+1];
                            matriz[i][j] = tempo;
                            matriz[i][j+1] = tempo1;
                        }
                    }
                }
            }
        }

        String string1 = null;
        listaNueva.clear();
        for (int i=0; i<rangoMaximo; i++) {
            for (int j=0; j<2; j++) {
                if (j == 0) {
                    string1 = matriz[i][j];
                } else {
                    String string2 = matriz[i][j];
                    String cadenaCompleta = (string1+","+string2);
                    listaNueva.add(cadenaCompleta);
                }
            }
        }
        return listaNueva;
    }

    @Override
    public void desplegarTodos(LinkedList<String> listaCargada) throws IOException {

    }

    @Override
    public void desplegarSegunTipo(LinkedList<String> listaCargada) {

    }

    @Override
    public void desplegarPrimeraEvol(LinkedList<String> listaCargada) {

    }

    @Override
    public void busquedaPersonalizada(String nombre, String id, LinkedList<String> listaCargada) {

    }
}