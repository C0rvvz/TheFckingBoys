package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenVoladorUseCase;
import udem.edu.co.modelo.Impl.SevenVoladorImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenVoladorUseCaseImpl implements SevenVoladorUseCase {

    private SevenVoladorImpl sevenVolador;

    public SevenVoladorUseCaseImpl(SevenVoladorImpl sevenVolador) {
        this.sevenVolador = sevenVolador;
    }

    public void agregarSevenVolador(TheSevenImpl seven) {

        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenVolador.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Volador");
        }

        else {
            seven.getCategoria().add("Volador");
            sevenVolador.getListaSevens().add(seven);
        }
    }
}
