package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenInmortalUseCase;
import udem.edu.co.modelo.Impl.SevenInmortalImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenInmortalUseCaseImpl implements SevenInmortalUseCase {

    private SevenInmortalImpl sevenInmortal;

    public SevenInmortalUseCaseImpl(SevenInmortalImpl sevenInmortal) {
        this.sevenInmortal = sevenInmortal;
    }

    public void agregarSevenInmortal(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenInmortal.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Inmortal");
        } else {
            seven.getCategoria().add("Inmortal");
            sevenInmortal.getListaSevens().add(seven);
        }
    }
}
