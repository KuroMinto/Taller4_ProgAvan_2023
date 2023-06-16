package Clases.Objetos;

public class Pokemon {
    private final String id;
    private final String nombre;
    private final String etapa;
    private final String siguienteEvol;
    private final String evolPrevia;
    private final String tipo1;
    private final String tipo2;

    public Pokemon(String id, String nombre, String etapa, String siguienteEvol, String evolPrevia, String tipo1, String tipo2) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.siguienteEvol = siguienteEvol;
        this.evolPrevia = evolPrevia;
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

    public String getSiguienteEvol() {
        return siguienteEvol;
    }

    public String getEvolPrevia() {
        return evolPrevia;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }
}