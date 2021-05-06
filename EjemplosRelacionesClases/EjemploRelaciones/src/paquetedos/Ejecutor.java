/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Se crea un objeto de tipo Autor
        Autor aut = new Autor("José", "Alvear");

        // Se crea un objeto de tipo Publicación
        int anioPublicacion = 2000;

        Publicacion p = new Publicacion(aut, anioPublicacion);

        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion());
        aut.establecerApellido("Elizalde");
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion());

        /*Publicacion libro2 =new Publicacion(new Autor("Luis", "Jácome"), 1980);
       System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                libro2.obtenerAutor().obtenerNombre(),
                libro2.obtenerAutor().obtenerApellido(),
                libro2.obtenerAnioPublicacion());*/
        //xxxxxxxxxxxxx
        /*Autor aut1 = new Autor();
        aut1.establecerNombre("Pablo");
        aut1.establecerApellido("Neruda");
        Publicacion p3 = new Publicacion();
        p3.establecerAnioPublicacion(2020);
        p3.establecerAutor(aut1);
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p3.obtenerAutor().obtenerNombre(),
                p3.obtenerAutor().obtenerApellido(),
                p3.obtenerAnioPublicacion());*/

    }
}
