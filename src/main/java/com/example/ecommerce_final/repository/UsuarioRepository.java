package com.example.ecommerce_final.repository;

import com.example.ecommerce_final.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {


}
