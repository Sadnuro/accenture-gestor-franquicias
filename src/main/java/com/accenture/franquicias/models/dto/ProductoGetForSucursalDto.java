package com.accenture.franquicias.models.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductoGetForSucursalDto {
    private Integer idProducto;
    private String nombreProducto;
    private Integer stock;
}
