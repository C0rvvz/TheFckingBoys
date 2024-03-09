package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenHabilidadAnimales;

import java.util.ArrayList;
import java.util.List;

public class SevenHabilidadAnimalesImpl implements SevenHabilidadAnimales {
    private List<TheSevenImpl> listaSevens;

    public SevenHabilidadAnimalesImpl() {
        this.listaSevens = new ArrayList<>();
        this.listaSevens.add(new TheSevenImpl("The Deep", new ArrayList<>()));

    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
