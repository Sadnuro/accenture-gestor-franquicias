package com.accenture.franquicias.services;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Producto> getAll();
    Producto getById(Integer idProducto);
    List<ProductoGetForSucursalDto> getByIdSucursal (Integer idSucursal);
    List<ProductoFranquiciaSucursalGetDto> obtenerProductosMaxStock(Integer idFranquicia);
    Producto update(ProductoUpdateDto productoDto);
    Producto createOne(ProductoCreateDto productoDto);
    void delete(Integer idProducto);
}
