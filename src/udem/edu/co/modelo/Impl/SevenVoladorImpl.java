package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenVolador;

import java.util.List;

public class SevenVoladorImpl implements SevenVolador {
    private List<TheSevenImpl> sevens;
    public SevenVoladorImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }
    public void agregarSevenVolador(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }
        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Volador");
        } else {
            seven.getCategoria().add("Volador");
            sevens.add(seven);
        }
    }
}
