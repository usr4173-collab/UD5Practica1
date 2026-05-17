import net.salesianos.Videojuego;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/*Esta es la clase principal del programa, gestiona el menú
y las funcionalidades del sistema del ranking de videojuegos. */
public class App {

    static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner usuario = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("-OPCIONES-");
            System.out.println("1- Añadir videojuego");
            System.out.println("2-Ver videojuegos");
            System.out.println("3-Eliminar videojuego");
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

                    while (!usuario.hasNextInt()) {
                        System.out.println("Introduce un número válido");
                        usuario.next(); // Esto valida que el usuario escriba si o si un número y no rompa el programa
                    }

                    int puntuacion = usuario.nextInt();
                    usuario.nextLine();

                    while (puntuacion < 1 || puntuacion > 5) {

                        System.out.println(
                                "La puntuacion debe estar entre 1 y 5");

                        puntuacion = usuario.nextInt();
                        usuario.nextLine();

                    }

                    Videojuego usuarioJuego = new Videojuego(nombre, genero, plataforma, puntuacion);
                    listaVideojuegos.add(usuarioJuego);

                    System.out.println("Videojuego añadido.");

                    break;

                case 2:

                    if (listaVideojuegos.isEmpty()) {
                        System.out.println("No hay videojuegos aún.");
                    } else {

                        /*
                         * Investigué sobre cómo comparar y ordenar la lista sin escribir tanto código
                         * y podemos hacerlo importando las librerías Collection y Comparator
                         */

                        Collections.sort(listaVideojuegos, Comparator.comparing(Videojuego::getPuntuacion).reversed());

                        for (Videojuego juego : listaVideojuegos) {
                            System.out.println(juego);
                        }
                    }

                    break;

                case 3: {

                    if (listaVideojuegos.isEmpty()) {

                        System.out.println(
                                "No hay videojuegos para eliminar.");

                    } else {
                        for (int i = 0; i < listaVideojuegos.size(); i++) {
                            System.out.println(i + " - " + listaVideojuegos.get(i).getNombre());
                        }

                        System.out.println("Introduce el número del juego que quieres borrar");

                        while (!usuario.hasNextInt()) {

                            System.out.println("Error. Introduce un numero valido:");

                            usuario.next();

                        }

                        int juego = usuario.nextInt();
                        usuario.nextLine();

                        if (juego >= 0 &&
                                juego < listaVideojuegos.size()) {

                            listaVideojuegos.remove(juego);

                            System.out.println(
                                    "Se ha eliminado.");

                        } else {

                            System.out.println(
                                    "Número no valido.");

                        }

                    }

                    break;
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
