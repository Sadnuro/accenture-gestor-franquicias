package com.accenture.franquicias.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FranquiciaCreateDto {
    @NotNull(message = "El nombreFranquicia es obligatorio")
    @NotBlank(message = "El nombreFranquicia no puede estar vacío")
    @Size(max=1000, message ="El nombreFranquicia no puede superar los 1000 caracteres")
    private String nombreFranquicia;
}
