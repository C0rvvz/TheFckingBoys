package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenVeloz;

import java.util.ArrayList;
import java.util.List;

public class SevenVelozImpl implements SevenVeloz {
    private List<TheSevenImpl> listaSevens;

    public SevenVelozImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
