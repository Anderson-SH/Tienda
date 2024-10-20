
package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    
    @RequestMapping("/listado")
    public String Inicio(Model model) {
        List <Categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias",lista);
        model.addAttribute("TotalCategorias",lista.size());
        return "/categoria/listado";
    }
    
}
