package com.accenture.franquicias.dao;

import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.entity.Sucursal;

import java.util.List;
import java.util.Optional;

public interface ISucursalDao {
    List<Sucursal> getAll();
    Optional<Sucursal> getById(Integer Id);
    Sucursal update(Sucursal sucursal);
    Sucursal createOne(Sucursal sucursal);
    void delete(Integer idSucursal);
}
