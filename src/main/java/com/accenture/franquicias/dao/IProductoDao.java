package com.accenture.franquicias.dao;

import com.accenture.franquicias.models.dto.ProductoFranquiciaSucursalGetDto;
import com.accenture.franquicias.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoDao {
    List<Producto> getAll();
    Optional<Producto> getById(Integer idProducto);
    Optional<List<ProductoFranquiciaSucursalGetDto>> obtenerProductosMaxStock(Integer idFranquicia);
    Optional<List<Producto>> getByIdSucursal(Integer idSucursal);
    Producto update(Producto producto);
    Producto createOne(Producto producto);
    void delete(Producto producto);
}
