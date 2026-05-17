import net.salesianos.Videojuego;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner usuario = new Scanner(System.in);

        /*System.out.println("Vamos a buscar un videojuego, ");
        System.out.println("introduce el nombre: ");
        String nombre = usuario.nextLine();

        System.out.println("Introduce el género: ");
        String genero = usuario.nextLine();

        System.out.println("Introduce la plataforma: ");
        String plataforma = usuario.nextLine();

        System.out.println("Introduce la puntuación: ");
        String puntuacion = usuario.nextLine();*/

        Videojuego videojuego1 = new Videojuego("The Last Of Us II", "Terror de supervivencia", "PS4", 9);
        listaVideojuegos.add(videojuego1);

        for (Videojuego v : listaVideojuegos) {
            System.out.println(v);
        }
    }

}
