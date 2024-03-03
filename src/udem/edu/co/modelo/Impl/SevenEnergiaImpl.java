package udem.edu.co.modelo.Impl;
import udem.edu.co.modelo.SevenEnergia;
import java.util.List;
public class SevenEnergiaImpl implements SevenEnergia {
    private List<TheSevenImpl> sevens;
    public SevenEnergiaImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }
    public void agregarSevenEnergia(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }
        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Manipulacion de Energia");
        } else {
            seven.getCategoria().add("Manipulacion de Energia");
            sevens.add(seven);
        }
    }
}
