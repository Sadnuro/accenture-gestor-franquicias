package com.accenture.franquicias.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="franquicias")
public class Franquicia {
    @Id
    @Column(name = "id_franquicia")
    private int idFranquicia;

    @Column(name = "nombre_franquicia")
    private int nombreFranquicia;

    @Column(name = "fecha_creacion")
    private int fechaCreacion;

    @Column(name = "fecha_modificacion")
    private int fechaModificacion;
}
