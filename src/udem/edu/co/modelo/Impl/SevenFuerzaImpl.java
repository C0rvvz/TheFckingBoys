package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenFuerza;

import java.util.ArrayList;
import java.util.List;

public class SevenFuerzaImpl implements SevenFuerza {
    private List<TheSevenImpl> listaSevens;

    public SevenFuerzaImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
