package com.accenture.franquicias.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="productos")
public class Producto {
    @Id
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "nombre_producto")
    private int nombreProducto;

//    @Column(name = "id_sucursal")
//    private int idSucursal;

    @Column(name = "fecha_creacion")
    private int fechaCreacion;

    @Column(name = "fecha_modificacion")
    private int fechaModificacion;

    @ManyToOne
    @JoinColumn(name="id_sucursal", referencedColumnName = "id_sucursal", foreignKey = @ForeignKey(name = "fk_sucursal"))
    private Sucursal sucrusal;
}