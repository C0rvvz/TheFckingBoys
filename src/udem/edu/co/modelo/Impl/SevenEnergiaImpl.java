package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenEnergia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SevenEnergiaImpl implements SevenEnergia {
    private List<TheSevenImpl> listaSevens;


    public SevenEnergiaImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
