package com.accenture.franquicias.models.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductoGetDto {
    private Integer idProducto;
    private String nombreProducto;
    private Integer idSucursal;
    private Integer stock;
    private LocalDateTime fechaCreacion;
}
