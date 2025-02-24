package com.accenture.franquicias.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductoCreateDto {
    @NotNull(message = "El nombreProducto es obligatorio")
    @NotBlank(message = "El nombreProducto no puede estar vacío")
    @Size(max = 1000, message = "El nombre del producto no puede tener más de 1000 caracteres")
    private String nombreProducto;

//    @NotNull(message = "El idFranquicia es obligatorio")
//    @Positive(message = "El idFranquicia debe ser un número positivo mayor a 0")
    private int stock;

    @NotNull(message = "El idFranquicia es obligatorio")
    @Positive(message = "El idFranquicia debe ser un número positivo mayor a 0")
    private int idSucursal;
}