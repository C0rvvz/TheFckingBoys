package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenHabilidadMentalUseCase;
import udem.edu.co.modelo.Impl.SevenHabilidadMentalImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenHabilidadMentalUseCaseImpl implements SevenHabilidadMentalUseCase {

    private SevenHabilidadMentalImpl sevenHabilidadMental;

    public SevenHabilidadMentalUseCaseImpl(SevenHabilidadMentalImpl sevenHabilidadMental) {
        this.sevenHabilidadMental = sevenHabilidadMental;
    }

    public void agregarSevenHabilidadMental(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenHabilidadMental.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Habilidad Mental");
        } else {
            seven.getCategoria().add("Habilidad Mental");
            sevenHabilidadMental.getListaSevens().add(seven);
        }
    }
}
