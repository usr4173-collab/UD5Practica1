import net.salesianos.Videojuego;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a buscar un videojuego, ");
        System.out.println("introduce el nombre: ");
        String nombre = usuario.nextLine();

        System.out.println("Introduce el género: ");
        String genero = usuario.nextLine();

        System.out.println("Introduce la plataforma: ");
        String plataforma = usuario.nextLine();

        System.out.println("Introduce la puntuación: ");
        String puntuacion = usuario.nextLine();
        
    }
    
    
}
