package com.example.ecommerce_final.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component

public class ResponseDto {
    private Boolean status;
    private String detail;
    private Object response;


}
