package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.Menu;
import udem.edu.co.modelo.Impl.TheSevenImpl;
import java.util.List;
import java.util.Scanner;

public class MenuImpl implements Menu {
    private Scanner scanner;
    private boolean menuMostrado = false;
    public MenuImpl() {
        this.scanner = new Scanner(System.in);
    }

    public int imprimirMenu() {
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

    public void imprimirSevens(List<TheSevenImpl> sevens) {
        System.out.println("   ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven Disponibles ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        for (TheSevenImpl seven : sevens) {
            System.out.println(seven.getNombre() + " ⠄⠄⠄:> " + seven.getCategoria());
        }
    }

    public void imprimirTexto(String texto) {
        System.out.println(texto);
    }
}
