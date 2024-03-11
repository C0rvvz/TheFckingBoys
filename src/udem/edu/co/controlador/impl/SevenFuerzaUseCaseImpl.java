package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenFuerzaUseCase;
import udem.edu.co.modelo.Impl.SevenFuerzaImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenFuerzaUseCaseImpl implements SevenFuerzaUseCase {

    private SevenFuerzaImpl sevenFuerza;

    public SevenFuerzaUseCaseImpl(SevenFuerzaImpl sevenFuerza) {

        this.sevenFuerza = sevenFuerza;
    }

    public void agregarSevenFuerza(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenFuerza.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Fuerte");
        } else {
            seven.getCategoria().add("Fuerte");
            sevenFuerza.getListaSevens().add(seven);
        }
    }
}
