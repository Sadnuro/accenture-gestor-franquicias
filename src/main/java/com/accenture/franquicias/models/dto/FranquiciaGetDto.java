package com.accenture.franquicias.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FranquiciaGetDto {
    private Integer idFranquicia;
    private String nombreFranquicia;
    private Date fechaCreacion;
}