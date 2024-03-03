package udem.edu.co.controlador.impl;
import udem.edu.co.controlador.FuncionalidadMenu;
import udem.edu.co.modelo.Impl.TheSevenImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FuncionalidadMenuImpl implements FuncionalidadMenu {
    private MenuImpl menuImpl;
    private List<TheSevenImpl> sevens;
    public FuncionalidadMenuImpl(MenuImpl menuImpl, List<TheSevenImpl> sevens) {
        this.menuImpl = menuImpl;
        this.sevens = sevens;
    }
    public void correrPrograma() {
        int opcion;
        do {
            opcion = menuImpl.imprimirMenu();
            switch (opcion) {
                case 1:
                    imprimirTodosSevens();
                    break;
                case 2:
                    imprimirSevensCategoria("Fuerte");
                    break;
                case 3:
                    imprimirSevensCategoria("Volador");
                    break;
                case 4:
                    imprimirSevensCategoria("Inmortal");
                    break;
                case 5:
                    imprimirSevensCategoria("Manipulacion de Energia");
                    break;
                case 6:
                    imprimirSevensCategoria("Habilidad Mental");
                    break;
                case 7:
                    imprimirSevensCategoria("Transformacion");
                    break;
                case 8:
                    imprimirSevensCategoria("Manipulacion Material");
                    break;
                case 9:
                    imprimirSevensCategoria("Veloz");
                    break;
                case 10:
                    imprimirSevensCategoria("Habilidad con Animales");
                    break;
                case 11:
                    menuImpl.imprimirTexto("⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⠕⠕⠕⠕⢕⢕\n" +
                            "⢕⢕⢕⢕⢕⠕⠕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⠕⠁⣁⣠⣤⣤⣤⣶⣦⡄⢑\n" +
                            "⢕⢕⢕⠅⢁⣴⣤⠀⣀⠁⠑⠑⠁⢁⣀⣀⣀⣀⣘⢻⣿⣿⣿⣿⣿⡟⢁⢔\n" +
                            "⢕⢕⠕⠀⣿⡁⠄⠀⣹⣿⣿⣿⡿⢋⣥⠤⠙⣿⣿⣿⣿⣿⡿⠿⡟⠀⢔⢕\n" +
                            "⢕⠕⠁⣴⣦⣤⣴⣾⣿⣿⣿⣿⣇⠻⣇⠐⠀⣼⣿⣿⣿⣿⣿⣄⠀⠐⢕⢕\n" +
                            "⠅⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠐⢕\n" +
                            "⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠐\n" +
                            "⢄⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄ADIOS⠄⣿⣿⣿⣿⡆\n" +
                            "⢕⢔⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                            "⢕⢕⢄⠈⠳⣶⣶⣶⣤⣤⣤⣤⣭⡍⢭⡍⢨⣯⡛⢿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                            "⢕⢕⢕⢕⠀⠈⠛⠿⢿⣿⣿⣿⣿⣿⣦⣤⣿⣿⣿⣦⣈⠛⢿⢿⣿⣿⣿⣿\n" +
                            "⢕⢕⢕⠁⢠⣾⣶⣾⣭⣖⣛⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡆⢸⣿⣿⣿⡟\n" +
                            "⢕⢕⠅⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠈⢿⣿⣿⡇\n" +
                            "⢕⠕⠀⠼⠟⢉⣉⡙⠻⠿⢿⣿⣿⣿⣿⣿⡿⢿⣛⣭⡴⠶⠶⠂⠀⠿⠿⠇\n");
                    break;
                default:
                    menuImpl.imprimirTexto("⠄⠄⠄⠄⠄⣠⣤⣤⣤⣄⡀⠄⠄⠄⢀⣤⣶⣶⣤⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                            "⠄⠄⠄⢠⣾⣿⣿⠿⢿⣿⣷⣀⣀⣠⣿⣿⣿⠿⣿⣿⣦⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                            "⠄⠄⠄⠘⣿⣿⣿⣤⣼⣿⣿⣿⣿⣿⣿⣿⣧⣤⣿⣿⣿⢀⡀⢰⣦⢀⣠⡀⠄⠄\n" +
                            "⠄⠄⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣾⣿⢸⣿⢸⣿⡇⣶⡄\n" +
                            "⠄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⢸⣿⢸⣿⡇⣿⡇\n" +
                            "⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⢸⣿⢸⣿⡇⣿⡇\n" +
                            "⠄⣿⣿⣿⡿⠫⠭⠶⢦⣭⣭⣭⣭⣭⣭⣭⣭⢱⣬⡙⢣⣿⣿⣿⣿⣿⣿⣧⣿⠃\n" +
                            "⣀⢸⣿⣿⣷⣬⣝⣛⣒⣒⣒⣒⣒⣒⡒⠢⠭⠤⢹⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⠄\n" +
                            "⣿⣦⡻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄\n" +
                            "⣿⣿⣿⣶⣍⡛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢟⣓⣘⠿⣿⣿⣿⣿⡿⠿⠿⠋⠄\n" +
                            "⠄DIGITA CORRECTAMENTE LOS NUMEROS⠄⠄⠄\n");
            }
        } while(opcion != 11);
    }
    private void imprimirTodosSevens() {
        menuImpl.imprimirSevens(sevens);
    }
    private void imprimirSevensCategoria(String categoria) {
        List<TheSevenImpl> sevensFiltrados = new ArrayList<>();
        for (TheSevenImpl theSevenImpl : sevens) {
            if (theSevenImpl.getCategoria().contains(categoria)) {
                switch (categoria) {
                    case "Fuerte" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Volador" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Inmortal" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Manipulacion de Energia" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Habilidad Mental" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Transformacion" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Manipulacion Material" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Veloz" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Habilidad con Animales" ->
                            sevensFiltrados.add(new TheSevenImpl(theSevenImpl.getNombre(), Collections.singletonList(categoria)));
                    default -> sevensFiltrados.add(theSevenImpl);
                }
            }
        }
        menuImpl.imprimirSevens(sevensFiltrados);
    }
}
