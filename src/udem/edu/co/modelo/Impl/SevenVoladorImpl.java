package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenVolador;

import java.util.ArrayList;
import java.util.List;

public class SevenVoladorImpl implements SevenVolador {
    private List<TheSevenImpl> listaSevens;

    public SevenVoladorImpl() {
        this.listaSevens = new ArrayList<>();
        this.listaSevens.add(new TheSevenImpl("Homelander", new ArrayList<>()));
        this.listaSevens.add(new TheSevenImpl("Starlight", new ArrayList<>()));
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
