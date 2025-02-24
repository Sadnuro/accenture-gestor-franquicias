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
public class SucursalGetForFranquiciaDto {
    private int idSucursal;
    private String nombreSucursal;
}
