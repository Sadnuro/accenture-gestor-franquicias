package com.accenture.franquicias.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SucursalGetDto {
    private int idSucursal;
    private String nombreSucursal;
    private Integer idFranquicia;
    private LocalDateTime fechaCreacion;
}
