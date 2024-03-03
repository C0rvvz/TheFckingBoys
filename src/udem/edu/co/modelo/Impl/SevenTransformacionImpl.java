package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenTransformacion;

import java.util.List;

public class SevenTransformacionImpl implements SevenTransformacion {
    private List<TheSevenImpl> sevens;
    public SevenTransformacionImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }
    public void agregarSevenTransformacion(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }
        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Transformacion");
        } else {
            seven.getCategoria().add("Transformacion");
            sevens.add(seven);
        }
    }
}
