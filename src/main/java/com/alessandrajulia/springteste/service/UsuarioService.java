package com.alessandrajulia.springteste.service;

import com.alessandrajulia.springteste.model.Usuario;
import com.alessandrajulia.springteste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;
    
    public Usuario findById(Long id){
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
