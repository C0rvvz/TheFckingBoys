package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenHabilidadMental;

import java.util.List;

public class SevenHabilidadMentalImpl implements SevenHabilidadMental {
    private List<TheSevenImpl> sevens;
    public SevenHabilidadMentalImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }
    public void agregarSevenHabilidadMental(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }
        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Habilidad Mental");
        } else {
            seven.getCategoria().add("Habilidad Mental");
            sevens.add(seven);
        }
    }
}
