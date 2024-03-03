package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenHabilidadAnimales;

import java.util.List;

public class SevenHabilidadAnimalesImpl implements SevenHabilidadAnimales {
    private List<TheSevenImpl> sevens;

    public SevenHabilidadAnimalesImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }

    public void agregarSevenHabilidadAnimales(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Habilidad con Animales");
        }

        else {
            seven.getCategoria().add("Habilidad con Animales");
            sevens.add(seven);
        }
    }
}
