package Clases.Objetos;

abstract class Pokemon {
    private final String id;
    private final String nombre;
    private final String etapa;
    private final String tipo1;
    private final String tipo2;

    /**
     *
     * @param id
     * @param nombre
     * @param etapa
     * @param tipo1
     * @param tipo2
     */
    public Pokemon(String id, String nombre, String etapa, String tipo1, String tipo2) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() { return tipo2; }
}