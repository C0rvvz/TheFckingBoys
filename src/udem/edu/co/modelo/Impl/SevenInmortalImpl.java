package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenInmortal;

import java.util.ArrayList;
import java.util.List;

public class SevenInmortalImpl implements SevenInmortal {
    private List<TheSevenImpl> listaSevens;

    public SevenInmortalImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
