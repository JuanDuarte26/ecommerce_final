package com.example.ecommerce_final.service;


import com.example.ecommerce_final.entity.Usuarios;
import com.example.ecommerce_final.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public void setUsuarioRepository(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuarios guardarUsuarios(Usuarios usuarios){
        return this.usuarioRepository.save(usuarios);
    }

    public List<Usuarios> buscarUsuarios(){
        List<Usuarios> usuarios = this.usuarioRepository.findAll();
        return usuarios;
    }
    public Optional<Usuarios> buscarUsuariosId(Long id){
        return this.usuarioRepository.findById(id);
    }

}
