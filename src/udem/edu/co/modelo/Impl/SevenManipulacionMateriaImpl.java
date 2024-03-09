package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenManipulacionMateria;

import java.util.ArrayList;
import java.util.List;

public class SevenManipulacionMateriaImpl implements SevenManipulacionMateria {
    private List<TheSevenImpl> listaSevens;

    public SevenManipulacionMateriaImpl() {
        this.listaSevens = new ArrayList<>();
        this.listaSevens.add(new TheSevenImpl("Lamplighter", new ArrayList<>()));
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
