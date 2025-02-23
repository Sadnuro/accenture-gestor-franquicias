package com.accenture.franquicias.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="franquicias")
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_franquicia")
    private int idFranquicia;

    @NotNull
    @Column(name = "nombre_franquicia", length = 1000) // Longitud máxima en la base de datos
    @Size(max = 1000, message = "El nombre de la sucursal no puede tener más de 1000 caracteres") // Validación en la aplicación
    private String nombreFranquicia;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;
}
