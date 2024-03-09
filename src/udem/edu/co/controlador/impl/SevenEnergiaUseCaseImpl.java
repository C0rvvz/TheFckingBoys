package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenEnergiaUseCase;
import udem.edu.co.modelo.Impl.SevenEnergiaImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;


public class SevenEnergiaUseCaseImpl implements SevenEnergiaUseCase {
    private SevenEnergiaImpl sevenEnergia;

    public SevenEnergiaUseCaseImpl(SevenEnergiaImpl sevenEnergia) {
        this.sevenEnergia = sevenEnergia;
    }

    public void agregarSevenEnergia(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenEnergia.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Manipulacion de Energia");
        } else {
            seven.getCategoria().add("Manipulacion de Energia");
            sevenEnergia.getListaSevens().add(seven);
        }
    }
}
