/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erdinema.Videojuegos.sevice;

import com.erdinema.Videojuegos.domain.VideoJuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author necul
 */
@Service
public class VideojuegosServices {

    public List<VideoJuego> buscarDestacados() {
        List<VideoJuego> listaVideojuego = new ArrayList<>();

        VideoJuego juego = new VideoJuego();

        juego.setNombre("Resident Evil 4");
        juego.setDescripcion("Descripcion del videojuego Resident Evil 4");
        juego.setImagenURL("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2017/02/resident-evil-4-caratula.jpg?itok=8QPdHbqP");
        listaVideojuego.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Rocket League");
        juego.setDescripcion("Descripcion del videojuego Resident Evil 4");
        juego.setImagenURL("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2017/02/rocket-league-caratula.jpg?itok=PLma1G8B");
        listaVideojuego.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Borderland 3");
        juego.setDescripcion("Descripcion del videojuego Resident Evil 4");
        juego.setImagenURL("https://static.posters.cz/image/1300/posters/borderlands-3-cover-i76366.jpg");
        listaVideojuego.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Resident Evil 4");
        juego.setDescripcion("Descripcion del videojuego Resident Evil 4");
        juego.setImagenURL("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2017/02/resident-evil-4-caratula.jpg?itok=8QPdHbqP");
        listaVideojuego.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Resident Evil 4");
        juego.setDescripcion("Descripcion del videojuego Resident Evil 4");
        juego.setImagenURL("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2017/02/resident-evil-4-caratula.jpg?itok=8QPdHbqP");
        listaVideojuego.add(juego);

        return listaVideojuego;
    }

}
