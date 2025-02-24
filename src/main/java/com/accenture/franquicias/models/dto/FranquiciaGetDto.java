package com.accenture.franquicias.models.dto;

import com.accenture.franquicias.models.entity.Sucursal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FranquiciaGetDto {
    private Integer idFranquicia;
    private String nombreFranquicia;
    private LocalDateTime fechaCreacion;
    private List<SucursalGetForFranquiciaDto> sucursales;
}