package com.accenture.franquicias.models.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FranquiciaUpdateDto {
    @NotNull(message = "El idFranquicia es obligatorio")
    @Positive(message = "El idFranquicia debe ser un número positivo mayor a 0")
    private Integer idFranquicia;

    @NotNull(message = "El nombreFranquicia es obligatorio")
    @NotBlank(message = "El nombreFranquicia no puede estar vacío")
    @Size(max=1000, message ="El nombreFranquicia no puede superar los 1000 caracteres")
    private String nombreFranquicia;
}
