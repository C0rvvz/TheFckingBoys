package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenManipulacionMateria;

import java.util.List;

public class SevenManipulacionMateriaImpl implements SevenManipulacionMateria {
    private List<TheSevenImpl> sevens;

    public SevenManipulacionMateriaImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }

    public void agregarSevenManipulacionMateria(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Manipulacion Material");
        }

        else {
            seven.getCategoria().add("Manipulacion Material");
            sevens.add(seven);
        }
    }
}
