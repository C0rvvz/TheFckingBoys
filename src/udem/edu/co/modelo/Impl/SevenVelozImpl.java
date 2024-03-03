package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenVeloz;

import java.util.List;

public class SevenVelozImpl implements SevenVeloz {
    private List<TheSevenImpl> sevens;

    public SevenVelozImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }

    public void agregarSevenVeloz(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Veloz");
        }

        else {
            seven.getCategoria().add("Veloz");
            sevens.add(seven);
        }
    }
}
