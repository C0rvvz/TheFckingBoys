package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.SevenManipulacionMaterialUseCase;
import udem.edu.co.modelo.Impl.SevenManipulacionMateriaImpl;
import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;

public class SevenManipulacionMaterialUseCaseImpl implements SevenManipulacionMaterialUseCase {

    private SevenManipulacionMateriaImpl sevenManipulacionMateria;

    public SevenManipulacionMaterialUseCaseImpl(SevenManipulacionMateriaImpl sevenManipulacionMateria) {
        this.sevenManipulacionMateria = sevenManipulacionMateria;
    }

    public void agregarSevenManipulacionMateria(TheSevenImpl seven) {

        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevenManipulacionMateria.getListaSevens()) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }

        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Manipulacion Material");
        }

        else {
            seven.getCategoria().add("Manipulacion Material");
            sevenManipulacionMateria.getListaSevens().add(seven);
        }
    }
}
