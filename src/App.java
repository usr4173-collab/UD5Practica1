import net.salesianos.Videojuego;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

/*Esta es la clase principal del programa, gestiona el menú
y las funcionalidades del sistema del ranking de videojuegos. */
public class App {

    static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        int opcion = 0;

        while (opcion != 4) {

            String opcionTexto = JOptionPane.showInputDialog(
                    "1- Añadir videojuego\n" +
                            "2- Ver videojuegos\n" +
                            "3- Eliminar videojuego\n" +
                            "4- Salir del programa");

            opcion = Integer.parseInt(opcionTexto);

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog(
                            "Introduce el nombre:");

                    String genero = JOptionPane.showInputDialog(
                            "Introduce el género:");

                    String plataforma = JOptionPane.showInputDialog(
                            "Introduce la plataforma:");

                    int puntuacion = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce la puntuacion:")

                    );

                    while (puntuacion < 1 || puntuacion > 5) {

                        puntuacion = Integer.parseInt(

                                JOptionPane.showInputDialog(

                                        "La puntuacion debe estar entre 1 y 5"

                                )

                        );

                    }

                    Videojuego usuarioJuego = new Videojuego(nombre, genero, plataforma, puntuacion);
                    listaVideojuegos.add(usuarioJuego);

                    JOptionPane.showMessageDialog(
                            null,
                            "Videojuego añadido.");

                    break;

                case 2:

                    if (listaVideojuegos.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "No hay videojuegos aún.");
                    } else {

                        /*
                         * Investigué sobre cómo comparar y ordenar la lista sin escribir tanto código
                         * y podemos hacerlo importando las librerías Collection y Comparator
                         */

                        Collections.sort(listaVideojuegos, Comparator.comparing(Videojuego::getPuntuacion).reversed());

                        String lista = "";

                        for (Videojuego juego : listaVideojuegos) {
                            lista += juego + "\n";
                        }

                        JOptionPane.showMessageDialog(null, lista);
                    }

                    break;

                case 3: {

                    if (listaVideojuegos.isEmpty()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No hay videojuegos para eliminar.");

                    } else {

                        String lista = "";

                        for (int i = 0; i < listaVideojuegos.size(); i++) {

                            lista += i + " - " +
                                    listaVideojuegos.get(i).getNombre()
                                    + "\n";

                        }

                        int juego = Integer.parseInt(

                                JOptionPane.showInputDialog(

                                        lista +
                                                "Introduce el numero del juego:"

                                )

                        );

                        if (juego >= 0 &&
                                juego < listaVideojuegos.size()) {

                            listaVideojuegos.remove(juego);

                            JOptionPane.showMessageDialog(null, "Se ha eliminado.");

                        } else {

                            JOptionPane.showMessageDialog(null, "Numero no valido.");
                        }

                    }

                    break;
                }
                case 4:

                    JOptionPane.showMessageDialog(null, "Saliendo...");

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        }

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
