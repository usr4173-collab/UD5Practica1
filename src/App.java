import net.salesianos.Videojuego;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner usuario = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("-OPCIONES-");
            System.out.println("1- Añadir videojuego");
            System.out.println("2-Ver videojuegos");
            System.out.println("3-Ver videojuegos");
            System.out.println("4- Salir del programa");

            opcion = usuario.nextInt();
            usuario.nextLine();

            switch (opcion) {
                case 1: 
                    System.out.println("Vamos a buscar un videojuego, ");
                    System.out.println("introduce el nombre: ");
                    String nombre = usuario.nextLine();

                    System.out.println("Introduce el género: ");
                    String genero = usuario.nextLine();

                    System.out.println("Introduce la plataforma: ");
                    String plataforma = usuario.nextLine();

                    System.out.println("Introduce la puntuación: ");
                    int puntuacion = usuario.nextInt();

                    Videojuego usuarioJuego = new Videojuego(nombre, genero, plataforma, puntuacion);
                    listaVideojuegos.add(usuarioJuego);

                    System.out.println("Videojuego añadido.");

                    break;
                
                case 2:

                    for (Videojuego juego : listaVideojuegos) {
                        System.out.println(juego);
                    }

                case 3: {
                    
                }
                
                    case 4:
                        System.out.println("Saliendo...");

                        break;

                default:
                    System.out.println("Opción  no válida.");
            }
        }
        
        usuario.close();

        /*
         * Videojuego videojuego1 = new Videojuego("The Last Of Us II",
         * "Terror de supervivencia", "PS4", 9);
         * listaVideojuegos.add(videojuego1);
         * 
         * for (Videojuego v : listaVideojuegos) {
         * System.out.println(v);
         * }
         */
    }

}
