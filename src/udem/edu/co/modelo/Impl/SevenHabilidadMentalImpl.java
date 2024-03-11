package udem.edu.co.modelo.Impl;

import udem.edu.co.modelo.SevenHabilidadMental;

import java.util.ArrayList;
import java.util.List;

public class SevenHabilidadMentalImpl implements SevenHabilidadMental {
    private List<TheSevenImpl> listaSevens;

    public SevenHabilidadMentalImpl() {
        this.listaSevens = new ArrayList<>();
    }

    public List<TheSevenImpl> getListaSevens() {
        return listaSevens;
    }

    public void setListaSevens(List<TheSevenImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
