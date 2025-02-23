package com.accenture.franquicias.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SucursalCreateDto {
    @NotNull(message = "El nombreFranquicia es obligatorio")
    @NotBlank(message = "El nombreFranquicia no puede estar vacío")
    @Size(max=1000, message ="El nombreFranquicia no puede superar los 1000 caracteres")
    private String nombreSucursal;

    @NotNull(message = "El idFranquicia es obligatorio")
    @Positive(message = "El idFranquicia debe ser un número positivo mayor a 0")
    private Integer idFranquicia;
}
