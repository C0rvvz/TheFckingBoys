package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenHabilidadAnimalesUseCase;
import udem.edu.co.modelo.Impl.SevenHabilidadAnimalesImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenHabilidadAnimalesUseCaseImpl implements SevenHabilidadAnimalesUseCase {

    private SevenHabilidadAnimalesImpl sevenHabilidadAnimales;

    public SevenHabilidadAnimalesUseCaseImpl(SevenHabilidadAnimalesImpl sevenHabilidadAnimales) {
        this.sevenHabilidadAnimales = sevenHabilidadAnimales;
    }

    public void agregarSevenHabilidadAnimales(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenHabilidadAnimales.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Habilidad con Animales");
        } else {
            seven.getCategoria().add("Habilidad con Animales");
            sevenHabilidadAnimales.getListaSevens().add(seven);
        }
    }
}
