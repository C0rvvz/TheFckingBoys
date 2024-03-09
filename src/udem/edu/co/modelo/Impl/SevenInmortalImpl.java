package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenInmortal;

import java.util.ArrayList;
import java.util.List;

public class SevenInmortalImpl implements SevenInmortal {
    private List<TheSevenImpl> listaSevens;

    public SevenInmortalImpl() {
        this.listaSevens = new ArrayList<>();
        this.listaSevens.add(new TheSevenImpl("Homelander", new ArrayList<>()));
        this.listaSevens.add(new TheSevenImpl("Queen Maeve", new ArrayList<>()));
        this.listaSevens.add(new TheSevenImpl("Black Noir", new ArrayList<>()));
        this.listaSevens.add(new TheSevenImpl("The Deep", new ArrayList<>()));
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
