package com.accenture.franquicias.models.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
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
public class SucursalUpdateDto {
    @NotNull(message = "El idSucursal es obligatorio")
    @Positive(message = "El idSucursal debe ser un número positivo mayor a 0")
    private int idSucursal;

    @NotNull(message = "El nombreSucursal es obligatorio")
    @NotBlank(message = "El nombreSucursal no puede estar vacío")
    @Size(max=1000, message ="El nombreSucursal no puede superar los 1000 caracteres")
    private String nombreSucursal;
}
