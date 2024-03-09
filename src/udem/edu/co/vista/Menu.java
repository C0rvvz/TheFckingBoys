package udem.edu.co.vista;

import udem.edu.co.modelo.Impl.TheSevenImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private boolean menuMostrado = false;
    private List<TheSevenImpl> sevens;

    public Menu(List<TheSevenImpl> sevens) {
        this.scanner = new Scanner(System.in);
        this.menuMostrado = menuMostrado;
        this.sevens = sevens;
    }

    public void listarTexto(String texto) {
        System.out.println(texto);
    }

    public void listarSevens() {
        System.out.println("   ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven Disponibles ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        for (TheSevenImpl seven : sevens) {
            System.out.println(seven.getNombre() + " ⠄⠄⠄:> " + seven.getCategoria());
        }
    }

    private void listarSevensCategoria(String categoria) {
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

        listarSevens();
    }

    public int listarMenu() {
        if (!menuMostrado) {
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⣠⣴⣶⣿⣿⡿⠶⠄⠄⠄⠄⠐⠒⠒⠲⠶⢄⠄⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠄⠄⣠⣾⡿⠟⠋⠁⠄⢀⣀⡀⠤⣦⢰⣤⣶⢶⣤⣤⣈⣆⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠄⢰⠟⠁⠄⢀⣤⣶⣿⡿⠿⣿⣿⣊⡘⠲⣶⣷⣶⠶⠶⠶⠦⠤⡀⠄⠄\n" +
                    "⠄⠔⠊⠁⠁⠄⠄⢾⡿⣟⡯⣖⠯⠽⠿⠛⠛⠭⠽⠊⣲⣬⠽⠟⠛⠛⠭⢵⣂⠄\n" +
                    "⡎⠄⠄⠄⠄⠄⠄⠄⢙⡷⠋⣴⡆⠄⠐⠂⢸⣿⣿⡶⢱⣶⡇⠄⠐⠂⢹⣷⣶⠆\n" +
                    "⡇⠄⠄⠄⠄⣀⣀⡀⠄⣿⡓⠮⣅⣀⣀⣐⣈⣭⠤⢖⣮⣭⣥⣀⣤⣤⣭⡵⠂⠄\n" +
                    "⣤⡀⢠⣾⣿⣿⣿⣿⣷⢻⣿⣿⣶⣶⡶⢖⣢⣴⣿⣿⣟⣛⠿⠿⠟⣛⠉⠄⠄⠄\n" +
                    "⣿⡗⣼⣿⣿⣿⣿⡿⢋⡘⠿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠄⠄\n" +
                    "⣿⠱⢿⣿⣿⠿⢛⠰⣞⡛⠷⣬⣙⡛⠻⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⠿⠛⣓⡀⠄\n" +
                    "⢡⣾⣷⢠⣶⣿⣿⣷⣌⡛⠷⣦⣍⣛⠻⠿⢿⣶⣶⣶⣦⣤⣴⣶⡶⠾⠿⠟⠁⠄\n" +
                    "⣿⡟⣡⣿⣿⣿⣿⣿⣿⣿⣷⣦⣭⣙⡛⠓⠒⠶⠶⠶⠶⠶⠶⠶⠶⠿⠟⠄⠄⠄\n" +
                    "⠿⡐⢬⣛⡻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡶⠟⠃⠄⠄⠄⠄⠄⠄\n" +
                    "⣾⣿⣷⣶⣭⣝⣒⣒⠶⠬⠭⠭⠭⠭⠭⠭⠭⣐⣒⣤⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠄⠄⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven ⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        }
            System.out.println("1. | Todos los supers que aun no se los lleva el chamuco |");
            System.out.println("2. | Supers con mucha fuerza                             |");
            System.out.println("3. | Supers que vuelan mucho                             |");
            System.out.println("4. | Supers que son practicamente inmortales             |");
            System.out.println("5. | Supers que pueden manipular la energy               |");
            System.out.println("6. | Supers que manipulan los cerebelos o Telepatia      |");
            System.out.println("7. | Supers que se cambian de forma o se transforman     |");
            System.out.println("8. | Supers con la manipulacion de la candela            |");
            System.out.println("9. | Supers que corren mucho                             |");
            System.out.println("10.| Supers que controlan animales o los pescaos         |");
            System.out.println("11.| Chao con Dios                                       |\n");
            System.out.print("Elija un numero parcero, se le tiene lo mas agogo de codigo limpio: ");
            menuMostrado = true;
        return scanner.nextInt();
    }

    public void correrPrograma() {
        int opcion;
        do {
            opcion = listarMenu();
            switch (opcion) {
                case 1:
                    listarSevens();
                    break;
                case 2:
                    listarSevensCategoria("Fuerte");
                    break;
                case 3:
                    listarSevensCategoria("Volador");
                    break;
                case 4:
                    listarSevensCategoria("Inmortal");
                    break;
                case 5:
                    listarSevensCategoria("Manipulacion de Energia");
                    break;
                case 6:
                    listarSevensCategoria("Habilidad Mental");
                    break;
                case 7:
                    listarSevensCategoria("Transformacion");
                    break;
                case 8:
                    listarSevensCategoria("Manipulacion Material");
                    break;
                case 9:
                    listarSevensCategoria("Veloz");
                    break;
                case 10:
                    listarSevensCategoria("Habilidad con Animales");
                    break;
                case 11:
                    listarTexto("⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⠕⠕⠕⠕⢕⢕\n" +
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
                    listarTexto("⠄⠄⠄⠄⠄⣠⣤⣤⣤⣄⡀⠄⠄⠄⢀⣤⣶⣶⣤⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
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
        }

        while(opcion != 11);
    }
}
