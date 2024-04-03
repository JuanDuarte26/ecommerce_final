package com.example.ecommerce_final.service.auth;

import com.example.ecommerce_final.dto.SignupDTO;
import com.example.ecommerce_final.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
