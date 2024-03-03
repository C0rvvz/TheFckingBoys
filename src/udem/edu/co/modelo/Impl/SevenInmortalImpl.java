package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenInmortal;

import java.util.List;

public class SevenInmortalImpl implements SevenInmortal {
    private List<TheSevenImpl> sevens;

    public SevenInmortalImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }

    public void agregarSevenInmortal(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Inmortal");
        }

        else {
            seven.getCategoria().add("Inmortal");
            sevens.add(seven);
        }
    }
}
