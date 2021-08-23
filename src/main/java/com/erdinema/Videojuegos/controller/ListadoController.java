/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erdinema.Videojuegos.controller;

import com.erdinema.Videojuegos.domain.VideoJuego;
import com.erdinema.Videojuegos.sevice.VideojuegosServices;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ListadoController {
    
    private final VideojuegosServices videojuegosServices;

    public ListadoController(VideojuegosServices videojuegosServices) {
        this.videojuegosServices = videojuegosServices;
    }
    
    @RequestMapping("/")
    public String ListadoVideojuegos(Model model){
        
        List<VideoJuego> juegos = videojuegosServices.buscarDestacados();
        
        model.addAttribute("videojuegos", juegos);
        
        
        return "listado";
    }
}
