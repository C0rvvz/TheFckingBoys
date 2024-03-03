package udem.edu.co.modelo.Impl;
import udem.edu.co.modelo.SevenFuerza;
import java.util.List;
public class SevenFuerzaImpl implements SevenFuerza {
    private List<TheSevenImpl> sevens;
    public SevenFuerzaImpl(List<TheSevenImpl> sevens) {
        this.sevens = sevens;
    }
    public void agregarSevenFuerza(TheSevenImpl seven) {
        TheSevenImpl sevenRepetido = null;
        for (TheSevenImpl repetidoSuper : sevens) {
            if (repetidoSuper.getNombre().equals(seven.getNombre())) {
                sevenRepetido = repetidoSuper;
                break;
            }
        }
        if (sevenRepetido != null) {
            sevenRepetido.getCategoria().add("Fuerte");
        } else {
            seven.getCategoria().add("Fuerte");
            sevens.add(seven);
        }
    }
}
