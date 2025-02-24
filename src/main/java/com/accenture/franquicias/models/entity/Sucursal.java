package com.accenture.franquicias.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucursal")
    private int idSucursal;

    @NotNull
    @NotBlank
    @Size(max = 1000, message = "El nombre de la sucursal no puede tener más de 1000 caracteres") // Validación en la aplicación
    @Column(name = "nombre_sucursal", length = 1000) // Longitud máxima en la base de datos
    private String nombreSucursal;

    // Campo solo de consulta. Transaccion sobre el campo se maneja en Objeto Franquicia
    @Column(name = "id_franquicia", insertable = false, updatable = false)
    private int idFranquicia;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;

    @ManyToOne
    @JoinColumn(name="id_franquicia", referencedColumnName = "id_franquicia", foreignKey = @ForeignKey(name = "fk_franquicia"))
    private Franquicia franquicia;
}
