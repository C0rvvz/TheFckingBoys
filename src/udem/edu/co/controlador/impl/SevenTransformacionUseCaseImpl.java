package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenTransformacionUseCase;
import udem.edu.co.modelo.Impl.SevenTransformacionImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenTransformacionUseCaseImpl implements SevenTransformacionUseCase {

    private SevenTransformacionImpl sevenTransformacion;

    public SevenTransformacionUseCaseImpl(SevenTransformacionImpl sevenTransformacion) {
        this.sevenTransformacion = sevenTransformacion;
    }

    public void agregarSevenTransformacion(TheSevenImpl seven) {

        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenTransformacion.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Transformacion");
        }

        else {
            seven.getCategoria().add("Transformacion");
            sevenTransformacion.getListaSevens().add(seven);
        }
    }
}
