package com.accenture.franquicias.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="sucursales")
public class Sucursal {
    @Id
    @Column(name = "id_sucursal")
    private int idSucursal;

    @Column(name = "nombre_sucursal", length = 1000) // Longitud máxima en la base de datos
    @Size(max = 1000, message = "El nombre de la sucursal no puede tener más de 1000 caracteres") // Validación en la aplicación
    private String nombreSucursal;

//    @Column(name = "id_franquicia")
//    private int idFranquicia;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @ManyToOne
    @JoinColumn(name="id_franquicia", referencedColumnName = "id_franquicia", foreignKey = @ForeignKey(name = "fk_franquicia"))
    private Franquicia franquicia;
}
