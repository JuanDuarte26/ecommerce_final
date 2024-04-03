package com.example.ecommerce_final.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component

public class UsuarioDto {

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;
}
