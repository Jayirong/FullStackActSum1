package com.pelis.main;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PeliculaController {
    //se crea la lista a llenar
    private List<Pelicula> peliculas = new ArrayList<>();

    //se construye el controlador
    public PeliculaController(){
        //iniciamos el llenado de datos para la lista

        peliculas.add(new Pelicula(1, "El caballo y la rata perdida", 1903, "Tutankamon", "Comedia", "Se trata de un chichon que le dio un caballo a una rata"));
        peliculas.add(new Pelicula(2, "El chico rata", 2000, "Tony Stark", "Tristeza", "Se trata de un nino que se la pasa jugando maincraf y al final se mete dentro"));
        peliculas.add(new Pelicula(3, "El pepe", 1940, "Clarence", "Terror", "Una persona que fue a un banno que estaba lleno de pepes borrachos que lo querian atacar"));
        peliculas.add(new Pelicula(4, "El Joseju mata al Juja", 1, "Jujalaj", "Accion", "El Juja taba jugando en un mundo y de la nada un Joseju lo mata en Skyrim"));
        peliculas.add(new Pelicula(5, "El pepe 2: Electric Boogaloo", 2040, "Amiguito", "Accion-terror", "Los pepes evolucionaron a pepos, forzando a un pepe a cobrar consciencia de su ser y revelarse contra los pepos ayudando a la humanidad"));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
    
}
