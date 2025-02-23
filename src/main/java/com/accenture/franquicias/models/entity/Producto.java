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
@Table(name="productos")
public class Producto {
    @Id
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "nombre_producto", length = 1000) // Longitud máxima en la base de datos
    @Size(max = 1000, message = "El nombre del producto no puede tener más de 1000 caracteres") // Validación en la aplicación
    private String nombreProducto;

    @Column(name = "sctock")
    private int stock;

//    @Column(name = "id_sucursal")
//    private int idSucursal;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @ManyToOne
    @JoinColumn(name="id_sucursal", referencedColumnName = "id_sucursal", foreignKey = @ForeignKey(name = "fk_sucursal"))
    private Sucursal sucrusal;
}