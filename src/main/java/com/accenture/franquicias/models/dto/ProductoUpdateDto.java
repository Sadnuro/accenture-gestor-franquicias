package com.accenture.franquicias.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL) // Evita que los valores nulos se serialicen
public class ProductoUpdateDto {
    @NotNull(message = "El idProducto es obligatorio")
    @Positive(message = "El idProducto debe ser un número positivo mayor a 0")
    private int idProducto;

//    @NotNull(message = "El nombreProducto es obligatorio")
//    @NotBlank(message = "El nombreProducto no puede estar vacío")
    @Size(max = 1000, message = "El nombre del producto no puede tener más de 1000 caracteres")
    private String nombreProducto;

    //    @NotNull(message = "El idFranquicia es obligatorio")
    //    @Positive(message = "El idFranquicia debe ser un número positivo mayor a 0")
    @Min(value = 0, message = "El stock debe ser un número entero ")
    private Integer stock;
}
