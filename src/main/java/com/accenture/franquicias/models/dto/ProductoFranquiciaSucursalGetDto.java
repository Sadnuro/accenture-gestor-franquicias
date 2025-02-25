package com.accenture.franquicias.models.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductoFranquiciaSucursalGetDto {
    private Integer idFranquicia;
    private String nombreFranquicia;
    private Integer idSucursal;
    private String nombreSucursal;
    private Integer idProducto;
    private String nombreProducto;
    private Integer stock;
}
