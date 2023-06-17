package Clases.Objetos;

import ucn.*;

public class PokemonBasico extends Pokemon{

    private String siguienteEvol1;
    private String siguienteEvol2;
    private String siguienteEvol3;

    public PokemonBasico(String id, String nombre, String etapa, String tipo1, String tipo2, String siguienteEvol1, String siguienteEvol2, String siguienteEvol3) {
        super(id, nombre, etapa, tipo1, tipo2);
        this.siguienteEvol1 = siguienteEvol1;
        this.siguienteEvol2 = siguienteEvol2;
        this.siguienteEvol3 = siguienteEvol3;
    }

    public String getSiguienteEvol1() {
        return siguienteEvol1;
    }

    public void setSiguienteEvol1(String siguienteEvol1) {
        this.siguienteEvol1 = siguienteEvol1;
    }

    public String getSiguienteEvol2() {
        return siguienteEvol2;
    }

    public void setSiguienteEvol2(String siguienteEvol2) {
        this.siguienteEvol2 = siguienteEvol2;
    }

    public String getSiguienteEvol3() {
        return siguienteEvol3;
    }

    public void setSiguienteEvol3(String siguienteEvol3) {
        this.siguienteEvol3 = siguienteEvol3;
    }
}
