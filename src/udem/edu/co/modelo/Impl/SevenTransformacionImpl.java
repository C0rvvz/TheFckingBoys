package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenTransformacion;

import java.util.ArrayList;
import java.util.List;

public class SevenTransformacionImpl implements SevenTransformacion {
    private List<TheSevenImpl> listaSevens;

    public SevenTransformacionImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
