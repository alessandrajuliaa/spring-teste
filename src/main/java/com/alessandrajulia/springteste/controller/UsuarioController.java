package com.alessandrajulia.springteste.controller;

import com.alessandrajulia.springteste.model.Usuario;
import com.alessandrajulia.springteste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") Long id){
        Usuario obj = this.service.findById(id);
        return obj;
    }
}
