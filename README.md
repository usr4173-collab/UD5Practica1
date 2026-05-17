# Ranking de Videojuegos

## Descripción

Aplicación desarrollada en Java que permite gestionar un sistema de ranking de videojuegos.

- Añadir videojuegos
- Mostrar videojuegos
- Eliminar videojuegos
- Ordenar videojuegos por puntuación

La aplicación utiliza la librería Swing (`JOptionPane`) para la interacción con el usuario.

## Características

Cada videojuego contiene:

- Nombre
- Género
- Plataforma
- Puntuación

Los videojuegos se almacenan en un `ArrayList` 

## Funcionalidades

### Añadir videojuego
Permite introducir un nuevo videojuego con sus datos.

### Ver videojuegos
Muestra todos los videojuegos ordenados por puntuación de mayor a menor.

### Eliminar videojuego
Permite eliminar videojuegos seleccionando su índice.

### Validaciones
El programa controla:
- Puntuaciones fuera del rango 1-5
- Índices inválidos
- Opciones incorrectas

## Tecnologías utilizadas

- Java
- Swing (`JOptionPane`)
- ArrayList
- Git y GitHub


## Cómo ejecutar el programa

1. Abrir el proyecto en Visual Studio Code o cualquier IDE compatible con Java.
2. Ejecutar la clase `App`.
3. Utilizar el menú interactivo para gestionar videojuegos.