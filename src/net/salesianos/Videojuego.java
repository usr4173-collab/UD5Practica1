package net.salesianos;

public class Videojuego {
    
    private String nombre;
    private String genero;
    private String plataforma;
    private int puntuacion;

    public Videojuego() {}

    public Videojuego(String nombre, String genero, String plataforma, int puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

@Override
public String toString() {
    return "Nombre: " + nombre + "\nGenero: " + genero +
    "\nPlataforma: " + plataforma + "\nPuntuacion: " + puntuacion;
}

}
