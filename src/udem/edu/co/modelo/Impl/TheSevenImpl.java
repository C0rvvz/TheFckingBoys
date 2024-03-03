package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.TheSeven;

import java.util.List;

public class TheSevenImpl implements TheSeven {
    private String nombre;
    private List<String> categoria;

    public TheSevenImpl(String nombre, List<String> categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<String> categoria) {
        this.categoria = categoria;
    }
}
