package com.example.ecommerce_final.controller;

import com.example.ecommerce_final.dto.ResponseDto;
import com.example.ecommerce_final.dto.UsuarioDto;
import com.example.ecommerce_final.entity.Usuarios;
import com.example.ecommerce_final.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public void setUsuarioService (UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/clientes")
    public ResponseEntity<?> guardarUsuarios(@RequestBody UsuarioDto usuarioDto){
        Usuarios usuarios = Usuarios.builder()
                .nombre(usuarioDto.getNombre())
                .apellido(usuarioDto.getApellido())
                .email(usuarioDto.getEmail())
                .telefono(usuarioDto.getTelefono())
                .build();
        this.usuarioService.guardarUsuarios(usuarios);

        return new ResponseEntity<>(new ResponseDto(true, "Exitoso",usuarios), HttpStatus.OK);

    }

    @GetMapping(value = "/tabla")
    public List<Usuarios> tablaClientes(){
        List<Usuarios> usuarios = this.usuarioService.buscarUsuarios();
        return usuarios;
    }

    @GetMapping(value = "/busqueda/{id}")
    public Optional<Usuarios> tablaClientesId(@PathVariable Long id){
        Optional<Usuarios> usuarios = this.usuarioService.buscarUsuariosId(id);
        return usuarios;
    }
}