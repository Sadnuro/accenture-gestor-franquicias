package com.accenture.franquicias.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="sucursales")
public class Sucursal {
    @Id
    @Column(name = "id_sucursal")
    private int idSucursal;

    @Column(name = "nombre_sucursal")
    private int nombreSucursal;

//    @Column(name = "id_franquicia")
//    private int idFranquicia;

    @Column(name = "fecha_creacion")
    private int fechaCreacion;

    @Column(name = "fecha_modificacion")
    private int fechaModificacion;

    @ManyToOne
    @JoinColumn(name="id_franquicia", referencedColumnName = "id_franquicia", foreignKey = @ForeignKey(name = "fk_franquicia"))
    private Franquicia franquicia;
}
