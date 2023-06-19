package Modulos;

import Clases.NodosYListas.Basicos.ListaNodosBasico;
import Clases.NodosYListas.PrimEvol.ListaNodosPrimera;
import Clases.NodosYListas.SegunEvol.ListaNodosSegundo;
import Clases.Objetos.PokemonBasico;
import Clases.Objetos.PokemonPrimeraEvol;
import Clases.Objetos.PokemonSegundaEvol;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class SistemaImpl implements Sistema {

    public SistemaImpl() {
    }

    /**
     * @return
     * @throws IOException
     * @description Metodo para cargar la lista de pokemones del archivo "kanto.txt"
     */
    @Override
    public LinkedList<String> cargar() throws IOException {

        Scanner scanner = new Scanner(new File("kanto.txt"));
        LinkedList<String> lista = new LinkedList<>();

        while (scanner.hasNextLine()) {
            String token = scanner.nextLine();

            if (!token.equals("")) {
                String str = token.replace(" ", "");

                lista.add(str);
            }
        }
        return lista;
    }

    /**
     * @description metodo para cargar todos los pokemones en etapa básica a una lista de nodos con la clase pokemon básico
     * @param listaCargada
     * @return
     * @throws IOException
     */
    @Override
    public ListaNodosBasico cargarPokemonesBasico(LinkedList<String> listaCargada) throws IOException {
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

    /**
     * @Desc metodo para cargar todos los pokemones en etapa de primera evolucion a una lista de nodos con la clase pokemon Primera Evolucion
     * @param listaCargada
     * @return
     * @throws IOException
     */
    @Override
    public ListaNodosPrimera cargarPokemonesPrimera(LinkedList<String> listaCargada) throws IOException {
        ListaNodosPrimera listaNodosPrimera = new ListaNodosPrimera();

        for (String s : listaCargada) {
            String[] tokens = s.split(",");

            if (tokens[2].equalsIgnoreCase("Primera Evolucion")) { //Caso cuando su etapa sea de pokemones de PRIMERA EVOLUCION
                if (tokens.length == 6) {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String invol = tokens[3];
                    String tipo1 = tokens[4];
                    String tipo2 = tokens[5];
                    PokemonPrimeraEvol pokemonPrimeraEvol = new PokemonPrimeraEvol(ID, nombre, etapa,tipo1,tipo2,"null",invol);
                    listaNodosPrimera.insertarAlFinalConCola(pokemonPrimeraEvol);
                } else {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String evol = tokens[3];
                    String invol = tokens[4];
                    String tipo1 = tokens[5];
                    String tipo2 = tokens[6];
                    PokemonPrimeraEvol pokemonPrimeraEvol = new PokemonPrimeraEvol(ID, nombre, etapa,tipo1,tipo2,evol,invol);
                    listaNodosPrimera.insertarAlFinalConCola(pokemonPrimeraEvol);
                }
            }
        }
        return listaNodosPrimera;
    }

    /**
     * @Desc metodo para cargar todos los pokemones en etapa de segunda evolucion a una lista de nodos con la clase pokemon Segunda Evolucion
     * @param listaCargada
     * @return
     * @throws IOException
     */
    @Override
    public ListaNodosSegundo cargarPokemonesSegunda(LinkedList<String> listaCargada) throws IOException {
        ListaNodosSegundo listaNodosSegundo = new ListaNodosSegundo();

        for (String s : listaCargada) {
            String[] tokens = s.split(",");

            if (tokens[2].equalsIgnoreCase("Segunda Evolucion")) { //Caso cuando su etapa sea de pokemones de SEGUNDA EVOLUCION
                if (tokens.length == 6) {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String invol1 = "null";
                    String invol2 = tokens[3];
                    String tipo1 = tokens[4];
                    String tipo2 = tokens[5];
                    PokemonSegundaEvol pokemonSegundaEvol = new PokemonSegundaEvol(ID, nombre, etapa, tipo1, tipo2,invol1,invol2);
                    listaNodosSegundo.insertarAlFinalConCola(pokemonSegundaEvol);
                } else {
                    String ID = tokens[0];
                    String nombre = tokens[1];
                    String etapa = tokens[2];
                    String invol1 = tokens[3];
                    String invol2 = tokens[4];
                    String tipo1 = tokens[5];
                    String tipo2 = tokens[6];
                    PokemonSegundaEvol pokemonSegundaEvol = new PokemonSegundaEvol(ID, nombre, etapa, tipo1, tipo2,invol1,invol2);
                    listaNodosSegundo.insertarAlFinalConCola(pokemonSegundaEvol);
                }
            }
        }
        return listaNodosSegundo;
    }

    /**
     * @Desc Metodo para desplegar los pokemons de la lista en un cierto rango, y ordenados por su ID.
     * @param rangoMaximo
     * @param listaCargada
     * @return
     * @throws IOException
     */
    @Override
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
                    for (String s : listaCargada) {
                        String[] tokens = s.split(",", 2);
                        matriz[i][j] = tokens[0];
                        String nuevoString1 = tokens[0];
                        j++;
                        matriz[i][j] = tokens[1];
                        j = 0;
                        i++;
                        String nuevoString2 = tokens[1];
                        String cadenaCompleta = (nuevoString1+","+nuevoString2);
                        listaNueva.add(cadenaCompleta);

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

    //Sin funcionalidad...
    /*@Override
    public LinkedList<String> desplegarTodos(LinkedList<String> listaCargada) throws IOException {
        LinkedList<String> pokemones = new LinkedList<>();
        int cantidad = listaCargada.size();
        String[][] matriz = new String[cantidad][3];

        while (true) {
            int i = 0;
            int j = 0;
            if (i < listaCargada.size()) {
                for (String s : listaCargada) {
                    String[] tokens = s.split(",", 3);
                    matriz[i][j] = tokens[0];
                    String nuevoString1 = tokens[0];
                    j++;
                    matriz[i][j] = tokens[1];
                    String nuevoString2 = tokens[1];
                    j++;
                    matriz[i][j] = tokens[2];
                    String nuevoString3 = tokens[2];
                    String cadenaCompleta = (nuevoString1+","+nuevoString2+","+nuevoString3);
                    pokemones.add(cadenaCompleta);
                    j = 0;
                    i++;
                }
            }
            break;
        }

        for (int i=0; i<cantidad; i++) {
            for (int j=0; j<2; j++) {
                for (int x=0; x<cantidad; x++) {
                    if (matriz[i][1].compareTo(matriz[x][1]) < 0) {
                        matriz[i][j] = matriz[i][j];
                    } else {
                        String tempo = matriz[x][0];
                        String tempo1 = matriz[x][0 + 1];
                        String tempo2 = matriz[x][0 + 2];

                        matriz[x][0] = matriz[i][j];
                        matriz[x][0 + 1] = matriz[i][j + 1];
                        matriz[x][0 + 2] = matriz[i][j + 2];
                        matriz[i][j] = tempo;
                        matriz[i][j + 1] = tempo1;
                        matriz[i][j + 2] = tempo2;
                    }
                    if (matriz[i][1].compareTo(matriz[x][1]) < 0) {
                        matriz[i][j] = matriz[i][j];
                    } else {
                        String tempo = matriz[x][1];
                        String tempo1 = matriz[x][1 + 1];
                        String tempo2 = matriz[x][1 + 2];

                        matriz[x][1] = matriz[i][j];
                        matriz[x][1 + 1] = matriz[i][j + 1];
                        matriz[x][1 + 2] = matriz[i][j + 2];
                        matriz[i][j] = tempo;
                        matriz[i][j + 1] = tempo1;
                        matriz[i][j + 2] = tempo2;
                    }
                }
            }
        }
        return pokemones;
    }

    @Override
    public void desplegarSegunTipo(LinkedList<String> listaCargada) {

    }

    @Override
    public void desplegarPrimeraEvol(LinkedList<String> listaCargada) {

    }

    @Override
    public void busquedaPersonalizada(String nombre, String id, LinkedList<String> listaCargada) {

    }*/
}