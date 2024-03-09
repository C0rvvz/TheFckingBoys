package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenVelozUseCase;
import udem.edu.co.modelo.Impl.SevenVelozImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenVelozUseCaseImpl implements SevenVelozUseCase {

    private SevenVelozImpl sevenVeloz;

    public SevenVelozUseCaseImpl(SevenVelozImpl sevenVeloz) {
        this.sevenVeloz = sevenVeloz;
    }

    public void agregarSevenVeloz(TheSevenImpl seven) {

        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenVeloz.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Veloz");
        }

        else {
            seven.getCategoria().add("Veloz");
            sevenVeloz.getListaSevens().add(seven);
        }
    }
}
