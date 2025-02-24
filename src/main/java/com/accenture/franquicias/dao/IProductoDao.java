package com.accenture.franquicias.dao;


import com.accenture.franquicias.models.dto.ProductoCreateDto;
import com.accenture.franquicias.models.dto.ProductoUpdateDto;
import com.accenture.franquicias.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoDao {
    List<Producto> getAll();
    Optional<Producto> getById(Integer idProducto);
    Producto update(Producto producto);
    Producto createOne(Producto producto);
    void delete(Producto producto);
}
